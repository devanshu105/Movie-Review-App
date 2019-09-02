package com.movie.ws;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.Status;
import com.dao.User;
import com.dao.UsersRepository;

@RestController
@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE })

@RequestMapping("/movie")
public class UsersController {

	@Autowired
	private UsersRepository userRepo;

	@GetMapping("/view")
	public List<User> viewUsers(){
		List<User> userList = new ArrayList<User>();
		Iterable<User> iterable = userRepo.findAll();
		for (User user : iterable) {
			userList.add(user);
		}
		return userList;
	}

	@PostMapping("/signup")
	public User signup(HttpServletRequest req,@RequestBody User user) {

		User result = null;
		try {
			result = userRepo.save(user);

			if (result == null) {
				return null;
			}

			HttpSession session = req.getSession(true);
			session.setAttribute("emailId", result.getEmailId());
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	@PostMapping("/signin")
	public Status signin(HttpServletRequest req,@RequestBody User user) {
		User temp = userRepo.findByEmailId(user.getEmailId());
		if (temp == null) {
			return new Status(false);
		}
		if (temp.getPwd().equals(user.getPwd())) {
			HttpSession session = req.getSession(true);
			session.setAttribute("emailId", temp.getEmailId());
			return new Status(true);
		}
		return new Status(false);
	}

	@PostMapping("/signout")
	public Status logout(HttpServletRequest req) {
		HttpSession session = req.getSession(false);

		if(session!=null || session.getAttribute("emailId")!=null) {
			session.invalidate();
			return new Status(true);
		}
		return new Status(false);
	}

}

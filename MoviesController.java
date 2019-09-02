package com.movie.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dao.Movie;
import com.dao.MoviesRepository;

@RestController
@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,RequestMethod.DELETE })

@RequestMapping("/movies")
public class MoviesController {

	@Autowired
	private MoviesRepository movieRepo;
	
	@GetMapping("/viewMovies")
	public List<Movie> getMovies(){
		List<Movie> movieList = new ArrayList<>();
		Iterable<Movie> iterable = movieRepo.findAll();
		for (Movie movie : iterable) {
			movieList.add(movie);
		}
		return movieList;
	}
	
	@PostMapping("/addMovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieRepo.save(movie);
	}
	
}

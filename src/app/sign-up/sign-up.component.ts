import { Router } from '@angular/router';
import { AuthenticateService } from './../authenticate.service';
import { Status } from './../model/Status';
import { Component, OnInit } from '@angular/core';
import { UserSignup } from '../model/UserSignup';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  user: UserSignup
  successFlag: boolean
  errorFlag: boolean

  constructor(public authService: AuthenticateService, public router: Router) {
    this.initUser()
  }

  ngOnInit() {
  }

  signUpSubmit(signUpForm) {

    this.successFlag = false
    this.errorFlag = false

    this.authService.signUp(this.user)
      .subscribe((res: UserSignup) => {
        if (res !== null) {
          this.successFlag = true
          this.authService.loginStatus = true
          this.router.navigateByUrl('')
        }
        else {
          this.errorFlag = true
          this.authService.loginStatus = false
        }
      }, err => {
        console.log(err)
        this.errorFlag = true
        this.authService.loginStatus = false
      })
  }

  initUser() {
    this.user = {
      userId: 0,
      firstName: '',
      lastName: '',
      emailId: '',
      mobileNo: 0,
      pwd: ''
    }
  }

}

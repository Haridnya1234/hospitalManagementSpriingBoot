import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { PatientauthService } from 'src/app/service/patientauth.service';
@Component({
  selector: 'app-patientlogin',
  templateUrl: './patientlogin.component.html',
  styleUrls: ['./patientlogin.component.css']
})
export class PatientloginComponent implements OnInit {
  username = 'user'
  password = ''
  invalidLogin = false

  constructor(private router:Router, public loginservice: PatientauthService) { }

  ngOnInit(): void {
  }
  checkLogin() {
    if (this.loginservice.authenticate(this.username, this.password)
    ) {
      this.router.navigate(['home'])
      
      this.invalidLogin = false
    } else
    {
      this.invalidLogin = true
      alert("Wrong Credentials");
      this.router.navigate(['home'])
    }   
  }

}
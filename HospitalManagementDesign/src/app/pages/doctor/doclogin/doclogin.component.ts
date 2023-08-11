import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { DocauthService } from 'src/app/service/docauth.service';
import { PatientauthService } from 'src/app/service/patientauth.service';
@Component({
  selector: 'app-doclogin',
  templateUrl: './doclogin.component.html',
  styleUrls: ['./doclogin.component.css']
})
export class DocloginComponent implements OnInit {
  username = 'user'
  password = ''
  invalidLogin = false

  constructor(private router:Router, public loginservice: DocauthService) { }

  ngOnInit(): void {
  }
  checkLogin() {
    if (this.loginservice.authenticate(this.username, this.password)
    ) {
      this.router.navigate(['docdash'])
      
      this.invalidLogin = false
    } else
    {
      this.invalidLogin = true
      alert("Wrong Credentials");
      this.router.navigate(['doclogin'])
    }   
  }

}
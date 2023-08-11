import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccauthService } from 'src/app/service/accauth.service';
@Component({
  selector: 'app-acclogin',
  templateUrl: './acclogin.component.html',
  styleUrls: ['./acclogin.component.css']
})
export class AccloginComponent implements OnInit {

  username = 'user'
  password = ''
  invalidLogin = false

  constructor(private router:Router, public loginservice: AccauthService) { }

  ngOnInit(): void {
  }

  checkLogin() {
    if (this.loginservice.authenticate(this.username, this.password)
    ) {
      this.router.navigate(['acclist'])
      
      this.invalidLogin = false
    } else
    {
      this.invalidLogin = true
      alert("Wrong Credentials");
      this.router.navigate(['home'])
    }
      
  }
}

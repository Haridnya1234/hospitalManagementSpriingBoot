import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pharmlogin',
  templateUrl: './pharmlogin.component.html',
  styleUrls: ['./pharmlogin.component.css']
})
export class PharmloginComponent implements OnInit{
 

  username: string = '';
  password: string = '';

  constructor(private router: Router) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  login() {
    // For demonstration purposes, let's set the demo user and password.
    const demoUser = 'pharmacist';
    const demoPassword = '12345';

    if (this.username.trim() === demoUser && this.password.trim() === demoPassword) {
      // Navigate to the accountant list page if the login is successful.
      this.router.navigate(['/pharmacist-list']);
    } else {
      alert('Invalid credentials. Please enter the correct username and password.');
    }
  }
}



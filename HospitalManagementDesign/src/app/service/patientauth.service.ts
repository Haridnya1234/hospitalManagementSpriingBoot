import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { PatientService } from './patient.service';
@Injectable({
  providedIn: 'root'
})
export class PatientauthService {

  constructor() { }
  authenticate(username: string, password: string) {
    if (username === "Harshada" && password === "Harshada@1234") {
      sessionStorage.setItem('username', username)
      return true;
    } else {
      return false;
    }
  }

  isUserLoggedIn() {
    let user = sessionStorage.getItem('username')
    console.log(!(user === null))
    return !(user === null)
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
}
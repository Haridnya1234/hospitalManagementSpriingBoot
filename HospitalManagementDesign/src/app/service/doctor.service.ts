import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';
@Injectable({
  providedIn: 'root'
})
export class DoctorService {

  constructor(private httpClient: HttpClient) { }
   //add patient
   public createDoctor(doctor:any)
   {
     return this.httpClient.post(`${baseUrl}/doctor/postDoctor`,doctor);
   }
  
   //retrive patient record
   public getAllDoctors()
   {
     return this.httpClient.get(`${baseUrl}/doctor/getAllDoctors`);
   }
   public deleteDoctor(doctorId:any)
   {
     return this.httpClient.delete(`${baseUrl}/doctor/${doctorId}`);
   }
}


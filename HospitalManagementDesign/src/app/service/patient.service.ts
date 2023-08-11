import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PatientService
{
    
  getPatientslist() {
    throw new Error('Method not implemented.');
  }
  constructor(private httpClient: HttpClient) { }
  //add patient
  public createPatient(patient:any)
  {
    return this.httpClient.post(`${baseUrl}/patient/postPatient`,patient);
  }
  //retrive patient record
  public getAllPatients()
  {
    return this.httpClient.get(`${baseUrl}/patient/getAllPatients`);
  }
  public updatePatient(patient:any, id:any)
  {
    return this.httpClient.put(`${baseUrl}/patient/update/${id}`,patient);
  }
  public deletePatient(patientid:any)
  {
    return this.httpClient.delete(`${baseUrl}/patient/${patientid}`);
  }
  public getPatient(username:any)
  {
    return this.httpClient.get(`${baseUrl}/patient/${username}`);
  }
}
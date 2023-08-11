import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';
@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  constructor(private httpClient: HttpClient) { }
 
  public addAppointment(appointment:any)
  {
    return this.httpClient.post(`${baseUrl}/appointments/postAppointment`,appointment);
  }
  public getAllAppointments()
  {
    return this.httpClient.get(`${baseUrl}/appointments/getAllAppointment`);
  }
  public updateAppointment(appointment:any)
  {
    return this.httpClient.put(`${baseUrl}/appointments/putAppointment`,appointment);
  }
  public deleteAppointment(id:any)
  {
    return this.httpClient.delete(`${baseUrl}/appointments/${id}`);
  }
  public getAppointmentById(id:any)
  {
    return this.httpClient.get(`${baseUrl}/appointments/${id}`)
  }
}

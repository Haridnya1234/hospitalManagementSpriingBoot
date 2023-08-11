import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pharmacist } from './pharmacist';
import{Observable} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class PharmacistService {

  private baseURL = "http://localhost:8080";

  constructor(private httpClient: HttpClient) { }

  getPharmacistList(): Observable<Pharmacist[]> {
    return this.httpClient.get<Pharmacist[]>(`${this.baseURL}/pharmacists/getAllPharmacists`);
  }

  createPharmacist(pharmacist: Pharmacist): Observable<any> {
    return this.httpClient.post(`${this.baseURL}/pharmacists/postPharmacist`, pharmacist);
  }

  getPharmacistById(id: number): Observable<Pharmacist> {
    return this.httpClient.get<Pharmacist>(`${this.baseURL}/pharmacists/${id}`);
  }

  updatePharmacist(id: number, pharmacist: Pharmacist): Observable<Object> {
    return this.httpClient.put(`${this.baseURL}/pharmacists/putPharmacist/${id}`, pharmacist);
  }

  deletePharmacist(id: number): Observable<Object> {
    return this.httpClient.delete(`${this.baseURL}/pharmacists/${id}`);
  }
}

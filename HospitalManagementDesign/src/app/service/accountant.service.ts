import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Accountant } from './accountant';
@Injectable({
  providedIn: 'root'
})
export class AccountantService {

  private baseURL = "http://localhost:8080";


  constructor(private httpClient: HttpClient) { }

  getAccountantList(): Observable<Accountant[]> {
    return this.httpClient.get<Accountant[]>(`${this.baseURL}/accountants/getAllAccountant`);
  }

  createAccountant(accountant: Accountant): Observable<Accountant> {
    return this.httpClient.post<Accountant>(`${this.baseURL}/accountants/postAccountant`, accountant);
  }

  getAccountantById(id: number): Observable<Accountant> {
    return this.httpClient.get<Accountant>(`${this.baseURL}/accountants/${id}`);
  }

  updateAccountant(id: number, accountant: Accountant): Observable<Accountant> {
    return this.httpClient.put<Accountant>(`${this.baseURL}/accountants/putAccountant`, accountant);
  }

  deleteAccountant(id: number): Observable<any> {
    return this.httpClient.delete(`${this.baseURL}/accountants/${id}`);
  }
}

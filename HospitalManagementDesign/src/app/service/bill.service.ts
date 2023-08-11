import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Bill } from './bill';
import{Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BillService {

  private baseURL="http://localhost:8080"

  constructor( private httpClient:HttpClient) { }

  getBillList(){
    return this.httpClient.get<Bill[]>(`${this.baseURL}/bills/getAllBills`);
  }

  createBill(bill:Bill):Observable<any>{
    return this.httpClient.post(`${this.baseURL}/bills/postBill`,bill);
  }

  getBillById(id:number):Observable<Bill>{
    return this.httpClient.get<Bill>(`${this.baseURL}/bills/${id}`);
  }

  updateBill(id:number,bill:Bill):Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/bills/putBill`,id);
  }

  deleteBill(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/bills/${id}`)
  }}

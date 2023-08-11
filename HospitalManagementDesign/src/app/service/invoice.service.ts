import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Invoice } from './invoice';
@Injectable({
  providedIn: 'root'
})
export class InvoiceService {

  private baseURL="http://localhost:8080"


  constructor( private httpClient:HttpClient) { }

  getInvoiceList():Observable<Invoice[]>{
   return this.httpClient.get<Invoice[]>(`${this.baseURL}/invoices/getAllInvoice`);
    
  }

  createInvoice(invoice:Invoice): Observable<any>{
    return this.httpClient.post(`${this.baseURL}/invoices/postInvoice`, invoice);
  }

  getInvoiceById(id:number):Observable<Invoice>{
   return this.httpClient.get<Invoice>(`${this.baseURL}/invoices/${id}`);

  }

  updateInvoice(id: number, invoice: Invoice): Observable<Object> {
    return this.httpClient.put(`${this.baseURL}/invoices/putInvoice/${id}`, invoice);
  }

  deleteInvoice(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/invoices/${id}`);
  }
}

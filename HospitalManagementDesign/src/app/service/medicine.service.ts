import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import{Observable} from 'rxjs';
import { Medicine } from './medicine';
@Injectable({
  providedIn: 'root'
})
export class MedicineService {
  private baseURL="http://localhost:8080"


  constructor( private httpClient:HttpClient) { }

  getMedicineList():Observable<Medicine[]>{
   return this.httpClient.get<Medicine[]>(`${this.baseURL}/medicines/getAllMedicines`);
    
  }

  createMedicine(medicine:Medicine): Observable<any>{
    return this.httpClient.post(`${this.baseURL}/medicines/postMedicine`, medicine);
  }

  getMedicineById(id:number):Observable<Medicine>{
   return this.httpClient.get<Medicine>(`${this.baseURL}/medicines/${id}`);

  }

  updateMedicine(id: number, medicine: Medicine): Observable<Object> {
    return this.httpClient.put(`${this.baseURL}/medicines/putMedicine/${id}`, medicine);
  }

  deleteMedicine(id:number):Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/medicines/${id}`);
  }
}

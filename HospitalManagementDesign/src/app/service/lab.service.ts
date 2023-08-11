import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import baseUrl from './helper';
@Injectable({
  providedIn: 'root'
})
export class LabService {

 
  constructor(private httpClient: HttpClient) { }
  public createLabTest(labTest:any)
  {
    return this.httpClient.post(`${baseUrl}/labtest/postLabTest`,labTest);
  }
  public getAllLabtests()
  {
    return this.httpClient.get(`${baseUrl}/labtest/getAlllabtests`);
  }
  public updateLabTest(labTest:any, id:any)
  {
    return this.httpClient.put(`${baseUrl}/labtest/putLabTest/${id}`,labTest);
  }
  public deleteLabTest(labid:any)
  {
    return this.httpClient.delete(`${baseUrl}/labtest/${labid}`);
  }
  public getLabTest(testname:any)
  {
    return this.httpClient.get(`${baseUrl}/labtest/${testname}`);
  }
}

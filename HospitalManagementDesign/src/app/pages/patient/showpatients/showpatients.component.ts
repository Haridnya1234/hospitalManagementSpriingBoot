import { Component,OnInit } from '@angular/core';
import { Router,RouterLink } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { PatientService } from 'src/app/service/patient.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-showpatients',
  templateUrl: './showpatients.component.html',
  styleUrls: ['./showpatients.component.css']
})
export class ShowpatientsComponent implements OnInit
 {
    public patient:any;
   
    public id:any;
    constructor (private patientService:PatientService, private router:Router, private httpclient:HttpClient){this.getAllPatients();}

    ngOnInit(): void {
      
    }
    getAllPatients()
    {
      this.patientService.getAllPatients().subscribe
      (
        (resp)=>{
          Swal.fire('Profile Display Sucessfully');
          console.log(resp);
          this.patient=resp;
        },
        (error: any)=>
        {
          console.log(error);
          alert("Something Went Wrong");
        }
      );
    }
deletePatient(patientid:any):void{
  this.patientService.deletePatient(patientid).subscribe(
    (data:any)=>{
      //success
      Swal.fire(patientid+" Record Deleted Successfully");
      this.router.navigate(['/home'])
      console.log(data);
    },
    (error: any)=>{
      console.log(error);
    }
  );
}
getPatient(username:any){
  this.patientService.getPatient(username).subscribe
      (
        (data:any)=>{
          Swal.fire(this.patient+'Profile Display Sucessfully');
          console.log(data);
          this.patient=data;
        },
        (error: any)=>
        {
          console.log(error);
          alert("Something Went Wrong");
        }
      );
}
 }

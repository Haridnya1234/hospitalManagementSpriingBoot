import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PatientService } from 'src/app/service/patient.service'; 
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-viewsinglepatient',
  templateUrl: './viewsinglepatient.component.html',
  styleUrls: ['./viewsinglepatient.component.css']
})
export class ViewsinglepatientComponent implements OnInit {

public patients:any;
  
  constructor (private patientService:PatientService, private router:Router, private httpclient:HttpClient){}

  ngOnInit(): void {}

    public patient={
      id:'',
      firstname:'',
      lastname:'',
      email:'',
      username:'',
      password:'',
      address:'',
      contact:'',
      age:'',
      gender:'',
      bloodgroup:'',
      }
      formSubmit()
      {
        //alert('submit');
        console.log(this.patient);
        if(this.patient.username==''||this.patient.username==null)
        {
          alert('user is required');
            alert("user required");
            return;
        }
        if(this.patient.password==''||this.patient.password==null)
        {
          alert('patient is required');
        return;
        }
        //add :DoctorService, subscribe will check if post req is add or not
        this.patientService.createPatient(this.patient).subscribe
        (
          (data:any)=>{
            //success
            Swal.fire(this.patient.username+"Registration Success");
            this.router.navigate(['/HospitalManagement'])
            console.log(data);
          },
          (error:any)=>{
            console.log(error);
        });
      
      }
      getPatient(username:any){
        this.patientService.getPatient(username).subscribe
            (
              (data:any)=>{
                Swal.fire('Profile Display Sucessfully');
                console.log(data);
                this.patients=data;
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
  }


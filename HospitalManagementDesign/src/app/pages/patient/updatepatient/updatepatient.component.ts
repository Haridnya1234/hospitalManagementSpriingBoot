import { Component,OnInit } from '@angular/core';
import { PatientService } from 'src/app/service/patient.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-updatepatient',
  templateUrl: './updatepatient.component.html',
  styleUrls: ['./updatepatient.component.css']
})
export class UpdatepatientComponent implements OnInit {
 
   constructor (private patientService:PatientService, private router:Router){}

    ngOnInit(): void {
      
    }
  
  //variable as in backend
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
        Swal.fire(this.patient.username+" Data Updated Successfully");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
    });
  
  }
}



import { Component,OnInit, Input } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router,RouterLink } from '@angular/router';
//import { PatientServiceService } from 'src/app/service/patient.service.spec';
import Swal from 'sweetalert2';
import { HttpClient } from '@angular/common/http';
import { PatientService} from 'src/app/service/patient.service';
@Component({
  selector: 'app-patientsignup',
  templateUrl: './patientsignup.component.html',
  styleUrls: ['./patientsignup.component.css']
})
export class PatientsignupComponent implements OnInit
{
  ngOnInit(): void
  {

  }
  // ngModel(): void
  // {

  // }
  constructor(private patientservice:PatientService,private router:Router){}
  //variable as in backend
  public patient={
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
    this.patientservice.createPatient(this.patient).subscribe
    (
      (data:any)=>{
        //success
        Swal.fire(this.patient.firstname+" "+this.patient.lastname+" Your Appointment Is Booked");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
    });
  
  }
}
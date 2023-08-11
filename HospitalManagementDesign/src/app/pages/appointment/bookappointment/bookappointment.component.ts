import { Component,OnInit } from '@angular/core';
import { AppointmentService } from 'src/app/service/appointment.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-bookappointment',
  templateUrl: './bookappointment.component.html',
  styleUrls: ['./bookappointment.component.css']
})
export class BookappointmentComponent implements OnInit{
  ngOnInit(): void
  {

  }
 
  constructor(private appointmentService:AppointmentService,private router:Router){}
  //variable as in backend
  public appointment={
    fullname:'',
    email:'',
    contactno:'',
    appointmentTime:'',
    appointmentDate:'',
	  status:'',
	  healthProblem:'',	
    age:'',
    gender:'',
  }
  
  formSubmit()
  {
    //alert('submit');
    console.log(this.appointment);
    if(this.appointment.age==''||this.appointment.age==null)
    {
      alert('age is required');
        alert("age required");
        return;
    }
    if(this.appointment.gender==''||this.appointment.gender==null)
    {
      alert('gender is required');
    return;
    }
    //add :DoctorService, subscribe will check if post req is add or not
    this.appointmentService.addAppointment(this.appointment).subscribe
    (
      (data:any)=>{
        //success
        Swal.fire(this.appointment.fullname+" your appointment booked sucessfully. Appointment Date : "+this.appointment.appointmentDate+" and Appointment Time : "+this.appointment.appointmentTime);
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
    });
  
  }
}

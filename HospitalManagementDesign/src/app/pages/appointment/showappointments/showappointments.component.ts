import { Component ,OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { AppointmentService } from 'src/app/service/appointment.service';
import { HttpClient } from '@angular/common/http';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-showappointments',
  templateUrl: './showappointments.component.html',
  styleUrls: ['./showappointments.component.css']
})
export class ShowappointmentsComponent implements OnInit {
  public appointment:any;
   
  public id:any;
  constructor (private appointmentService:AppointmentService, private router:Router, private httpclient:HttpClient){this.getAllAppointments();}
  
  ngOnInit(): void {
    
  }
  getAllAppointments()
  {
    this.appointmentService.getAllAppointments().subscribe
    (
      (resp)=>{
        Swal.fire('Appointment Display Sucessfully');
        console.log(resp);
        this.appointment=resp;
      },
      (error: any)=>
      {
        console.log(error);
        alert("Something Went Wrong");
      }
    );
  }
deleteAppointment(id:any):void{
this.appointmentService.deleteAppointment(id).subscribe(
  (data:any)=>{
    //success
    Swal.fire(id+" Record Deleted Successfully");
    this.router.navigate(['/home'])
    console.log(data);
  },
  (error: any)=>{
    console.log(error);
  }
);
}
getAppointmentById(id:any){
this.appointmentService.getAppointmentById(id).subscribe
    (
      (data:any)=>{
        Swal.fire(this.appointment+'Appointment Display Sucessfully');
        console.log(data);
        this.appointment=data;
      },
      (error: any)=>
      {
        console.log(error);
        alert("Something Went Wrong");
      }
    );
}
}

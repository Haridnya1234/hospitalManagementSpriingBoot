import { Component ,OnInit} from '@angular/core';
import { DoctorService } from 'src/app/service/doctor.service';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-admindash',
  templateUrl: './admindash.component.html',
  styleUrls: ['./admindash.component.css']
})
export class AdmindashComponent implements  OnInit{


  public doctor:any;
  public id:any;
  constructor (private doctorService:DoctorService, private router:Router, private httpclient:HttpClient){this.getAllDoctors();}

  ngOnInit(): void {
    
  }
  getAllDoctors()
  {
    this.doctorService.getAllDoctors().subscribe
    (
      (resp)=>{
        Swal.fire('Profile Display Sucessfully');
        console.log(resp);
        this.doctor=resp;
      },
      (error: any)=>
      {
        console.log(error);
        alert("Something Went Wrong");
      }
    );
  }

  deleteDoctor(doctorId:any):void{
    this.doctorService.deleteDoctor(doctorId).subscribe(
      (data:any)=>{
        //success
        Swal.fire(doctorId+" Record Deleted Successfully");
        this.router.navigate(['/home'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
      }
    );
}

}

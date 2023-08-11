import { Component, OnInit } from '@angular/core';
import { DoctorService } from 'src/app/service/doctor.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-showdoclist',
  templateUrl: './showdoclist.component.html',
  styleUrls: ['./showdoclist.component.css']
})
export class ShowdoclistComponent implements OnInit {
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
// deletePatient(patientid:any):void{
// this.doctorService.deletePatient(patientid).subscribe(
//   (data:any)=>{
//     //success
//     Swal.fire(patientid+" Record Deleted Successfully");
//     this.router.navigate(['/home'])
//     console.log(data);
//   },
//   (error:any)=>{
//     console.log(error);
//   }
// );
// }
// getPatientById(id:any){
// this.patientService.getPatientById(id).subscribe
//     (
//       (resp)=>{
//         Swal.fire('Profile Display Sucessfully');
//         console.log(resp);
//         this.patient=resp;
//       },
//       (error: any)=>
//       {
//         console.log(error);
//         alert("Something Went Wrong");
//       }
//     );
// }

}

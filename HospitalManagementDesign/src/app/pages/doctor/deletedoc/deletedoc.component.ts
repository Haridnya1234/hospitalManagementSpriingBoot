import { Component ,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DoctorService } from 'src/app/service/doctor.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-deletedoc',
  templateUrl: './deletedoc.component.html',
  styleUrls: ['./deletedoc.component.css']
})
export class DeletedocComponent {
  constructor(private doctorService:DoctorService,private router:Router){}
  ngOnInit(): void {
    
  }
  deleteDoctorRecord(doctorId:any):void
  {
    this.doctorService.deleteDoctor(doctorId).subscribe(
      (data:any)=>{
        //success
        Swal.fire("Record Deleted Successfully");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
      }
    );
  }
}

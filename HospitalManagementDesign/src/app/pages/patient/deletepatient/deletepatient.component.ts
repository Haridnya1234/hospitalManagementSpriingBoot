import { Component, OnInit } from '@angular/core';
import { PatientService } from 'src/app/service/patient.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';
@Component({
  selector: 'app-deletepatient',
  templateUrl: './deletepatient.component.html',
  styleUrls: ['./deletepatient.component.css']
})
export class DeletepatientComponent implements OnInit{
  constructor(private patientService:PatientService,private router:Router){}
  ngOnInit(): void {
    
  }
  deletePatientRecord(patientid:any):void
  {
    this.patientService.deletePatient(patientid).subscribe(
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

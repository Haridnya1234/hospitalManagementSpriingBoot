import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LabService } from 'src/app/service/lab.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-deletlabtest',
  templateUrl: './deletlabtest.component.html',
  styleUrls: ['./deletlabtest.component.css']
})
export class DeletlabtestComponent {
  constructor(private labService:LabService,private router:Router){}
  ngOnInit(): void {
    
  }
  deleteLabRecord(labid:any):void
  {
    this.labService.deleteLabTest(labid).subscribe(
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

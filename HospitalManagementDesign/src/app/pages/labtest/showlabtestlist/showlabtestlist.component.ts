import { Component ,OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { LabService } from 'src/app/service/lab.service';
import Swal from 'sweetalert2';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-showlabtestlist',
  templateUrl: './showlabtestlist.component.html',
  styleUrls: ['./showlabtestlist.component.css']
})
export class ShowlabtestlistComponent {
  public labTest:any;
  public id:any;
  constructor (private labService:LabService, private router:Router, private httpclient:HttpClient){this.getAllLabtests();}

  ngOnInit(): void {
    
  }
  getAllLabtests()
  {
    this.labService.getAllLabtests().subscribe
    (
      (resp)=>{
        Swal.fire('Tests Display Sucessfully');
        console.log(resp);
        this.labTest=resp;
      },
      (error: any)=>
      {
        console.log(error);
        alert("Something Went Wrong");
      }
    );
  }
deleteLabTest(labid:any):void{
this.labService.deleteLabTest(labid).subscribe(
  (data:any)=>{
    //success
    Swal.fire(labid+" Record Deleted Successfully");
    this.router.navigate(['/home'])
    console.log(data);
  },
  (error:any)=>{
    console.log(error);
  }
);
}
getLabTest(testname:any){
this.labService.getLabTest(testname).subscribe
    (
      (resp)=>{
        Swal.fire('Test Display Sucessfully');
        console.log(resp);
        this.labTest=resp;
      },
      (error: any)=>
      {
        console.log(error);
        alert("Something Went Wrong");
      }
    );
}
}

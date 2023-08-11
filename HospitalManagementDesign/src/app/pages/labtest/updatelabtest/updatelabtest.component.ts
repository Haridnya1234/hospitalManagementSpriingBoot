import { Component ,OnInit} from '@angular/core';
import { LabService } from 'src/app/service/lab.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-updatelabtest',
  templateUrl: './updatelabtest.component.html',
  styleUrls: ['./updatelabtest.component.css']
})
export class UpdatelabtestComponent implements OnInit{
  constructor (private labService:LabService, private router:Router){}

  ngOnInit(): void {
    
  }

//variable as in backend
public labTest={
  id:'',
  testname:'',
	testsample:'',
	testduration:'',
	priceInRS:'',
  }
formSubmit()
{
  //alert('submit');
  console.log(this.labTest);
  if(this.labTest.testname==''||this.labTest.testname==null)
  {
    alert('testname is required');
      alert("testname required");
      return;
  }
  if(this.labTest.testsample==''||this.labTest.testsample==null)
  {
    alert('testsample is required');
  return;
  }
  //add :DoctorService, subscribe will check if post req is add or not
  this.labService.createLabTest(this.labTest).subscribe
  (
    (data:any)=>{
      //success
      Swal.fire(this.labTest.testname+" Test Updated Successfully");
      this.router.navigate(['/HospitalManagement'])
      console.log(data);
    },
    (error:any)=>{
      console.log(error);
  });

}
}

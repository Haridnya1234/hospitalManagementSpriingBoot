import { Component ,OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { LabService } from 'src/app/service/lab.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-createlabtest',
  templateUrl: './createlabtest.component.html',
  styleUrls: ['./createlabtest.component.css']
})
export class CreatelabtestComponent implements OnInit {
  ngOnInit(): void
  {

  }
 
  constructor(private labservice:LabService,private router:Router){}
  //variable as in backend
  public labTest={
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
      alert('test is required');
        alert("test required");
        return;
    }
    if(this.labTest.testsample==''||this.labTest.testsample==null)
    {
      alert('testsample is required');
    return;
    }
    //add :DoctorService, subscribe will check if post req is add or not
    this.labservice.createLabTest(this.labTest).subscribe
    (
      (data:any)=>{
        //success
        Swal.fire(this.labTest.testname+" Added Successfully");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
    });
  
  }
}

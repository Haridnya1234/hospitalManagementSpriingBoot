import { Component,OnInit} from '@angular/core';
import { DoctorService } from 'src/app/service/doctor.service';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-updatedoc',
  templateUrl: './updatedoc.component.html',
  styleUrls: ['./updatedoc.component.css']
})
export class UpdatedocComponent implements OnInit {
  constructor (private doctorService:DoctorService, private router:Router){}

    ngOnInit(): void {
      
    }
  
  //variable as in backend
  public doctor={
    doctorId:'',
    doctorFirstName:'',
    doctorLastName:'',
    email:'',
    username:'',
    password:'',
    address:'',
    contact:'',
    age:'',
    gender:'',
    degree:'',
    specialization:'',
    experience:'',
     }
 
  formSubmit()
  {
    //alert('submit');
    console.log(this.doctor);
    if(this.doctor.username==''||this.doctor.username==null)
    {
      alert('username is required');
        alert("username required");
        return;
    }
    if(this.doctor.password==''||this.doctor.password==null)
    {
      alert('doctor is required');
    return;
    }
    //add :DoctorService, subscribe will check if post req is add or not
    this.doctorService.createDoctor(this.doctor).subscribe
    (
      (data:any)=>{
        //success
        Swal.fire(this.doctor.username+" Data Updated Successfully");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
    });
  
  }

}

import { Component,OnInit, Input } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router,RouterLink } from '@angular/router';
import Swal from 'sweetalert2';
import { HttpClient } from '@angular/common/http';
import { DoctorService } from 'src/app/service/doctor.service';


@Component({
  selector: 'app-docsignup',
  templateUrl: './docsignup.component.html',
  styleUrls: ['./docsignup.component.css']
})
export class DocsignupComponent implements OnInit
 {
  ngOnInit(): void
  {

  }
 constructor(private doctorservice:DoctorService,private router:Router)
  { }
   //variable as in backend
   public doctor={
    
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
      alert('user is required');
        alert("user required");
        return;
    }
    if(this.doctor.password==''||this.doctor.password==null)
    {
      alert('doctor is required');
    return;
    }
    //add :DoctorService, subscribe will check if post req is add or not
    this.doctorservice.createDoctor(this.doctor).subscribe
    (
      (data:any)=>{
        //success
        Swal.fire("Dr. "+this.doctor.doctorFirstName+" "+this.doctor.doctorLastName+" Registration Successful"+" Welcome To LifeLine Hospital");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
      },
      (error:any)=>{
        console.log(error);
    });
  
  }
  
  
}

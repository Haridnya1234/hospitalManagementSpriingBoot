import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Accountant } from 'src/app/service/accountant';
import { AccountantService } from 'src/app/service/accountant.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-create-accountant',
  templateUrl: './create-accountant.component.html',
  styleUrls: ['./create-accountant.component.css']
})
export class CreateAccountantComponent {

  accountant:Accountant=new Accountant();

  constructor(private accountantService:AccountantService,private router:Router){}
  
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  saveaccountant(){
    this.accountantService.createAccountant(this.accountant).subscribe(data=>{
      Swal.fire(this.accountant.username+" Registration Successful"+" Welcome To LifeLine Hospital");
      this.router.navigate(['/HospitalManagement'])
      console.log(data);
      this.goToAccountantList();
    },
    error=>console.error(error));
  }

  goToAccountantList(){
    this.router.navigate(['/accountants'])
  }
  onSubmit(){
    console.log(this.accountant);
    this.saveaccountant();
  }
}

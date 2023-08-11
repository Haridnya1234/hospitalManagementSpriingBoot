import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Accountant } from 'src/app/service/accountant';
import { AccountantService } from 'src/app/service/accountant.service';
@Component({
  selector: 'app-accountant-list',
  templateUrl: './accountant-list.component.html',
  styleUrls: ['./accountant-list.component.css']
})
export class AccountantListComponent {
  accountants!: Accountant[];
  constructor(private accountantService:AccountantService,private router:Router){}


  ngOnInit(): void {
    this.getAllAccountants();
  }

  private getAllAccountants(){
    this.accountantService.getAccountantList().subscribe(data=>{
      this.accountants=data;
    })
  }
  updateAccountant(id:number){
    this.router.navigate(['update-accountant',id]);
  }
  deleteAccountant(id:number){
    this.accountantService.deleteAccountant(id).subscribe(date=>{
      console.log(date);
      this.getAllAccountants();
    })
  }
}

import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bill } from 'src/app/service/bill';
import { BillService } from 'src/app/service/bill.service';
@Component({
  selector: 'app-create-bill',
  templateUrl: './create-bill.component.html',
  styleUrls: ['./create-bill.component.css']
})
export class CreateBillComponent implements OnInit{
  bill:Bill=new Bill();

  constructor(private billService:BillService,private router:Router){}


  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  saveBill(){
    this.billService.createBill(this.bill).subscribe(data=>{
      console.log(data);
      this.goToBillList();
    },
    error=>console.error(error));
  }

  goToBillList(){
    this.router.navigate(['/bills'])
  }
  onSubmit(){
    console.log(this.bill);
    this.saveBill();
  }
}

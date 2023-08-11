import { Component,OnInit } from '@angular/core';
import { Bill } from 'src/app/service/bill';
import { BillService } from 'src/app/service/bill.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-bill-list',
  templateUrl: './bill-list.component.html',
  styleUrls: ['./bill-list.component.css']
})
export class BillListComponent implements OnInit {
  bills!:Bill[];

  constructor(private billService:BillService,
    private router:Router){}

  ngOnInit(): void {
   this.getAllBills();
  }

  private getAllBills(){
    this.billService.getBillList().subscribe(data=>
      {this.bills=data;
      })
  }

  updateBill(id:number){
    this.router.navigate(['update-bill',id]);
  }
  deleteBill(id:number){
    this.billService.deleteBill(id).subscribe(data=>{
      console.log(data);
      this.getAllBills();
    })
  }
}

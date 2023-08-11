import { Component,OnInit } from '@angular/core';
import { Router ,ActivatedRoute} from '@angular/router';
import { Bill } from 'src/app/service/bill';
import { BillService } from 'src/app/service/bill.service';
@Component({
  selector: 'app-update-bill',
  templateUrl: './update-bill.component.html',
  styleUrls: ['./update-bill.component.css']
})
export class UpdateBillComponent implements OnInit {
  id!:number;
  bill:Bill=new Bill();
  error: string | null = null;

  constructor(
    private billService:BillService,
    private router:Router,
    private route:ActivatedRoute
  ){}
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.getBillById();
  }

  getBillById(){
    this.billService.getBillById(this.id).subscribe(
      data=>{this.bill=data;},
      error => {
        this.error = error.message || 'An error occurred while fetching the medicine details.';
        console.error(this.error);
      }
    );
  }

  updateBill(){
    this.billService.updateBill(this.id,this.bill).subscribe(data=>{
      console.log(data);
      this.bill=new Bill();
      this.goToBillList();
    },
    error => {
      this.error = error.message || 'An error occurred while updating the medicine.';
      console.error(this.error);
    }
  );
}

onSubmit(){
  this.billService.updateBill(this.id,this.bill).subscribe(data=>{
    this.goToBillList
  },error=>console.log(error));
}

goToBillList() {
  this.router.navigate(['/bills']);
}
}

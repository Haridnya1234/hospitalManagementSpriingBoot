import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Invoice } from 'src/app/service/invoice';
import { InvoiceService } from 'src/app/service/invoice.service';
@Component({
  selector: 'app-invoice-list',
  templateUrl: './invoice-list.component.html',
  styleUrls: ['./invoice-list.component.css']
})
export class InvoiceListComponent implements OnInit {

  invoices!: Invoice[];
 

  constructor(private invoiceService:InvoiceService, private router:Router){}
  ngOnInit(): void {
    this.getAllInvoice();
  }


  private getAllInvoice() {
   this.invoiceService.getInvoiceList().subscribe(data=>{
    this.invoices=data;
   })
  }


  updateInvoice(id:number){
    this.router.navigate(['update-invoice',id]);

  }

  deleteInvoice(id:number){
    this.invoiceService.deleteInvoice(id).subscribe(data=>{
      console.log(data);
      this.getAllInvoice();
    })

  }
}

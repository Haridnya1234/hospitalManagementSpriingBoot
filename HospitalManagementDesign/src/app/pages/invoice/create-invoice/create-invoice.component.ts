import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Invoice } from 'src/app/service/invoice';
import { InvoiceService } from 'src/app/service/invoice.service';
@Component({
  selector: 'app-create-invoice',
  templateUrl: './create-invoice.component.html',
  styleUrls: ['./create-invoice.component.css']
})
export class CreateInvoiceComponent implements OnInit {
  invoice: Invoice = new Invoice();
  constructor(private invoiceService:InvoiceService,private router:Router){}
  

  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  saveInvoice()
  {
    this.invoiceService.createInvoice(this.invoice).subscribe(data=>{
      console.log(data);
      this.goToInvoiceList();
    },
    error=>console.error(error));

    
  }

  goToInvoiceList(){
    this.router.navigate(['/invoices'])

  }

  onSubmit(){
    console.log(this.invoice);
    this.saveInvoice();

  }
}

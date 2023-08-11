import { Component,OnInit } from '@angular/core';
import { Router,ActivatedRoute } from '@angular/router';
import { Invoice } from 'src/app/service/invoice';
import { InvoiceService } from 'src/app/service/invoice.service';

@Component({
  selector: 'app-update-invoice',
  templateUrl: './update-invoice.component.html',
  styleUrls: ['./update-invoice.component.css']
})
export class UpdateInvoiceComponent implements OnInit{
  id!: number;
  invoice: Invoice = new Invoice();
  error: string | null = null;

  constructor(
    private invoiceService: InvoiceService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.getInvoiceById();
  }

  getInvoiceById() {
    this.invoiceService.getInvoiceById(this.id).subscribe(
      data => {
        this.invoice = data;
      },
      error => {
        this.error = error.message || 'An error occurred while fetching the medicine details.';
        console.error(this.error);
      }
    );
  }

  updateInvoice() {
    this.invoiceService.updateInvoice(this.id, this.invoice).subscribe(
      data => {
        console.log(data); // Log the response from the backend for debugging purposes
        this.invoice=new Invoice();
        this.goToInvoiceList();
      },
      error => {
        this.error = error.message || 'An error occurred while updating the medicine.';
        console.error(this.error);
      }
    );
  }

 

  onSubmit() {
    this.invoiceService.updateInvoice(this.id,this.invoice).subscribe(data=>{
      this.goToInvoiceList

    },error=>console.log(error));
  }

  goToInvoiceList() {
    this.router.navigate(['/invoices']);
  }
}

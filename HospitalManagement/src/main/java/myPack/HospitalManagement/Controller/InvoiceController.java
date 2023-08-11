package myPack.HospitalManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myPack.HospitalManagement.Entity.Invoice;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.InvoiceRepository;
import myPack.HospitalManagement.Service.InvoiceService;

@RestController
@RequestMapping("/invoice")
@CrossOrigin("*")

public class InvoiceController {

	 @Autowired
	   private InvoiceService invoiceService;
	    @Autowired
	    private InvoiceRepository invoiceRepository;
		
	    @GetMapping("/{id}")
	    public Invoice getInvoiceById(@PathVariable Long id)
	    {
	        return invoiceService.getInvoice(id);
	    }
	    
	    @PostMapping("/postInvoice")
	    public Invoice createInvoice(@RequestBody Invoice invoice) 
	    {
	        return this.invoiceService.createInvoice(invoice);
	    }

	    @PutMapping("/putInvoice")
		public Invoice updateInvoice(@RequestBody Invoice invoice)
		{
			return this.invoiceService.updateInvoice(invoice);
		}

	    @DeleteMapping("/{id}")
	    public void deleteInvoice(@PathVariable("id") Long id) 
	    {
	        this.invoiceService.deleteInvoice(id);
	    }
	    @GetMapping("/getAllInvoice")
		public ResponseEntity<List<Invoice>> getAllInvoice()
		{
			List<Invoice> invoiceList=new ArrayList<>();
			invoiceRepository.findAll().forEach(invoiceList :: add);
			return new ResponseEntity<List<Invoice>>(invoiceList,HttpStatus.OK);
		}
	}
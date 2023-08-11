package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.Invoice;

public interface InvoiceService
{
public Invoice createInvoice(Invoice invoice);
	
	public void deleteInvoice(Long id);
			
	public Invoice updateInvoice(Invoice invoice);
			
	public Invoice getInvoice(Long id);

	public List<Invoice> getAllInvoice();
}

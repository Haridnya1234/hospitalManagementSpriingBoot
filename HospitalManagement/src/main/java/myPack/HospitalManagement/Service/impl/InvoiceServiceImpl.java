package myPack.HospitalManagement.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myPack.HospitalManagement.Entity.Invoice;
import myPack.HospitalManagement.Repository.InvoiceRepository;
import myPack.HospitalManagement.Service.InvoiceService;

@Service
public class InvoiceServiceImpl implements InvoiceService
{
	@Autowired
	private InvoiceRepository invoiceRepository;
	
    @Override
    public void deleteInvoice(Long id) 
    {
        this.invoiceRepository.deleteById(id);
    }

	@Override
	public Invoice createInvoice(Invoice invoice)
	{
		return this.invoiceRepository.save(invoice);
	}

	@Override
	public Invoice updateInvoice(Invoice invoice)
	{
		return this.invoiceRepository.save(invoice);
	}
	@Override
	public Invoice getInvoice(Long id)
	{
        return this.invoiceRepository.findById(id).orElse(null);
	}

	@Override
	public List<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return this.invoiceRepository.findAll();
	}
}

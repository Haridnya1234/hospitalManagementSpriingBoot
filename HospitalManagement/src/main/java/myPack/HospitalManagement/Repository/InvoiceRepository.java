package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Invoice;
import myPack.HospitalManagement.Entity.Patient;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> 
{
	public Invoice findById(long id);
	public Invoice deleteById(long id);
}

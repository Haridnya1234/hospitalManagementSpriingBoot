package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Bill;
import myPack.HospitalManagement.Entity.Patient;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> 
{
	public Bill findById(long id);
	public Bill deleteById(long id);
	
}

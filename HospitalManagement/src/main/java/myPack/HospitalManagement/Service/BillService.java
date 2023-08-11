package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.Bill;
import myPack.HospitalManagement.Entity.Patient;

public interface BillService 
{

public Bill createBill(Bill bill);
	
	public void deleteBill(Long id);
			
	public Bill updateBill(Bill bill);
			
	public Bill getBill(Long id);

	public List<Bill> getAllBills();
	


}

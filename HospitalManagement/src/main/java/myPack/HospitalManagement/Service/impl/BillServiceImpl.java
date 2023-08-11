package myPack.HospitalManagement.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Bill;
import myPack.HospitalManagement.Repository.BillRepository;
import myPack.HospitalManagement.Service.BillService;

@Service
public class BillServiceImpl implements BillService
{
	@Autowired
	private BillRepository billRepository;

    @Override
    public void deleteBill(Long id) 
    {
		this.billRepository.deleteById(id);
    }
    

	@Override
	public Bill createBill(Bill bill)
	{
		return this.billRepository.save(bill);
	}

	@Override
	public Bill updateBill(Bill bill) 
	{
		return this.billRepository.save(bill);
	}

	@Override
	public Bill getBill(Long id)
	{
        return billRepository.findById(id).orElse(null);
	}


	@Override
	public List<Bill> getAllBills() {
		// TODO Auto-generated method stub
		return this.billRepository.findAll();
	} 
	 	
}

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

import myPack.HospitalManagement.Entity.Bill;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.BillRepository;
import myPack.HospitalManagement.Service.BillService;
import myPack.HospitalManagement.Service.impl.BillServiceImpl;

@RestController
@RequestMapping("/bills")
@CrossOrigin("*")

public class BillController
{
	@Autowired
	private BillService billService;
	@Autowired
	private BillRepository billRepository;

    @GetMapping("/{id}")
    public Bill getBill(@PathVariable Long id)
    {
        return this.billService.getBill(id);
    }

    @PostMapping("/postBill")
	public Bill createBill(@RequestBody Bill bill)
	{
		return this.billService.createBill(bill);
	}

    @PutMapping("/putBill")
	public Bill updateBill(@RequestBody Bill bill)
	{
		return this.billService.updateBill(bill);
	}
    
    @GetMapping("/getAllBills")
	public ResponseEntity<List<Bill>> getAllBills()
	{
		List<Bill> billList=new ArrayList<>();
		billRepository.findAll().forEach(billList :: add);
		return new ResponseEntity<List<Bill>>(billList,HttpStatus.OK);
	}
    @DeleteMapping("/{id}")
    public void deleteBill(@PathVariable("id") Long id) 
    {
        this.billService.deleteBill(id);
    }

}

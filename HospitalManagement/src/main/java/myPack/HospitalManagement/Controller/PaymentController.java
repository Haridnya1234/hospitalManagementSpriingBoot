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

import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Entity.Payment;
import myPack.HospitalManagement.Repository.PaymentRepository;
import myPack.HospitalManagement.Service.PaymentService;

@RestController
@RequestMapping("/payments")
@CrossOrigin("*")
public class PaymentController 
{
	 @Autowired
	    private PaymentService paymentService;

	    @GetMapping("/getAllPayment")
	    public List<Payment> getAllPayments() {
	        return paymentService.getAllPayments();
	    }

	    @GetMapping("/{id}")
	    public Payment getPaymentById(@PathVariable Long id) {
	        return paymentService.getPaymentById(id);
	    }

	    @PostMapping("/postPayment")
	    public Payment addPayment(@RequestBody Payment payment) {
	        return paymentService.savePayment(payment);
	    }

	    @PutMapping("/putPayment")
	    public Payment updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
	        return paymentService.updatePayment(id, payment);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePayment(@PathVariable Long id) {
	        paymentService.deletePayment(id);
	    }
	}

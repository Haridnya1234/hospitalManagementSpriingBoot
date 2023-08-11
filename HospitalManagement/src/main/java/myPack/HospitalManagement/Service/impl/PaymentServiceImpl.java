package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Entity.Payment;
import myPack.HospitalManagement.Repository.PaymentRepository;
import myPack.HospitalManagement.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService
{ 
	 @Autowired
	    private PaymentRepository paymentRepository;

	    @Override
	    public List<Payment> getAllPayments() {
	        return paymentRepository.findAll();
	    }

	    @Override
	    public Payment getPaymentById(Long id) {
	        return paymentRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Payment savePayment(Payment payment) {
	        return paymentRepository.save(payment);
	    }

	    @Override
	    public Payment updatePayment(Long id, Payment payment) {
	        Optional<Payment> existingPayment = paymentRepository.findById(id);
	        if (existingPayment.isPresent()) {
	            payment.setId(id);
	            return paymentRepository.save(payment);
	        }
	        return null;
	    }

	    @Override
	    public void deletePayment(Long id) {
	        paymentRepository.deleteById(id);
	    }
}


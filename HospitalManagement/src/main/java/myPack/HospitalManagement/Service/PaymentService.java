package myPack.HospitalManagement.Service;
import java.util.List;

import myPack.HospitalManagement.Entity.Payment;

public interface PaymentService
{
	 List<Payment> getAllPayments();
	    Payment getPaymentById(Long id);
	    Payment savePayment(Payment payment);
	    Payment updatePayment(Long id, Payment payment);
	    void deletePayment(Long id);
}


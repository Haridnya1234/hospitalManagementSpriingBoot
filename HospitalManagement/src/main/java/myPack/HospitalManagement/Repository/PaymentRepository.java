package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> 
{
	public Payment findById(long id);
	public Payment deleteById(long id);
}


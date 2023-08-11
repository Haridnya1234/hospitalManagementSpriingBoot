package myPack.HospitalManagement.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.HospitalManagement.Entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Long> 
{

//	List<Medicine> findByExpiryDateBefore(Date expiryDate);
	
}



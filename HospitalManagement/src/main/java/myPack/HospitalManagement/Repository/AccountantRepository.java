package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.HospitalManagement.Entity.Accountant;
import myPack.HospitalManagement.Entity.Patient;


public interface AccountantRepository extends JpaRepository<Accountant, Long>
{
	public Accountant findById(long id);
	public Accountant deleteById(long id);
	public Accountant findByUsername(String username);
}


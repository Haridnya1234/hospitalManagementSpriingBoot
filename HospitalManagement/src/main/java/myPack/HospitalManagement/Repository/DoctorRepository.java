package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Patient;

public interface DoctorRepository extends JpaRepository<Doctor, Long>
{
	public Doctor findById(long id);
	public Doctor deleteById(long id);
	public Doctor findBySpecialization(String specialization);
	public Doctor findByUsername(String username);
	
}

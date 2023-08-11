package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.HospitalManagement.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>
{
	public Patient findById(long id);
	public Patient deleteById(long id);
	public Patient findByUsername(String username);
}


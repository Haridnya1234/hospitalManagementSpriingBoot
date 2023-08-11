package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Nurse;
import myPack.HospitalManagement.Entity.Patient;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long>
{
	public Nurse findById(long id);
	public Nurse deleteById(long id);
	public Nurse findByUsername(String username);
}

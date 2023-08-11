package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.HospitalManagement.Entity.LabTest;
import myPack.HospitalManagement.Entity.Patient;

public interface LabTestRepository extends JpaRepository<LabTest, Long>
{
	public LabTest findById(long id);
	public LabTest deleteById(long id);
	public LabTest findByTestname(String testname);
}

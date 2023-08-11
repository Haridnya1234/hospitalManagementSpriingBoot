package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import myPack.HospitalManagement.Entity.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long>
{

}



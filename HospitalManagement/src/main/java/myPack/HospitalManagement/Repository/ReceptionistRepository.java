package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Receptionist;


@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {
}
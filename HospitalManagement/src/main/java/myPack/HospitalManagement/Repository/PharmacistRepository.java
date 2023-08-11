package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Pharmacist;


@Repository
public interface PharmacistRepository extends JpaRepository<Pharmacist, Long> {
}
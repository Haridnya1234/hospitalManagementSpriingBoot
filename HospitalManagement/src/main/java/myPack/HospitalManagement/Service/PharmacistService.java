package myPack.HospitalManagement.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Pharmacist;



public interface PharmacistService {
    List<Pharmacist> getAllPharmacists();
    Pharmacist getPharmacistById(Long id);
    Pharmacist savePharmacist(Pharmacist pharmacist);
    Pharmacist updatePharmacist(Long id, Pharmacist pharmacist);
    void deletePharmacist(Long id);
}
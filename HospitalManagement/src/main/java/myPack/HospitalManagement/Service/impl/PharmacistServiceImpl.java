package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Pharmacist;
import myPack.HospitalManagement.Repository.PharmacistRepository;
import myPack.HospitalManagement.Service.PharmacistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PharmacistServiceImpl implements PharmacistService {

    @Autowired
    private PharmacistRepository pharmacistRepository;

    @Override
    public List<Pharmacist> getAllPharmacists() {
        return pharmacistRepository.findAll();
    }

    @Override
    public Pharmacist getPharmacistById(Long id) {
        return pharmacistRepository.findById(id).orElse(null);
    }

    @Override
    public Pharmacist savePharmacist(Pharmacist pharmacist) {
        return pharmacistRepository.save(pharmacist);
    }

    @Override
    public Pharmacist updatePharmacist(Long id, Pharmacist pharmacist) {
        Optional<Pharmacist> existingPharmacist = pharmacistRepository.findById(id);
        if (existingPharmacist.isPresent()) {
            pharmacist.setId(id);
            return pharmacistRepository.save(pharmacist);
        }
        return null;
    }

    @Override
    public void deletePharmacist(Long id) {
        pharmacistRepository.deleteById(id);
    }
}

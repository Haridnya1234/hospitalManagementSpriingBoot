package myPack.HospitalManagement.Service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Receptionist;
import myPack.HospitalManagement.Repository.ReceptionistRepository;
import myPack.HospitalManagement.Service.ReceptionistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReceptionistServiceImpl implements ReceptionistService {

    @Autowired
    private ReceptionistRepository receptionistRepository;

    @Override
    public List<Receptionist> getAllReceptionists() {
        return receptionistRepository.findAll();
    }

    @Override
    public Receptionist getReceptionistById(Long id) {
        return receptionistRepository.findById(id).orElse(null);
    }

    @Override
    public Receptionist saveReceptionist(Receptionist receptionist) {
        return receptionistRepository.save(receptionist);
    }

    @Override
    public Receptionist updateReceptionist(Long id, Receptionist receptionist) {
        Optional<Receptionist> existingReceptionist = receptionistRepository.findById(id);
        if (existingReceptionist.isPresent()) {
            receptionist.setId(id);
            return receptionistRepository.save(receptionist);
        }
        return null;
    }

    @Override
    public void deleteReceptionist(Long id) {
        receptionistRepository.deleteById(id);
    }
}

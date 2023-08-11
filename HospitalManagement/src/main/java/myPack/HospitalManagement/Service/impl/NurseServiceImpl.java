package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Nurse;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.NurseRepository;
import myPack.HospitalManagement.Service.NurseService;

@Service
public class NurseServiceImpl implements  NurseService
{
	@Autowired
    private NurseRepository nurseRepository;

    @Override
    public List<Nurse> getAllNurses() {
        return nurseRepository.findAll();
    }

    @Override
    public Nurse getNurseById(Long id) {
        return nurseRepository.findById(id).orElse(null);
    }

    @Override
    public Nurse saveNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    @Override
    public Nurse updateNurse(Long id, Nurse nurse) {
        Optional<Nurse> existingNurse = nurseRepository.findById(id);
        if (existingNurse.isPresent()) {
            nurse.setId(id);
            return nurseRepository.save(nurse);
        }
        return null;
    }

    @Override
    public void deleteNurse(Long id) {
        nurseRepository.deleteById(id);
    }
}

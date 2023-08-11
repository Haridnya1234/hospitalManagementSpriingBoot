package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Medicine;
import myPack.HospitalManagement.Entity.Payment;
import myPack.HospitalManagement.Entity.Prescription;
import myPack.HospitalManagement.Repository.PrescriptionRepository;
import myPack.HospitalManagement.Service.MedicineService;
import myPack.HospitalManagement.Service.PrescriptionService;
@Service
public class PrescriptionServiceImpl implements PrescriptionService
{
	 @Autowired
	    private PrescriptionRepository prescriptionRepository;

	    @Override
	    public List<Prescription> getAllPrescriptions() {
	        return prescriptionRepository.findAll();
	    }

	    @Override
	    public Prescription getPrescriptionById(Long id) {
	        return prescriptionRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Prescription savePrescription(Prescription prescription) {
	        return prescriptionRepository.save(prescription);
	    }

	    @Override
	    public Prescription updatePrescription(Long id, Prescription prescription) {
	        Optional<Prescription> existingPrescription = prescriptionRepository.findById(id);
	        if (existingPrescription.isPresent()) {
	            prescription.setId(id);
	            return prescriptionRepository.save(prescription);
	        }
	        return null;
	    }

	    @Override
	    public void deletePrescription(Long id) {
	        prescriptionRepository.deleteById(id);
	    }
}

package myPack.HospitalManagement.Service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Medicine;
import myPack.HospitalManagement.Repository.MedicineRepository;
import myPack.HospitalManagement.Service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService 
{
	 @Autowired
	    private MedicineRepository medicineRepository;

	    @Override
	    public List<Medicine> getAllMedicines() {
	        return medicineRepository.findAll();
	    }

	    @Override
	    public Medicine getMedicineById(Long id) {
	        return medicineRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Medicine saveMedicine(Medicine medicine) {
	        return medicineRepository.save(medicine);
	    }

	    @Override
	    public Medicine updateMedicine(Long id, Medicine medicine) {
	        Optional<Medicine> existingMedicine = medicineRepository.findById(id);
	        if (existingMedicine.isPresent()) {
	            medicine.setId(id);
	            return medicineRepository.save(medicine);
	        }
	        return null;
	    }

	    @Override
	    public void deleteMedicine(Long id) {
	        medicineRepository.deleteById(id);
	    }

}


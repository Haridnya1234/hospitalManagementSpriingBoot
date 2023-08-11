package myPack.HospitalManagement.Service;

import java.util.Date;
import java.util.List;

import myPack.HospitalManagement.Entity.Medicine;

public interface MedicineService 
{
	 List<Medicine> getAllMedicines();
	    Medicine getMedicineById(Long id);
	    Medicine saveMedicine(Medicine medicine);
	    Medicine updateMedicine(Long id, Medicine medicine);
	    void deleteMedicine(Long id);
}

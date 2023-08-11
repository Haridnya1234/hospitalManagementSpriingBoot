package myPack.HospitalManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myPack.HospitalManagement.Entity.Medicine;
import myPack.HospitalManagement.Service.MedicineService;

@RestController
@RequestMapping("/medicines")
public class MedicineController
{
	 @Autowired
	    private MedicineService medicineService;

	    @GetMapping("/getAllMedicines")
	    public List<Medicine> getAllMedicines() {
	        return medicineService.getAllMedicines();
	    }

	    @GetMapping("/{id}")
	    public Medicine getMedicineById(@PathVariable Long id) {
	        return medicineService.getMedicineById(id);
	    }

	    @PostMapping("/postMedicine")
	    public Medicine addMedicine(@RequestBody Medicine medicine) {
	        return medicineService.saveMedicine(medicine);
	    }

	    @PutMapping("/putMedicine")
	    public Medicine updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
	        return medicineService.updateMedicine(id, medicine);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteMedicine(@PathVariable Long id) {
	        medicineService.deleteMedicine(id);
	    }
	}


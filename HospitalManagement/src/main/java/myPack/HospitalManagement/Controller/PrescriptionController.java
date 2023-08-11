package myPack.HospitalManagement.Controller;

import java.util.ArrayList;
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

import myPack.HospitalManagement.Entity.Payment;
import myPack.HospitalManagement.Entity.Prescription;
import myPack.HospitalManagement.Repository.PrescriptionRepository;
import myPack.HospitalManagement.Service.PrescriptionService;

@RestController
@RequestMapping("/prescriptions")

public class PrescriptionController
{
	 @Autowired
	    private PrescriptionService prescriptionService;

	    @GetMapping("/getAllPrescription")
	    public List<Prescription> getAllPrescriptions() {
	        return prescriptionService.getAllPrescriptions();
	    }

	    @GetMapping("/{id}")
	    public Prescription getPrescriptionById(@PathVariable Long id) {
	        return prescriptionService.getPrescriptionById(id);
	    }

	    @PostMapping("/postPrescription")
	    public Prescription addPrescription(@RequestBody Prescription prescription) {
	        return prescriptionService.savePrescription(prescription);
	    }

	    @PutMapping("/putPrescription")
	    public Prescription updatePrescription(@PathVariable Long id, @RequestBody Prescription prescription) {
	        return prescriptionService.updatePrescription(id, prescription);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePrescription(@PathVariable Long id) {
	        prescriptionService.deletePrescription(id);
	    }
	}



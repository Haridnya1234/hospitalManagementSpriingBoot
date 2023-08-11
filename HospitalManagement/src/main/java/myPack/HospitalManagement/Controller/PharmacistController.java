package myPack.HospitalManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myPack.HospitalManagement.Entity.Pharmacist;
import myPack.HospitalManagement.Service.PharmacistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pharmacists")
@CrossOrigin("*")
public class PharmacistController {

	 @Autowired
	    private PharmacistService pharmacistService;

	    @GetMapping("/getAllPharmacists")
	    public List<Pharmacist> getAllPharmacists() {
	        return pharmacistService.getAllPharmacists();
	    }

	    @GetMapping("/{id}")
	    public Pharmacist getPharmacistById(@PathVariable Long id) {
	        return pharmacistService.getPharmacistById(id);
	    }

	    @PostMapping("/postPharmacist")
	    public Pharmacist addPharmacist(@RequestBody Pharmacist pharmacist) {
	        return pharmacistService.savePharmacist(pharmacist);
	    }

	    @PutMapping("/{id}")
	    public Pharmacist updatePharmacist(@PathVariable Long id, @RequestBody Pharmacist pharmacist) {
	        return pharmacistService.updatePharmacist(id, pharmacist);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePharmacist(@PathVariable Long id) {
	        pharmacistService.deletePharmacist(id);
	    }
	}

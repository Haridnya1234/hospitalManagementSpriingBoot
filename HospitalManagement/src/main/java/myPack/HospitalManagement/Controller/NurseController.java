package myPack.HospitalManagement.Controller;

import java.util.ArrayList;
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

import myPack.HospitalManagement.Entity.Nurse;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.NurseRepository;
import myPack.HospitalManagement.Service.NurseService;

@RestController
@RequestMapping("/nurses")
@CrossOrigin("*")
public class NurseController 
{
	 @Autowired
	    private NurseService nurseService;

	    @GetMapping("/getAllNurse")
	    public List<Nurse> getAllNurses() {
	        return nurseService.getAllNurses();
	    }

	    @GetMapping("/{id}")
	    public Nurse getNurseById(@PathVariable Long id) {
	        return nurseService.getNurseById(id);
	    }

	    @PostMapping("/postNurse")
	    public Nurse addNurse(@RequestBody Nurse nurse) {
	        return nurseService.saveNurse(nurse);
	    }

	    @PutMapping("/putNurse")
	    public Nurse updateNurse(@PathVariable Long id, @RequestBody Nurse nurse) {
	        return nurseService.updateNurse(id, nurse);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteNurse(@PathVariable Long id) {
	        nurseService.deleteNurse(id);
	    }
	}

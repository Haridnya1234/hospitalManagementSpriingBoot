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

import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController 
{

	@Autowired
	private PatientService patientService;
	@Autowired
	private PatientRepository patientrepository;
	
	//creating user
	@PostMapping("/postPatient")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return this.patientService.createPatient(patient);
	}
	@GetMapping("/{username}")
	public Patient getPatient(@PathVariable("username") String username)
	{
		return this.patientService.getPatient(username);
	}
	
	@DeleteMapping("/{patientid}")
	public void deletePatient(@PathVariable("patientid") Long id)
	{
		this.patientService.deletePatient(id);
	}
	
	@PutMapping("/putPatient")
	public Patient updatePatient(@RequestBody Patient patient)
	{
		return this.patientService.updatePatient(patient);
	}
	//getting list of users
	@GetMapping("/getAllPatients")
	public ResponseEntity<List<Patient>> getAllPatients()
	{
		List<Patient> patientList=new ArrayList<>();
		patientrepository.findAll().forEach(patientList :: add);
		return new ResponseEntity<List<Patient>>(patientList,HttpStatus.OK);
	}
	
	
}

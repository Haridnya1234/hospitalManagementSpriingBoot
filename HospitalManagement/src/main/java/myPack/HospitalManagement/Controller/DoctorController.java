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
import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.DoctorRepository;
import myPack.HospitalManagement.Service.DoctorService;
@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController 
{
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private DoctorRepository doctorRepository; 

		@PostMapping("/postDoctor")
		public Doctor createDoctor(@RequestBody Doctor doctor)
		{
			return this.doctorService.createDoctor(doctor);
		}
		@GetMapping("/{username}")
		public Doctor getDoctor(@PathVariable("username") String username)
		{
			return this.doctorService.getDoctor(username);
		}

		@DeleteMapping("/{doctorId}")
		public void deleteDoctor(@PathVariable("doctorId") Long id)
		{
			this.doctorService.deleteDoctor(id);
		}
		
		@PutMapping("/putDoctor")
		public Doctor updateDoctor(@RequestBody Doctor doctor)
		{
			return this.doctorService.updateDoctor(doctor);
		}
		
		@GetMapping("/{specialization}")
		public Doctor  getSpecialization(@PathVariable("specialization") String specialization)
		{
			return this.doctorService.getSpecialization(specialization);
		}
	
		@GetMapping("/getAllDoctors")
		public ResponseEntity<List<Doctor>> getAllDoctors()
		{
			List<Doctor> docList=new ArrayList<>();
			doctorRepository.findAll().forEach(docList :: add);
			return new ResponseEntity<List<Doctor>>(docList,HttpStatus.OK);
		}
		
}


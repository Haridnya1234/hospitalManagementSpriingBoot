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
import myPack.HospitalManagement.Entity.Admin;
import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.AdminRepository;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.AdminService;
import myPack.HospitalManagement.Service.PatientService;


@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController
{
	 //*******************************************Admin Controller**********************************************//

		@Autowired
		private AdminService adminService;
		@Autowired
		private AdminRepository adminrepository;
		
		@PostMapping("/postAdmin")
		public Admin createAdmin(@RequestBody Admin admin)
		{
			return this.adminService.createAdmin(admin);
		}
		
		@GetMapping("/{username}")
		public Admin getAdmin(@PathVariable("username") String username)
		{
			return this.adminService.getAdmin(username);
		}
		
		@DeleteMapping("/{adminid}")
		public void deleteAdmin(@PathVariable("adminid") Long id)
		{
			this.adminService.deleteAdmin(id);
		}
		
		@PutMapping("/putAdmin")
		public Admin updateAdmin(@RequestBody Admin admin)
		{
			return this.adminService.updateAdmin(admin);
		}
		
	  
}

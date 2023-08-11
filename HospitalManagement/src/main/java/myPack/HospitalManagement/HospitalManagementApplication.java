package myPack.HospitalManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import myPack.HospitalManagement.Entity.Admin;
import myPack.HospitalManagement.Service.AdminService;
import myPack.HospitalManagement.Service.LabTestService;
import myPack.HospitalManagement.Service.PatientService;

@SpringBootApplication
public class HospitalManagementApplication implements CommandLineRunner
{
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private LabTestService labtestService;
	
	@Autowired
	private AdminService adminService;
	
	

	public static void main(String[] args)
	{
		SpringApplication.run(HospitalManagementApplication.class, args);

		System.out.println("ok...........");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}

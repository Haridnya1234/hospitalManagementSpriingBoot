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
import myPack.HospitalManagement.Entity.LabTest;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.LabTestRepository;
import myPack.HospitalManagement.Service.LabTestService;
@RestController
@RequestMapping("/labtest")
@CrossOrigin("*")
public class LabTestcontroller 
{
	@Autowired
	private LabTestService labtestService;
			
	@Autowired
	private LabTestRepository  labtestRepository;
		
	@PostMapping("/postLabTest")
	public LabTest createLabTest(@RequestBody LabTest labTest)
	{
		return this.labtestService.createLabTest(labTest);	
	}		
	@GetMapping("/{testname}")	
	public LabTest getLabTest(@PathVariable("testname") String testname)
	{
		return this.labtestService.getLabTest(testname);
	}			
	@DeleteMapping("/{labid}")
	public void deleteLabTest(@PathVariable("labid") Long id)
	{
		this.labtestService.deleteLabTest(id);
	}			
	@PutMapping("/putLabTest")
	public LabTest updateLabTest(@RequestBody LabTest labTest)
	{
		return this.labtestService.updateLabTest(labTest);
	}			
	@GetMapping("/getAlllabtests")
	public ResponseEntity<List<LabTest>> getAllLabtests()
	{
		List<LabTest> testList=new ArrayList<>();
		labtestRepository.findAll().forEach(testList :: add);
		return new ResponseEntity<List<LabTest>>(testList,HttpStatus.OK);
	}

}

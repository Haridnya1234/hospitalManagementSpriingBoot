package myPack.HospitalManagement.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myPack.HospitalManagement.Entity.LabTest;
import myPack.HospitalManagement.Repository.LabTestRepository;
import myPack.HospitalManagement.Service.LabTestService;
@Service
public class LabTestServiceImpl implements LabTestService
{
	@Autowired
	private LabTestRepository labtestRepository;

	@Override
	public LabTest createLabTest(LabTest labTest)
	{
		return this.labtestRepository.save(labTest);
	}

	@Override
	public void deleteLabTest(Long id)
	{
		this.labtestRepository.deleteById(id);		
	}

	@Override
	public LabTest updateLabTest(LabTest labTest) 
	{
		return this.labtestRepository.save(labTest);
	}

	@Override
	public LabTest getLabTest(String testname) 
	{
		return this.labtestRepository.findByTestname(testname);
	}
}


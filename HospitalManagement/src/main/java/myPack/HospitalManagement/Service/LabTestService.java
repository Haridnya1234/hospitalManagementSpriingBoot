package myPack.HospitalManagement.Service;

import java.util.List;
import myPack.HospitalManagement.Entity.LabTest;
import myPack.HospitalManagement.Entity.Patient;

public interface LabTestService
{		
	public LabTest createLabTest(LabTest labTest);
	public void deleteLabTest(Long id);
	public LabTest updateLabTest(LabTest labTest);
	public LabTest getLabTest(String testname);

}

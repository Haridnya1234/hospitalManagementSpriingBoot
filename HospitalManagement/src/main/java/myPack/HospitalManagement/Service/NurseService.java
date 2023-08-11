package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Nurse;
import myPack.HospitalManagement.Entity.Patient;

public interface NurseService
{
	 List<Nurse> getAllNurses();
	    
	    Nurse getNurseById(Long id);
	    
	    Nurse saveNurse(Nurse nurse);
	    
	    Nurse updateNurse(Long id, Nurse nurse);
	    
	    void deleteNurse(Long id);
	
}

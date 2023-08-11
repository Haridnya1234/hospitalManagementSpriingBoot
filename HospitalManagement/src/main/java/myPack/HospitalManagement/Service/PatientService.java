package myPack.HospitalManagement.Service;

import myPack.HospitalManagement.Entity.Patient;
public interface PatientService 
{
	public Patient createPatient(Patient patient);
	
	public void deletePatient(Long id);
		
	public Patient updatePatient(Patient patient);
	
	public Patient getPatient(String username);
	
//	Patient getPatientById(Long id);
}

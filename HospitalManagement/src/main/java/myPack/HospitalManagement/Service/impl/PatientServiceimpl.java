package myPack.HospitalManagement.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.PatientService;
@Service
public class PatientServiceimpl implements PatientService
{
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient createPatient(Patient patient)
	{
		return this.patientRepository.save(patient);
	}
	/*@Override
	public Patient getPatient(Long id) {
		 this.patientRepository.findById(id);
		return null;			
	}*/
	@Override
	public void deletePatient(Long id)
	{
		this.patientRepository.deleteById(id);
	}
	@Override
	public Patient updatePatient(Patient patient) 
	{
		return this.patientRepository.save(patient);
	}
	
	@Override
	public Patient getPatient(String username) 
	{
		return this.patientRepository.findByUsername(username);
	}
	
//	@Override
//	public Patient getPatientById(Long id) {
//		// TODO Auto-generated method stub
//		return patientRepository.findById(id).orElse(null);
//	}
}

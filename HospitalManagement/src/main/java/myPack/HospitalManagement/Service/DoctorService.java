package myPack.HospitalManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.DoctorRepository;
@Service
@Transactional
public interface DoctorService
{
	public static final DoctorRepository doctorRepository = null;
	public static List<Doctor> listAll()
	{
		return doctorRepository.findAll();
	}
		
	public Doctor createDoctor(Doctor doctor);
		
	public void deleteDoctor(Long id);
	
	public Doctor updateDoctor(Doctor doctor);

	public Doctor getSpecialization(String specialization);
	
	public Doctor getDoctor(String username);
			
}

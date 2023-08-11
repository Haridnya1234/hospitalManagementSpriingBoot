package myPack.HospitalManagement.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Doctor;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.DoctorRepository;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.DoctorService;
@Service
public class DoctorServiceimpl  implements DoctorService
{	
			@Autowired
			private DoctorRepository doctorRepository;

			@Override
			public Doctor createDoctor(Doctor doctor) 
			{
				return this.doctorRepository.save(doctor);
			}

			@Override
			public void deleteDoctor(Long id)
			{
				this.doctorRepository.deleteById(id);
			}

			@Override
			public Doctor updateDoctor(Doctor doctor) 
			{
				return this.doctorRepository.save(doctor);
			}

			@Override
			public Doctor getSpecialization(String specialization) 
			{
				return this.doctorRepository.findBySpecialization(specialization);
			}

			@Override
			public Doctor getDoctor(String username) 
			{
				return this.doctorRepository.findByUsername(username);

			}
			
}

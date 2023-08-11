package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myPack.HospitalManagement.Entity.Appointment;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.AppointmentRepository;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService
{
	 @Autowired
	    private AppointmentRepository appointmentRepository;

	    @Override
	    public List<Appointment> getAllAppointments() {
	        return appointmentRepository.findAll();
	    }

	    @Override
	    public Appointment getAppointmentById(Long id) {
	        return appointmentRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Appointment saveAppointment(Appointment appointment) {
	        return appointmentRepository.save(appointment);
	    }

	    @Override
	    public Appointment updateAppointment(Long id, Appointment appointment) {
	        Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
	        if (existingAppointment.isPresent()) {
	            appointment.setId(id);
	            return appointmentRepository.save(appointment);
	        }
	        return null;
	    }

	    @Override
	    public void deleteAppointment(Long id) {
	        appointmentRepository.deleteById(id);
	    }
}

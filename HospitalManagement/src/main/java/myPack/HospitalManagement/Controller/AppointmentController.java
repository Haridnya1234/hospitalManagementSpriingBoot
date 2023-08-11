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

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import myPack.HospitalManagement.Entity.Appointment;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.AppointmentRepository;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.AppointmentService;
import myPack.HospitalManagement.Service.PatientService;
import myPack.HospitalManagement.Service.impl.AppointmentServiceImpl;

@RestController
@RequestMapping("/appointments")
@CrossOrigin("*")

public class AppointmentController 
{
	 @Autowired
	    private AppointmentService appointmentService;

	    @GetMapping("/getAllAppointment")
	    public List<Appointment> getAllAppointments() {
	        return appointmentService.getAllAppointments();
	    }

	    @GetMapping("/{id}")
	    public Appointment getAppointmentById(@PathVariable Long id) {
	        return appointmentService.getAppointmentById(id);
	    }

	    @PostMapping("/postAppointment")
	    public Appointment addAppointment(@RequestBody Appointment appointment) {
	        return appointmentService.saveAppointment(appointment);
	    }

	    @PutMapping("/putAppointment")
	    public Appointment updateAppointment(@PathVariable Long id, @RequestBody Appointment appointment) {
	        return appointmentService.updateAppointment(id, appointment);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteAppointment(@PathVariable Long id) {
	        appointmentService.deleteAppointment(id);
	    }
}

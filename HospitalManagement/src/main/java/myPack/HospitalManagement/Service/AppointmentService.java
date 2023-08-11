package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.Appointment;

public interface AppointmentService
{
	List<Appointment> getAllAppointments();
    Appointment getAppointmentById(Long id);
    Appointment saveAppointment(Appointment appointment);
    Appointment updateAppointment(Long id, Appointment appointment);
    void deleteAppointment(Long id);
}

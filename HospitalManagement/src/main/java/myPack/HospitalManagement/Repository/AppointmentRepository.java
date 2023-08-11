package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.Accountant;
import myPack.HospitalManagement.Entity.Appointment;
import myPack.HospitalManagement.Entity.Patient;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> 
{
	public Appointment findById(long id);
	public Appointment deleteById(long id);
	public Appointment findByappointmentTime(String appointmentTime);
}

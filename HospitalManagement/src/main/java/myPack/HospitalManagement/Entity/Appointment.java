package myPack.HospitalManagement.Entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Appointment
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String fullname;
	private String email;
	private long contactno;
    private String appointmentTime;
    private LocalDate appointmentDate;
    private String status; 
    private String healthProblem; 
    private String age;
    public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	private String gender;
    
//    @ManyToOne
//    @JoinColumn(name = "doctor_id", referencedColumnName = "doctorId")
//    private Doctor doctor;
//
//    @ManyToOne
//    @JoinColumn(name = "patient_id", referencedColumnName = "Id")
//    private Patient patient;
//    @ManyToOne
//    @JoinColumn(name = "receptionist_id")
//    private Receptionist receptionist;
//    
	

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public String getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHealthProblem() {
		return healthProblem;
	}

	public void setHealthProblem(String healthProblem) {
		this.healthProblem = healthProblem;
	}

	public Appointment(Long id, String fullname, String email, long contactno, String appointmentTime,
			LocalDate appointmentDate, String status, String healthProblem, String age, String gender) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.contactno = contactno;
		this.appointmentTime = appointmentTime;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.healthProblem = healthProblem;
		this.age = age;
		this.gender = gender;
	}
	
   
}

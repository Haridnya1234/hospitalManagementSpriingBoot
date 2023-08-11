package myPack.HospitalManagement.Entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long doctorId;
	private String doctorFirstName;
	private String doctorLastName;
	private String email;
	private String username;
	private	String password;
	private String address;
	private long contact;
	private int age;
	private String gender;
	private String degree;
	private String specialization;
	private String experience;
	
//	 @OneToMany(mappedBy = "doctor")
//	 private List<DiagnosticReport> diagnosticReports;
//	    
//	 @OneToMany(mappedBy = "doctor")
//	 private List<Appointment> appointments;
//	
	public Long getDoctorId()
	{
		return doctorId;
	}
	public void setDoctorId(Long doctorId) 
	{
		this.doctorId = doctorId;
	}
	public String getDoctorFirstName() 
	{
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName)
	{
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() 
	{
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) 
	{
		this.doctorLastName = doctorLastName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	public long getContact() 
	{
		return contact;
	}
	public void setContact(long contact)
	{
		this.contact = contact;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) 
	{
		this.specialization = specialization;
	}
	public String getExperience() 
	{
		return experience;
	}
	public void setExperience(String experience) 
	{
		this.experience = experience;
	}
	
//	public List<DiagnosticReport> getDiagnosticReports() 
//	{
//		return diagnosticReports;
//	}
//	public void setDiagnosticReports(List<DiagnosticReport> diagnosticReports)
//	{
//		this.diagnosticReports = diagnosticReports;
//	}
//	public List<Appointment> getAppointments()
//	{
//		return appointments;
//	}
//	public void setAppointments(List<Appointment> appointments) 
//	{
//		this.appointments = appointments;
//	}
	
	
	
	public Doctor()
	{
		super();
	}
	public Doctor(Long doctorId, String doctorFirstName, String doctorLastName, String email, String username,
			String password, String address, long contact, int age, String gender, String degree, String specialization,
			String experience) {
		super();
		this.doctorId = doctorId;
		this.doctorFirstName = doctorFirstName;
		this.doctorLastName = doctorLastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.age = age;
		this.gender = gender;
		this.degree = degree;
		this.specialization = specialization;
		this.experience = experience;
	}
	
}

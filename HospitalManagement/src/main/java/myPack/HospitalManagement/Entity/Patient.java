package myPack.HospitalManagement.Entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String firstname;
	@Column(nullable=false)
	private String lastname;
	@Column(nullable=false, unique=true)
	private String email;
	@Column(nullable=false, unique=true)
	private String username;
	private	String password;
	private String address;
	@Column(nullable=false, length=10)
	private long contact;
	private int age;
	private String gender;
	private String bloodgroup;
	 private String testname;
	 private String doctorname;
	
//	 @OneToMany(mappedBy = "patient")
//	 private List<DiagnosticReport> diagnosticReports;
//
//    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
//    private List<Prescription> prescriptions;
//    
//    @OneToMany(mappedBy = "patient")
//    private List<Appointment> appointments;
//	
	
	public String getTestname() {
		return testname;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public Long getId() 
	{
		return id;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public String getFirstname() 
	{
		return firstname;
	}
	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}
	public String getLastname() 
	{
		return lastname;
	}
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
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
	public String getBloodgroup() 
	{
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup)
	{
		this.bloodgroup = bloodgroup;
	}
	
//	public List<DiagnosticReport> getDiagnosticReports() 
//	{
//		return diagnosticReports;
//	}
//	public void setDiagnosticReports(List<DiagnosticReport> diagnosticReports)
//	{
//		this.diagnosticReports = diagnosticReports;
//	}
//	public List<Prescription> getPrescriptions() 
//	{
//		return prescriptions;
//	}
//	public void setPrescriptions(List<Prescription> prescriptions) 
//	{
//		this.prescriptions = prescriptions;
//	}
//	public List<Appointment> getAppointments()
//	{
//		return appointments;
//	}
//	public void setAppointments(List<Appointment> appointments) 
//	{
//		this.appointments = appointments;
//	}
	
	public Patient()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(Long id, String firstname, String lastname, String email, String username, String password,
			String address, long contact, int age, String gender, String bloodgroup, String testname,
			String doctorname)
	{
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.age = age;
		this.gender = gender;
		this.bloodgroup = bloodgroup;
		this.testname = testname;
		this.doctorname = doctorname;
		
	}		
}

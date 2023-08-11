package myPack.HospitalManagement.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Nurse 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nurseFirstName;
    private String nurseLastName;
    private String email;
    private String username;
    private String password;
    private String address;
    private long contact;
    private int age;
    private String gender;
    
    @OneToMany(mappedBy = "nurse")
    private List<DiagnosticReport> diagnosticReports;
    
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor assistantToDoctor;

	public Long getId() 
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getNurseFirstName()
	{
		return nurseFirstName;
	}
	public void setNurseFirstName(String nurseFirstName)
	{
		this.nurseFirstName = nurseFirstName;
	}
	public String getNurseLastName()
	{
		return nurseLastName;
	}
	public void setNurseLastName(String nurseLastName)
	{
		this.nurseLastName = nurseLastName;
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
	public List<DiagnosticReport> getDiagnosticReports()
	{
		return diagnosticReports;
	}
	public void setDiagnosticReports(List<DiagnosticReport> diagnosticReports)
	{
		this.diagnosticReports = diagnosticReports;
	}
	public Doctor getAssistantToDoctor() 
	{
		return assistantToDoctor;
	}
	public void setAssistantToDoctor(Doctor assistantToDoctor)
	{
		this.assistantToDoctor = assistantToDoctor;
	}

	public Nurse(Long id, String nurseFirstName, String nurseLastName, String email, String username, String password,
			String address, long contact, int age, String gender, List<DiagnosticReport> diagnosticReports,
			Doctor assistantToDoctor)
	{
		super();
		this.id = id;
		this.nurseFirstName = nurseFirstName;
		this.nurseLastName = nurseLastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
		this.contact = contact;
		this.age = age;
		this.gender = gender;
		this.diagnosticReports = diagnosticReports;
		this.assistantToDoctor = assistantToDoctor;
	}
	public Nurse() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
}


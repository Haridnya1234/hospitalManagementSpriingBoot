package myPack.HospitalManagement.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accountant
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String accountantName;
	@Column(nullable=false, unique=true)
	private String email;
	@Column(nullable=false, unique=true)
	private String username;
	private String password;
	
	public Long getId() 
	{
		return id;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public String getAccountantName()
	{
		return accountantName;
	}
	public void setAccountantName(String accountantName) 
	{
		this.accountantName = accountantName;
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
	
	public Accountant(Long id, String accountantName, String email, String username, String password) 
	{
		super();
		this.id = id;
		this.accountantName = accountantName;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public Accountant() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
}

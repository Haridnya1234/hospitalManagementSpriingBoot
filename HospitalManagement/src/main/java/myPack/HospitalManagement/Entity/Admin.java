package myPack.HospitalManagement.Entity;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="AdminUser")

public class Admin 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private long mobno;
    @Column(nullable=false)
    private String fname;
    
    @Column(nullable=false)
    private String lname;
    
    @Column(nullable=false, unique=true)
    private String username;

    @Column(nullable=false, unique=true)
    private String email;

    @Column(nullable=false)
    private String password;

//    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
//   @JoinTable(name="Admin_Role", joinColumns={@jakarta.persistence.JoinColumn(name="USER_ID", referencedColumnName="ID")},
//            inverseJoinColumns={@jakarta.persistence.JoinColumn(name="ROLE_ID", referencedColumnName = "ID")})
    
	public Long getId() 
	{
		return id;
	}

	public String getFname() 
	{
		return fname;
	}

	public void setFname(String fname) 
	{
		this.fname = fname;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) 
	{
		this.lname = lname;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getPassword() 
	{
		return password;
	}

	public long getMobno()
	{
		return mobno;
	}

	public void setMobno(long mobno)
	{
		this.mobno = mobno;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}


	public Admin(Long id,  String fname, String lname, String username, String email, String password, long mobno) {
		
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobno = mobno;
	}

	public Admin()
	{
		super();
	}
	
	
}

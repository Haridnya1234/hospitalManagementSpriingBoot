package myPack.HospitalManagement.Entity;

import java.util.HashSet;
import java.util.Set;



import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "lab_test")
public class LabTest 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @NotBlank
	    private String testname;
	    private String testsample;
	    private String testduration;
	    private Long priceInRS;

	    
//	    @ManyToMany(cascade = CascadeType.ALL , fetch =  FetchType.EAGER , mappedBy = "labTest")
//	    @JsonIgnore
//		Set<Patient> patient = new HashSet<>();
	    //private Patient patient;
	   /* @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "date_created")
	    private Date dateCreated = new Date();*/

	   /* @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "date_updated")
	    private Date dateUpdated = new Date();*/

		public Long getId()
		{
			return id;
		}

		public void setId(Long id)
		{
			this.id = id;
		}

		public String getTestname() 
		{
			return testname;
		}

		public void setTestname(String testname)
		{
			this.testname = testname;
		}

		public String getTestsample() {
			return testsample;
		}

		public void setTestsample(String testsample) {
			this.testsample = testsample;
		}

		public String getTestduration() {
			return testduration;
		}

		public void setTestduration(String testduration) {
			this.testduration = testduration;
		}

		public Long getPriceInRS() 
		{
			return priceInRS;
		}

		public void setPriceInRS(Long priceInRS) 
		{
			this.priceInRS = priceInRS;
		}

		/*public Date getDateCreated() 
		{
			return dateCreated;
		}

		public void setDateCreated(Date dateCreated)
		{
			this.dateCreated = dateCreated;
		}

		public Date getDateUpdated()
		{
			return dateUpdated;
		}

		public void setDateUpdated(Date dateUpdated) 
		{
			this.dateUpdated = dateUpdated;
		}*/

		

		public LabTest() 
		{
			super();
		}




//		public Set<Patient> getPatient() {
//			return patient;
//		}
//
//		public void setPatient(Set<Patient> patient) {
//			this.patient = patient;
//		}

		public LabTest(Long id, @NotBlank String testname, String testsample, String testduration, Long priceInRS)
		{
			super();
			this.id = id;
			this.testname = testname;
			this.testsample = testsample;
			this.testduration = testduration;
			this.priceInRS = priceInRS;
		}    
}

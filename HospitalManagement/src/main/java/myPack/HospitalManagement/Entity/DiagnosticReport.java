package myPack.HospitalManagement.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DiagnosticReport
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    // Add properties related to the diagnostic report
	    private String description;
	    
	    @ManyToOne
	    @JoinColumn(name= "nurse_id")
	    private Nurse nurse;
	    
	    @ManyToOne
	    @JoinColumn(name = "doctor_id")
	    private Doctor doctor;
	    
	    @ManyToOne
	    @JoinColumn(name = "patient_id")
	    private Patient patient;

		public Long getId() 
		{
			return id;
		}

		public void setId(Long id)
		{
			this.id = id;
		}

		public String getDescription() 
		{
			return description;
		}

		public void setDescription(String description)
		{
			this.description = description;
		}

		

		public Doctor getDoctor()
		{
			return doctor;
		}

		public void setDoctor(Doctor doctor) 
		{
			this.doctor = doctor;
		}

		public Patient getPatient()
		{
			return patient;
		}

		public void setPatient(Patient patient) 
		{
			this.patient = patient;
		}
		

		public Nurse getNurse() {
			return nurse;
		}

		public void setNurse(Nurse nurse) {
			this.nurse = nurse;
		}

		public DiagnosticReport(Long id, String description, Doctor doctor, Patient patient, Nurse nurse) 
		{
			super();
			this.id = id;
			this.description = description;
			this.nurse=nurse;
			this.doctor = doctor;
			this.patient = patient;
		}

		public DiagnosticReport()
		{
			super();
			// TODO Auto-generated constructor stub
		}
}
		
	
package myPack.HospitalManagement.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Prescription
{
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String description; // Doctor's description
	    private int dosage;
	    private int durationInDays;
	    private String timing; // 'Morning' or 'Evening'

	 
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
		public int getDosage() 
		{
			return dosage;
		}
		public void setDosage(int dosage) 
		{
			this.dosage = dosage;
		}
		public int getDurationInDays() 
		{
			return durationInDays;
		}
		public void setDurationInDays(int durationInDays)
		{
			this.durationInDays = durationInDays;
		}
		public String getTiming() 
		{
			return timing;
		}
		public void setTiming(String timing) 
		{
			this.timing = timing;
		}
		public Prescription(Long id, String description, int dosage, int durationInDays, String timing) {
			super();
			this.id = id;
			this.description = description;
			this.dosage = dosage;
			this.durationInDays = durationInDays;
			this.timing = timing;
		}
		public Prescription() {
			super();
			// TODO Auto-generated constructor stub
		}
		


}


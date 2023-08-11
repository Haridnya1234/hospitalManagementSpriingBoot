package myPack.HospitalManagement.Entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Invoice
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String invoiceNumber;
	    private double amount;
	    private LocalDate date;
	    
	    private String description;


		public Long getId() 
		{
			return id;
		}

		public void setId(Long id)
		{
			this.id = id;
		}

		public String getInvoiceNumber() 
		{
			return invoiceNumber;
		}

		public void setInvoiceNumber(String invoiceNumber)
		{
			this.invoiceNumber = invoiceNumber;
		}

		public double getAmount() 
		{
			return amount;
		}

		public void setAmount(double amount)
		{
			this.amount = amount;
		}

		public LocalDate getDate() 
		{
			return date;
		}

		public void setDate(LocalDate date) 
		{
			this.date = date;
		}

		

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Invoice(Long id, String invoiceNumber, double amount, LocalDate date, String description) {
			super();
			this.id = id;
			this.invoiceNumber = invoiceNumber;
			this.amount = amount;
			this.date = date;
			this.description = description;
		
		}

		public Invoice() {
			super();
			// TODO Auto-generated constructor stub
		}

		
}


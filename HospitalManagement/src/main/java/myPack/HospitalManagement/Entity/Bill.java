package myPack.HospitalManagement.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Bill 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String billNumber;
	    private double amount;
	    private LocalDate date;
	    private String description;
	    
	    @Column(name = "accountant_id")
	    private Long accountantId;

		public Long getId()
		{
			return id;
		}

		public void setId(Long id)
		{
			this.id = id;
		}

		public String getBillNumber() 
		{
			return billNumber;
		}

		public void setBillNumber(String billNumber)
		{
			this.billNumber = billNumber;
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

		public Long getAccountantId() {
			return accountantId;
		}

		public void setAccountantId(Long accountantId) {
			this.accountantId = accountantId;
		}

		public Bill(Long id, String billNumber, double amount, LocalDate date, String description, Long accountantId) {
			super();
			this.id = id;
			this.billNumber = billNumber;
			this.amount = amount;
			this.date = date;
			this.description = description;
			this.accountantId = accountantId;
		}

		public Bill() {
			super();
			// TODO Auto-generated constructor stub
		}

}

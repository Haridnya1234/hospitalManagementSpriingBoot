package myPack.HospitalManagement.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine 
{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String medicineName;
	    private String batchNumber;
	    private LocalDate manufactureDate;
	    private LocalDate expiryDate;
	    private int stock;
	    
//	    @Column(name="pharmacist_Id")
//	    private Long pharmacistId;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getMedicineName() {
			return medicineName;
		}
		public void setMedicineName(String medicineName) {
			this.medicineName = medicineName;
		}
		public String getBatchNumber() {
			return batchNumber;
		}
		public void setBatchNumber(String batchNumber) {
			this.batchNumber = batchNumber;
		}
		public LocalDate getManufactureDate() {
			return manufactureDate;
		}
		public void setManufactureDate(LocalDate manufactureDate) {
			this.manufactureDate = manufactureDate;
		}
		public LocalDate getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(LocalDate expiryDate) {
			this.expiryDate = expiryDate;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		public Medicine(Long id, String medicineName, String batchNumber, LocalDate manufactureDate, LocalDate expiryDate,
				int stock) {
			super();
			this.id = id;
			this.medicineName = medicineName;
			this.batchNumber = batchNumber;
			this.manufactureDate = manufactureDate;
			this.expiryDate = expiryDate;
			this.stock = stock;
		}
		public Medicine() {
			super();
			// TODO Auto-generated constructor stub
		}

}


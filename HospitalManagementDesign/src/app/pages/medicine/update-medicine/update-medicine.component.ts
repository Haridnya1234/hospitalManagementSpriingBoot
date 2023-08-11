import { Component,OnInit } from '@angular/core';
import { Router ,ActivatedRoute} from '@angular/router';
import { Medicine } from 'src/app/service/medicine';
import { MedicineService } from 'src/app/service/medicine.service';
@Component({
  selector: 'app-update-medicine',
  templateUrl: './update-medicine.component.html',
  styleUrls: ['./update-medicine.component.css']
})
export class UpdateMedicineComponent implements OnInit{
  id!: number;
  medicine: Medicine = new Medicine();
  error: string | null = null;

  constructor(
    private medicineService: MedicineService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.getMedicineById();
  }

  getMedicineById() {
    this.medicineService.getMedicineById(this.id).subscribe(
      data => {
        this.medicine = data;
      },
      error => {
        this.error = error.message || 'An error occurred while fetching the medicine details.';
        console.error(this.error);
      }
    );
  }

  updateMedicine() {
    this.medicineService.updateMedicine(this.id, this.medicine).subscribe(
      data => {
        console.log(data); // Log the response from the backend for debugging purposes
        this.medicine=new Medicine();
        this.goToMedicineList();
      },
      error => {
        this.error = error.message || 'An error occurred while updating the medicine.';
        console.error(this.error);
      }
    );
  }

 

  onSubmit() {
    this.medicineService.updateMedicine(this.id,this.medicine).subscribe(data=>{
      this.goToMedicineList

    },error=>console.log(error));
  }

  goToMedicineList() {
    this.router.navigate(['/medicines']);
  }
}

import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Medicine } from 'src/app/service/medicine';
import { MedicineService } from 'src/app/service/medicine.service';
@Component({
  selector: 'app-medicine-list',
  templateUrl: './medicine-list.component.html',
  styleUrls: ['./medicine-list.component.css']
})
export class MedicineListComponent {
  medicines!: Medicine[];
 

  constructor(private medicineService:MedicineService, private router:Router){}
  ngOnInit(): void {
    this.getAllMedicines();
  }


  private getAllMedicines() {
   this.medicineService.getMedicineList().subscribe(data=>{
    this.medicines=data;
   })
  }


  updateMedicine(id:number){
    this.router.navigate(['update-medicine',id]);

  }

  deleteMedicine(id:number){
    this.medicineService.deleteMedicine(id).subscribe(data=>{
      console.log(data);
      this.getAllMedicines();
    })

  }
}

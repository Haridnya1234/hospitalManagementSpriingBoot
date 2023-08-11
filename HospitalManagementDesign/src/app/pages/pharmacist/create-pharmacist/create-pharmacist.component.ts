import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Pharmacist } from 'src/app/service/pharmacist';
import { PharmacistService } from 'src/app/service/pharmacist.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-create-pharmacist',
  templateUrl: './create-pharmacist.component.html',
  styleUrls: ['./create-pharmacist.component.css']
})
export class CreatePharmacistComponent {

  pharmacist: Pharmacist = new Pharmacist();

  constructor(private pharmacistService: PharmacistService, private router: Router) {}

  ngOnInit(): void {
    // Initialization logic, if needed, can be added here.
  }

  savePharmacist() {
    this.pharmacistService.createPharmacist(this.pharmacist).subscribe(
      data => {
        Swal.fire(this.pharmacist.userName+" Registration Successful"+" Welcome To LifeLine Hospital");
        this.router.navigate(['/HospitalManagement'])
        console.log(data);
        this.goToPharmacistList();
      },
      error => console.error(error)
    );
  }
    

  goToPharmacistList() {
    this.router.navigate(['/pharmacists']);
  }

  onSubmit() {
    console.log(this.pharmacist);
    this.savePharmacist();
  }
}

import { Component,OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Pharmacist } from 'src/app/service/pharmacist';
import { PharmacistService } from 'src/app/service/pharmacist.service';
@Component({
  selector: 'app-update-pharmacist',
  templateUrl: './update-pharmacist.component.html',
  styleUrls: ['./update-pharmacist.component.css']
})
export class UpdatePharmacistComponent implements OnInit {

  id!: number;
  pharmacist: Pharmacist = new Pharmacist();
  error: string | null = null;


  constructor(
    private pharmacistService: PharmacistService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.getPharmacistById();
  }

  getPharmacistById() {
    this.pharmacistService.getPharmacistById(this.id).subscribe(
      data => {
        this.pharmacist = data;
      },
      error => {
        this.error = error.message || 'An error occurred while fetching the medicine details.';
        console.error(this.error);
      }
    );
  }

  updateMedicine() {
    this.pharmacistService.updatePharmacist(this.id, this.pharmacist).subscribe(
      data => {
        console.log(data); // Log the response from the backend for debugging purposes
        this.pharmacist=new Pharmacist();
        this.goToPharmacistList();
      },
      error => {
        this.error = error.message || 'An error occurred while updating the medicine.';
        console.error(this.error);
      }
    );
  }


 

  onSubmit() {
    this.pharmacistService.updatePharmacist(this.id,this.pharmacist).subscribe(data=>{
      this.goToPharmacistList

    },error=>console.log(error));
  }

  goToPharmacistList() {
    this.router.navigate(['/medicines']);
  }
}


import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PharmacistService } from 'src/app/service/pharmacist.service';
import { Pharmacist } from 'src/app/service/pharmacist';
@Component({
  selector: 'app-pharmacist-list',
  templateUrl: './pharmacist-list.component.html',
  styleUrls: ['./pharmacist-list.component.css']
})
export class PharmacistListComponent implements OnInit {
  pharmacists!: Pharmacist[];
 

  constructor(private pharmacistService:PharmacistService, private router:Router){}
  ngOnInit(): void {
    this.getAllPharmacist();
  }


  private getAllPharmacist() {
   this.pharmacistService.getPharmacistList().subscribe(data=>{
    this.pharmacists=data;
   })
  }


  updatePharmacist(id:number){
    this.router.navigate(['update-pharmacist',id]);

  }

  deletePharmasics(id:number){
    this.pharmacistService.deletePharmacist(id).subscribe(data=>{
      console.log(data);
      this.getAllPharmacist();
    })

  }
}

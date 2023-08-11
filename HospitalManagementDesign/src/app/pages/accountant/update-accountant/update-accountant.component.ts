import { Component,OnInit } from '@angular/core';
import { Router ,ActivatedRoute} from '@angular/router';
import { Accountant } from 'src/app/service/accountant';
import { AccountantService } from 'src/app/service/accountant.service';

@Component({
  selector: 'app-update-accountant',
  templateUrl: './update-accountant.component.html',
  styleUrls: ['./update-accountant.component.css']
})
export class UpdateAccountantComponent {
  id!: number;
  accountant: Accountant = new Accountant();
  error: string | null = null;

  constructor(
    private accountantService: AccountantService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.getAccountantById(); // Call the method to fetch accountant details
  }

  getAccountantById() {
    this.accountantService.getAccountantById(this.id).subscribe(data => {
      this.accountant = data;
    },
      error => {
        this.error = error.message || 'An error occurred while fetching the accountant details.';
        console.error(this.error);
      }
    );
  }

  updateAccountant() {
    this.accountantService.updateAccountant(this.id, this.accountant).subscribe(date => {
      console.log(date);
      this.accountant = new Accountant();
      this.goToAccountantList();
    },
      error => {
        this.error = error.message || 'An error occurred while updating the accountant.';
        console.error(this.error);
      }
    );
  }

  onSubmit() {
    this.accountantService.updateAccountant(this.id, this.accountant).subscribe(data => {
      this.goToAccountantList();
    }, error => console.log(error));
  }

  goToAccountantList() {
    this.router.navigate(['/accountants']);
  }
}

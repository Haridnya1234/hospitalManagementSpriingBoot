import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MatToolbarModule} from '@angular/material/toolbar';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import {MatRadioModule} from '@angular/material/radio';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatFormFieldModule} from '@angular/material/form-field';
import { MatNativeDateModule } from '@angular/material/core';
import { MatGridListModule } from '@angular/material/grid-list';
import { DocsignupComponent } from './pages/doctor/docsignup/docsignup.component';
import { PatientloginComponent } from './pages/patient/patientlogin/patientlogin.component';
import { DocloginComponent } from './pages/doctor/doclogin/doclogin.component';
import { PatientsignupComponent } from './pages/patient/patientsignup/patientsignup.component';
import { ShowpatientsComponent } from './pages/patient/showpatients/showpatients.component';
import {NgIf, NgFor} from '@angular/common';
import {MatTableModule} from '@angular/material/table';
import {MatCardModule} from '@angular/material/card';
import { UpdatepatientComponent } from './pages/patient/updatepatient/updatepatient.component';
import { SignupasComponent } from './pages/signupas/signupas.component';
import { LoginasComponent } from './pages/loginas/loginas.component';
import { DocdashComponent } from './pages/doctor/docdash/docdash.component';
import { AdmindashComponent } from './pages/admin/admindash/admindash.component';
import { AdminloginComponent } from './pages/admin/adminlogin/adminlogin.component';
import { DeletepatientComponent } from './pages/patient/deletepatient/deletepatient.component';
import { ViewsinglepatientComponent } from './pages/patient/viewsinglepatient/viewsinglepatient.component';
import { ShowdoclistComponent } from './pages/doctor/showdoclist/showdoclist.component';
import { UpdatedocComponent } from './pages/doctor/updatedoc/updatedoc.component';
import { ShowlabtestlistComponent } from './pages/labtest/showlabtestlist/showlabtestlist.component';
import { UpdatelabtestComponent } from './pages/labtest/updatelabtest/updatelabtest.component';
import { CreatelabtestComponent } from './pages/labtest/createlabtest/createlabtest.component';
import { DeletlabtestComponent } from './pages/labtest/deletlabtest/deletlabtest.component';
import { DeletedocComponent } from './pages/doctor/deletedoc/deletedoc.component';
import{MatMenuModule} from '@angular/material/menu';
import { CreateInvoiceComponent } from './pages/invoice/create-invoice/create-invoice.component';
import { InvoiceListComponent } from './pages/invoice/invoice-list/invoice-list.component';
import { UpdateInvoiceComponent } from './pages/invoice/update-invoice/update-invoice.component';
import { DeletappointmentComponent } from './pages/appointment/deletappointment/deletappointment.component';
import { BookappointmentComponent } from './pages/appointment/bookappointment/bookappointment.component';
import { ShowappointmentsComponent } from './pages/appointment/showappointments/showappointments.component';
import { UpdateappointmentComponent } from './pages/appointment/updateappointment/updateappointment.component';
import { AccloginComponent } from './pages/accountant/acclogin/acclogin.component';
import { AccountantComponent } from './pages/accountant/accountant/accountant.component';
import { AccountantListComponent } from './pages/accountant/accountant-list/accountant-list.component';
import { CreateAccountantComponent } from './pages/accountant/create-accountant/create-accountant.component';
import { UpdateAccountantComponent } from './pages/accountant/update-accountant/update-accountant.component';
import { BillListComponent } from './pages/bill/bill-list/bill-list.component';
import { CreateBillComponent } from './pages/bill/create-bill/create-bill.component';
import { UpdateBillComponent } from './pages/bill/update-bill/update-bill.component';
import { DeleteBillComponent } from './pages/bill/delete-bill/delete-bill.component';
import { CreateMedicineComponent } from './pages/medicine/create-medicine/create-medicine.component';
import { MedicineListComponent } from './pages/medicine/medicine-list/medicine-list.component';
import { UpdateMedicineComponent } from './pages/medicine/update-medicine/update-medicine.component';
import { DeleteMedicineComponent } from './pages/medicine/delete-medicine/delete-medicine.component';
import { PharmacistComponent } from './pages/pharmacist/pharmacist/pharmacist.component';
import { CreatePharmacistComponent } from './pages/pharmacist/create-pharmacist/create-pharmacist.component';
import { PharmacistListComponent } from './pages/pharmacist/pharmacist-list/pharmacist-list.component';
import { PharmloginComponent } from './pages/pharmacist/pharmlogin/pharmlogin.component';
import { UpdatePharmacistComponent } from './pages/pharmacist/update-pharmacist/update-pharmacist.component';
import { PayComponent } from './pages/payment/pay/pay.component';
import { AboutComponent } from './pages/aboutus/about/about.component';
import { DoctorfrontendComponent } from './pages/doctorfrontend/doctorfrontend.component';
import { NewsComponent } from './pages/news/news.component';
import { ContactComponent } from './pages/contact/contact.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    DocsignupComponent,
    PatientloginComponent,
    DocloginComponent,
    PatientsignupComponent,
    ShowpatientsComponent,
    UpdatepatientComponent,
    LoginasComponent,
    DocdashComponent,
    AdmindashComponent,
    AdminloginComponent,
    DeletepatientComponent,
    ViewsinglepatientComponent,
    ShowdoclistComponent,
    UpdatedocComponent,
    ShowlabtestlistComponent,
    UpdatelabtestComponent,
    CreatelabtestComponent,
    DeletlabtestComponent,
    DeletedocComponent,
    CreateInvoiceComponent,
    InvoiceListComponent,
    UpdateInvoiceComponent,
    DeletappointmentComponent,
    BookappointmentComponent,
    ShowappointmentsComponent,
    UpdateappointmentComponent,
    AccloginComponent,
    AccountantComponent,
    AccountantListComponent,
    CreateAccountantComponent,
    UpdateAccountantComponent,
    BillListComponent,
    CreateBillComponent,
    UpdateBillComponent,
    DeleteBillComponent,
    CreateMedicineComponent,
    MedicineListComponent,
    UpdateMedicineComponent,
    DeleteMedicineComponent,
    PharmacistComponent,
    CreatePharmacistComponent,
    PharmacistListComponent,
    PharmloginComponent,
    UpdatePharmacistComponent,
    PayComponent,
    AboutComponent,
    DoctorfrontendComponent,
    NewsComponent,
    ContactComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    FormsModule,
    HttpClientModule,
    MatRadioModule,
    MatInputModule,
    NgFor,
    MatSelectModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatGridListModule,
    NgIf,
    MatTableModule,
    MatCardModule,
    SignupasComponent,
    MatMenuModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
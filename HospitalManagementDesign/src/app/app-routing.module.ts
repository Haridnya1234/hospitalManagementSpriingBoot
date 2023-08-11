import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { DocloginComponent } from './pages/doctor/doclogin/doclogin.component';
import { DocsignupComponent } from './pages/doctor/docsignup/docsignup.component';
import { PatientauthService } from './service/patientauth.service';
import { PatientloginComponent } from './pages/patient/patientlogin/patientlogin.component';
import { PatientsignupComponent } from './pages/patient/patientsignup/patientsignup.component';
import { ShowpatientsComponent } from './pages/patient/showpatients/showpatients.component';
import { UpdatepatientComponent } from './pages/patient/updatepatient/updatepatient.component';
import { SignupasComponent } from './pages/signupas/signupas.component';
import { LoginasComponent } from './pages/loginas/loginas.component';
import { AdmindashComponent } from './pages/admin/admindash/admindash.component';
import { AdminloginComponent } from './pages/admin/adminlogin/adminlogin.component';
import { ViewsinglepatientComponent } from './pages/patient/viewsinglepatient/viewsinglepatient.component';
import { ShowdoclistComponent } from './pages/doctor/showdoclist/showdoclist.component';
import { UpdatedocComponent } from './pages/doctor/updatedoc/updatedoc.component';
import { CreatelabtestComponent } from './pages/labtest/createlabtest/createlabtest.component';
import { ShowlabtestlistComponent } from './pages/labtest/showlabtestlist/showlabtestlist.component';
import { UpdatelabtestComponent } from './pages/labtest/updatelabtest/updatelabtest.component';
import { BookappointmentComponent } from './pages/appointment/bookappointment/bookappointment.component';
import { CreateInvoiceComponent } from './pages/invoice/create-invoice/create-invoice.component';
import { UpdateInvoiceComponent } from './pages/invoice/update-invoice/update-invoice.component';
import { InvoiceListComponent } from './pages/invoice/invoice-list/invoice-list.component';
import { AccloginComponent } from './pages/accountant/acclogin/acclogin.component';
import { AccountantListComponent } from './pages/accountant/accountant-list/accountant-list.component';
import { CreateAccountantComponent } from './pages/accountant/create-accountant/create-accountant.component';
import { UpdateAccountantComponent } from './pages/accountant/update-accountant/update-accountant.component';
import { AccountantComponent } from './pages/accountant/accountant/accountant.component';
import { PharmloginComponent } from './pages/pharmacist/pharmlogin/pharmlogin.component';
import { CreatePharmacistComponent } from './pages/pharmacist/create-pharmacist/create-pharmacist.component';
import { UpdatePharmacistComponent } from './pages/pharmacist/update-pharmacist/update-pharmacist.component';
import { PharmacistListComponent } from './pages/pharmacist/pharmacist-list/pharmacist-list.component';
import { PayComponent } from './pages/payment/pay/pay.component';
import { AboutComponent } from './pages/aboutus/about/about.component';
import { DoctorfrontendComponent } from './pages/doctorfrontend/doctorfrontend.component';
import { NewsComponent } from './pages/news/news.component';
import { ContactComponent } from './pages/contact/contact.component';
import { DocdashComponent } from './pages/doctor/docdash/docdash.component';
import { ShowappointmentsComponent } from './pages/appointment/showappointments/showappointments.component';
import { UpdateappointmentComponent } from './pages/appointment/updateappointment/updateappointment.component';
const routes: Routes = [
  {
    path:'home',
    component:HomeComponent,
    pathMatch:'full',
  },
  {
    path:'pay',
    component:PayComponent,
    pathMatch:'full',
  },
  {
    path:'about',
    component:AboutComponent,
    pathMatch:'full',
  },
  {
    path:'contact',
    component:ContactComponent,
    pathMatch:'full',
  },
  {
    path:'doctorfrontend',
    component:DoctorfrontendComponent,
    pathMatch:'full',
  },
  {
    path:'news',
    component:NewsComponent,
    pathMatch:'full',
  },
  {
    path:'patientsignup',
    component:PatientsignupComponent,
    pathMatch:'full',
  },
  {
    path:'docsignup',
    component:DocsignupComponent,
    pathMatch:'full',
  },
  {
    path:'doclogin',
    component:DocloginComponent,
    pathMatch:'full',
  },
  {
    path:'docdash',
    component:DocdashComponent,
    pathMatch:'full'
  },
  {
    path:'patientlogin',
    component:PatientloginComponent,
    pathMatch:'full',
  },
  {
    path:'showpatient',
    component:ShowpatientsComponent,
    pathMatch:'full',
  },
  {
    path:'showdoclist',
    component:ShowdoclistComponent,
    pathMatch:'full',
  },
  {
    path:'updatepatient',
    component:UpdatepatientComponent,
    pathMatch:'full',
  },
  {
    path:'updatedoc',
    component:UpdatedocComponent,
    pathMatch:'full'
  },
  {
    path:'signupas',
    component:SignupasComponent,
    pathMatch:'full',
  },
  {
    path:'loginas',
    component:LoginasComponent,
    pathMatch:'full',
  },
  {
    path:'admindash',
    component:AdmindashComponent,
    pathMatch:'full',
  },
  {
    path:'adminlogin',
    component:AdminloginComponent,
    pathMatch:'full',
  },
  {
    path:'viewpatient',
    component:ViewsinglepatientComponent,
    pathMatch:'full',
  },
  {
    path:'showlabtestlist',
    component:ShowlabtestlistComponent,
    pathMatch:'full',
  },
  {
    path:'updatelabtest',
    component:UpdatelabtestComponent,
    pathMatch:'full',
  },
  {
    path:'createlabtest',
    component:CreatelabtestComponent,
    pathMatch:'full',
  },
  {
    path:'bookappointment',
    component:BookappointmentComponent,
    pathMatch:'full',
  },
  {
    path:'showappointment',
    component:ShowappointmentsComponent,
    pathMatch:'full',
  },
  {
    path:'updateappointment',
    component:UpdateappointmentComponent,
    pathMatch:'full',
  },
  {
    path:'create-invoice',
    component:CreateInvoiceComponent,
    pathMatch:'full'
  },
  {
    path:'update-invoice/:id',
    component:UpdateInvoiceComponent,
    pathMatch:'full'
  },
  {
    path:'invoice-list',
    component:InvoiceListComponent,
    pathMatch:'full'
  },
  {
    path: 'accountant-list',
    component: AccountantListComponent,
    pathMatch: 'full'
  },
  {
    path: 'create-accountant',
    component: CreateAccountantComponent,
    pathMatch: 'full'
  },
  {
    path: 'update-accountant/:id',
    component: UpdateAccountantComponent,
    pathMatch: 'full'
  },
  {
    path:'acclogin',
    component:AccloginComponent,
    pathMatch:'full'

  },
  {
    path:'accountant',
    component:AccountantComponent,
    pathMatch:'full'
  },
  {
    path:'pharmalogin',
    component:PharmloginComponent,
    pathMatch:'full'
  },
  {
    path:'create-pharmacist',
    component:CreatePharmacistComponent,
    pathMatch:'full'
  },
  {
    path:'update-pharmacist/:id',
    component:UpdatePharmacistComponent,
    pathMatch:'full'
  },
  {
    path:'pharmacist-list',
    component:PharmacistListComponent,
    pathMatch:'full'
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }







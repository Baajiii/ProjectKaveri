import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BillingComponent } from './billing/billing.component';
import { CustomerhistoryComponent } from './customerhistory/customerhistory.component';
import { DemoComponent } from './demo/demo.component';
import { Demo2Component } from './demo2/demo2.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { TodaypriceComponent } from './todayprice/todayprice.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'demo', component:DemoComponent },
  { path: 'billing', component:BillingComponent
  },
  { path: 'home', component:HomeComponent},
  { path: 'history', component:CustomerhistoryComponent},
  { path: 'demo2', component:Demo2Component},
  { path: 'price', component:TodaypriceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

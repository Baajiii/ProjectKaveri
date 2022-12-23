import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { AddQuantityComponent } from './add-quantity/add-quantity.component';
import { AddpriceComponent } from './addprice/addprice.component';
import { BillingComponent } from './billing/billing.component';
import { CustomerhistoryComponent } from './customerhistory/customerhistory.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SearchPriceComponent } from './search-price/search-price.component';
import { StorageComponent } from './storage/storage.component';
import { TodaypriceComponent } from './todayprice/todayprice.component';
import { AuthGuard } from './services/auth.guard';

const routes: Routes = [
  { path: '', component: LoginComponent},
  { path: 'billing', component:BillingComponent , canActivate: [AuthGuard]
  },
  { path: 'home', component:HomeComponent, canActivate: [AuthGuard]},
  { path: 'history', component:CustomerhistoryComponent, canActivate: [AuthGuard] },
  { path: 'price', component:TodaypriceComponent , canActivate: [AuthGuard]},
  {path: 'searchprice', component:SearchPriceComponent, canActivate: [AuthGuard]},
  {path: 'addprice', component:AddpriceComponent, canActivate: [AuthGuard]},
  {path: 'storage', component:StorageComponent, canActivate: [AuthGuard]},
  {path: 'addproduct', component:AddProductComponent, canActivate: [AuthGuard]},
  {path: 'addquantity', component:AddQuantityComponent, canActivate: [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  providers: [AuthGuard]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { Ng2OrderModule } from 'ng2-order-pipe';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { BillingComponent } from './billing/billing.component';
import { HomeComponent } from './home/home.component';
import { CustomerhistoryComponent } from './customerhistory/customerhistory.component';
import { TodaypriceComponent } from './todayprice/todayprice.component';
import { SearchPriceComponent } from './search-price/search-price.component';
import { AddpriceComponent } from './addprice/addprice.component';
import { StorageComponent } from './storage/storage.component';
import { AddProductComponent } from './add-product/add-product.component';
import { AddQuantityComponent } from './add-quantity/add-quantity.component';
import { AuthGuard } from './services/auth.guard';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    BillingComponent,
    HomeComponent,
    CustomerhistoryComponent,
    TodaypriceComponent,
    SearchPriceComponent,
    AddpriceComponent,
    StorageComponent,
    AddProductComponent,
    AddQuantityComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    Ng2SearchPipeModule,
    Ng2OrderModule,
    FormsModule
  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { DemoComponent } from './demo/demo.component';
import { BillingComponent } from './billing/billing.component';
import { HomeComponent } from './home/home.component';
import { CustomerhistoryComponent } from './customerhistory/customerhistory.component';
import { Demo2Component } from './demo2/demo2.component';
import { TodaypriceComponent } from './todayprice/todayprice.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DemoComponent,
    BillingComponent,
    HomeComponent,
    CustomerhistoryComponent,
    Demo2Component,
    TodaypriceComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

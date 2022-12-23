import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { Billing } from '../model/billing';
import { ApiService } from '../api.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-billing',
  templateUrl: './billing.component.html',
  styleUrls: ['./billing.component.scss']
})
export class BillingComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private api:ApiService) { }

    productType = [
      {name: "Steel", value: "steel"},
      {
        name: "Cement", value: "cement"}
    ]
    billingForm: FormGroup;
    loading = false;
    submitted = false;
    selectedOption:String; 
  ngOnInit(): void {

    this.billingForm = this.formBuilder.group({
      customername: [''],     
      Phonenumber:[''],
      productType:[''],
      BrandName:[''],
      Quantity:[''],
      fromAddress:[''],
      dispatch:[''],
      invoiceno:[''],
      hsncode:[''],
      EWayBill:[''],
      vehicleno:[''],
    })
  }


  get fval(){
    return this.billingForm.controls;
  }

  onFormSubmit(){
    this.submitted=true;
    
    if (this.billingForm.invalid) {
      return;
    }
    this.loading=true;
    if(this.billingForm.value.Quantity>0){
    const result:Billing= Object.assign({}, this.billingForm.value);
    this.api.billingform(result.customername, result.Phonenumber, result.productType, result.BrandName, result.Quantity, result.vehicleno,result.fromAddress,result.invoiceno, result.hsncode,result.dispatch, result.EWayBill).subscribe(
      (data: any) => {
        this.loading= false;
        
        if(data.status==true){
          Swal.fire(
            {
              icon: 'success',
              title: 'Billing Confirmed',
              text: data.message,
            }
          )
        }else{
          Swal.fire(
            {
              icon: 'error',
              title: 'Oops....!',
              text: data.message,
            }
          )
        }
        this.billingForm.reset();
      }
    );
  }else{
    Swal.fire(
      {
        icon: 'error',
        title: 'Oops....!',
        text: 'Enter the Quantity properly',
      }
    )
  }
}
  filterSelected(selectedOption){
    this.selectedOption= selectedOption;
    console.log('selected value= '+selectedOption);
  }

  logout(){
    sessionStorage.clear();
  }
}

import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,  Validators } from '@angular/forms';
import { ApiService } from '../api.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private api:ApiService) { }

   
    addproductForm :FormGroup;
    loading= false;
    submitted= false;
    data !: any;

  ngOnInit(): void {

    this.addproductForm = this.formBuilder.group({
      brandname: [null, Validators.required],
      quantity:['',Validators.required],
      productname: ['',Validators.required],
      
    })
  }



  get fval(){
    return this.addproductForm.controls;
  }


  onFormSubmit(){

  
    this.submitted=true;
    this.loading=true;
        if(this.addproductForm.value.quantity>0){

     
      this.api.addproduct(this.addproductForm.value.brandname, this.addproductForm.value.quantity, this.addproductForm.value.productname).subscribe(
        (data: any) =>{
          this.loading= false;
          if(data.status==true){
            Swal.fire(
              {
                icon: 'success',
                title: 'New Product Added to the Stroage',
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
          this.addproductForm.reset();
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

  logout(){
    sessionStorage.clear();
  }
}
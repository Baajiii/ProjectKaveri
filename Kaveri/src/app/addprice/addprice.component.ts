import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,  Validators } from '@angular/forms';
import { ApiService } from '../api.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-addprice',
  templateUrl: './addprice.component.html',
  styleUrls: ['./addprice.component.css']
})
export class AddpriceComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private api:ApiService) { }

   
    addpriceForm :FormGroup;
    loading= false;
    submitted= false;
    data !: any;

  ngOnInit(): void {

    this.addpriceForm = this.formBuilder.group({
      brandname: [null, Validators.required],
      price:['',Validators.required],
      productname: ['',Validators.required],
      
    })
  }



  get fval(){
    return this.addpriceForm.controls;
  }


  onFormSubmit(){

  
    this.submitted=true;
    this.loading=true;
        if(this.addpriceForm.value.price>0){

     
      this.api.addprice(this.addpriceForm.value.brandname, this.addpriceForm.value.price, this.addpriceForm.value.productname).subscribe(
        (data: any) =>{
          this.loading= false;
          if(data.status==true){
            Swal.fire(
              {
                icon: 'success',
                title: 'Price Add',
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
          this.addpriceForm.reset();
        }
      );

        
    }else{
      console.log(this.addpriceForm.value.price);
      Swal.fire(
        {
          icon: 'error',
          title: 'Oops....!',
          text: 'Enter the Price properly',
        }
      )
    }
  }

  logout(){
    sessionStorage.clear();
  }
}

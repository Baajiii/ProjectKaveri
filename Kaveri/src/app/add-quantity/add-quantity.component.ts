import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,  Validators } from '@angular/forms';
import { ApiService } from '../api.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-add-quantity',
  templateUrl: './add-quantity.component.html',
  styleUrls: ['./add-quantity.component.css']
})
export class AddQuantityComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private api:ApiService) { }

   
    addquantityForm :FormGroup;
    loading= false;
    submitted= false;
    data !: any;

  ngOnInit(): void {

    this.addquantityForm = this.formBuilder.group({
      brandname: [null, Validators.required],
      quantity:['',Validators.required],
      
      
    })
  }



  get fval(){
    return this.addquantityForm.controls;
  }


  onFormSubmit(){

  
    this.submitted=true;
    this.loading=true;
        if(this.addquantityForm.value.quantity>0){

     
      this.api.addquantity(this.addquantityForm.value.brandname, this.addquantityForm.value.quantity).subscribe(
        (data: any) =>{
          this.loading= false;
          if(data.status==true){
            Swal.fire(
              {
                icon: 'success',
                title: 'Storage Added',
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
          this.addquantityForm.reset();
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

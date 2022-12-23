import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }


  getCustomerHistory(){
    return this.http.get<any>("http://localhost:8080/allhistory").pipe(map((res:any)=>{return res;}))
  }

  getTodayprice(){
    return this.http.get<any>("http://localhost:8080/todayprice").pipe(map((res:any)=>{return res;}))
  }

  getAllproducts(){
    return this.http.get<any>("http://localhost:8080/allproducts").pipe(map((res:any) => { return res;}))
  }

  billingform(customername: String, phoneNumber: String, ProductName: String, BrandName: String, Quantity: String, vehicleno: String, Address: String, invoiceno: String, hsncode: String, dispatch: String, EwayBill: String){
    var body = {
      customername : customername,
      phonenumber : phoneNumber,
      productname : ProductName,
      brandname : BrandName,
      quantity : Quantity,
      vehicleno : vehicleno,
      address : Address,
      invoiceno :invoiceno,
      hsncode : hsncode,
      dispatch : dispatch,
      ewaybill : EwayBill,

    }
    return this. http.post("http://localhost:8080/billing", body);
  }


  SearchPrice(brandname:any){
    return this.http.get("http://localhost:8080/chechprice/"+brandname)
    .pipe(map((res:any)=>{return res}))
  }

  addprice(brandname: String, price: Number ,productname: String){
    var body = {
      brandname : brandname,
      price : price,
      productname : productname,
  }
  return this.http.post("http://localhost:8080/addprice", body)
}

addproduct(brandname: String, quantity: Number, productname: String){
  var body={
    brandname : brandname,
    quantity : quantity,
    productname : productname,
  }
  return this.http.post("http://localhost:8080/addproduct", body)
  }

  addquantity(brandanme: String, quantity: Number){
    var body ={
      brandname: brandanme,
      quantity: quantity,
    }
    return this.http.post("http://localhost:8080/addquantity", body)
  }
}


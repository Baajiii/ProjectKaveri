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
}

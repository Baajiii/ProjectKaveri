import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-storage',
  templateUrl: './storage.component.html',
  styleUrls: ['./storage.component.css']
})
export class StorageComponent implements OnInit {

  ProductData !: any;
  constructor(private api : ApiService ) { }

  ngOnInit(): void {
    this.getAllproducts();
  }



  getAllproducts(){
    this.api.getAllproducts().subscribe(res=>{
      this.ProductData = res;
    })
  }

  
  logout(){
    sessionStorage.clear();
  }
}

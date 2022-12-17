import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-todayprice',
  templateUrl: './todayprice.component.html',
  styleUrls: ['./todayprice.component.css']
})
export class TodaypriceComponent implements OnInit {
  priceData !: any;

  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.gettodayprice();
  }
  
gettodayprice(){
  this.api.getTodayprice().subscribe(res=>{
    this.priceData = res;
  })
}
}
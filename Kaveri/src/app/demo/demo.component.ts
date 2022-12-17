import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent implements OnInit {

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

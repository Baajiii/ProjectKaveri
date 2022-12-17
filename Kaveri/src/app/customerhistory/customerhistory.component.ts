import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-customerhistory',
  templateUrl: './customerhistory.component.html',
  styleUrls: ['./customerhistory.component.css']
})
export class CustomerhistoryComponent implements OnInit {
 
  HistoryData !: any;

  constructor(private api : ApiService ) { }

  ngOnInit(): void {
    this.getHistory();
  }

  getHistory(){
    this.api.getCustomerHistory().subscribe(res=>{
      
      this.HistoryData = res;
    })
  }

}

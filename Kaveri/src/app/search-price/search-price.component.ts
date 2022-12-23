import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms'
import { ApiService } from '../api.service';

@Component({
  selector: 'app-search-price',
  templateUrl: './search-price.component.html',
  styleUrls: ['./search-price.component.css']
})
export class SearchPriceComponent implements OnInit {

  priceData !: any;

  constructor(private formBuilder: FormBuilder,private api:ApiService) { }

  searchForm: FormGroup;

  ngOnInit(): void {

    this.searchForm = this.formBuilder.group({
      searchform: [''],
    })

   
  }
  
  search(){
    this.api.SearchPrice(this.searchForm.value.searchform).subscribe(
      res => {
        this.priceData = res;

      })
    

    }
    logout(){
      sessionStorage.clear();
    }
}

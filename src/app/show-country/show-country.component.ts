import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Country } from '../model/country';
import { CountryService } from '../service/countryservice';

@Component({
  selector: 'app-show-country',
  templateUrl: './show-country.component.html',
  styleUrls: ['./show-country.component.css']
})
export class ShowCountryComponent implements OnInit {
  country: Country = new Country()

  constructor(private countryService:CountryService, private route:ActivatedRoute) { 

  }

  ngOnInit(): void {
    this.route.params.forEach((params : Params) => {
      if(params ['id'] !== undefined){
        const id = params ['id'];
        this.countryService.getCountry(id).subscribe(data => {this.country = data});
      }
    });
  }

}

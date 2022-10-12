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

  constructor(private route: ActivatedRoute, private countryService: CountryService) { 
    console.log('entered constructor' + this.country.name)
  }
  
  ngOnInit(): void {
    console.log('entered oninit' + this.country.name)
    this.route.params.forEach((params: Params) => {
      if (params['id'] !== undefined) {
        const id = params['id'];
        console.log('Id ' + id)
        //this.navigated = true;
        this.countryService.getCountry(id).subscribe(data => {this.country = data }); 
       
      } else {
        // this.navigated = false;
        // this.hero = new Hero();
      }
    });

  }
}
  

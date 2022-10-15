import { Component, OnInit } from '@angular/core';
import { Country } from '../model/country';
import { CountryService } from '../service/countryservice';

@Component({
  selector: 'app-show-countries',
  templateUrl: './show-countries.component.html',
  styleUrls: ['./show-countries.component.css']
})
export class ShowCountriesComponent implements OnInit {
  countries: Country[]=[]

  constructor(private countryService: CountryService) { }

  ngOnInit(): void {
    this.countryService.getCountries().subscribe((data:Country[]) => {this.countries=data});
  }

}

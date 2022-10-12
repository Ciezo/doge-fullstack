import{HttpClient, HttpHeaders}from'@angular/common/http';
import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';
import { Country } from '../model/country';

@Injectable ({providedIn:'root'})
export class CountryService {
    countriesUrl: string

    constructor(private http: HttpClient){
        this.countriesUrl='http://localhost:18080/api'
    }

    public getCountries(): Observable<Country[]>{
        return this.http.get<Country[]> (this.countriesUrl +'/countries/');
    }

    public getCountry(id: number): Observable<Country>{
        return this.http.get<Country> (this.countriesUrl +'/show-country/'+ id.toString());
    }
}

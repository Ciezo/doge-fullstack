import { Observable } from "rxjs";
import { Country } from "../model/country";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Dog } from "../model/dog";

@Injectable({providedIn: 'root'})

export class Dogservice {
    dogsUrl: string

    constructor (private http: HttpClient){

        this.dogsUrl = 'http://localhost:18080/api';

    }

    public getDog(id: number): Observable<Dog> {

        return this.http.get<Dog>(this.dogsUrl + '/show-dog/' + id.toString());

    }

    public getDogs(): Observable<Dog[]>{

        return this.http.get<Dog[]>(this.dogsUrl + '/dogs/');
    
    }
    public addDog(values: any): Observable<Dog> {
       return this.http.post<Dog>(this.dogsUrl + '/add-dog-with-admin',values);

    }

}

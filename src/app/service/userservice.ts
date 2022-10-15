import { Observable } from "rxjs";
import { Country } from "../model/country";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Dog } from "../model/dog";
import { User } from "../model/user";

@Injectable({providedIn: 'root'})

export class Userservice {
    usersUrl: string

    constructor (private http: HttpClient){

        this.usersUrl = 'http://localhost:18080/api';

    }

    public getUser(id: number): Observable<User> {

        return this.http.get<User>(this.usersUrl + '/show-user/' + id.toString());

    }

    public getUsers(): Observable<User[]>{

        return this.http.get<User[]>(this.usersUrl + '/users/');
    
    }
   // public updateCountry(id: number): Observable<Dog> {

      //  return this.http.get<Country>(this.countriesUrl + '/api/update-country/' + id.toString());

  //  }

}

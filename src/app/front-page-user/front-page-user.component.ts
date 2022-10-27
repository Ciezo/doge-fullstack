import { Component, OnInit } from '@angular/core';
import { Dog } from '../model/dog';
import { Dogservice } from '../service/dogservice';

@Component({
  selector: 'app-front-page-user',
  templateUrl: './front-page-user.component.html',
  styleUrls: ['./front-page-user.component.css']
})
export class FrontPageUserComponent implements OnInit {

  dogs: Dog[] = []
  constructor(private dogService:Dogservice) { 
    
  }

  getDogDetails() {
    this.dogService.getDogs().subscribe(
      (resp: any) => {
        console.log(resp);
       // this.studentDetails = resp;
      },
      (err: any) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
    this.dogService.getDogs().subscribe((data: Dog[]) => {this.dogs = data});
  }

}

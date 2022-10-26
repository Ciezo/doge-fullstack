import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Dogservice } from '../service/dogservice';

@Component({
  selector: 'app-create-dog',
  templateUrl: './create-dog.component.html',
  styleUrls: ['./create-dog.component.css']
})
export class CreateDogComponent implements OnInit {
  title ='adminDashboard';
  constructor(private dogService:Dogservice) { }


  createDog(createForm: NgForm){
    this.dogService.addDog(createForm.value).subscribe(
      (resp) => {
        console.log(resp);
      
     
      },
      (err) => {
        console.log(err);
      }
    );;
  }
  ngOnInit(): void {
  }

}

import { Component, OnInit } from '@angular/core';
import { Dog } from '../model/dog';
import { Dogservice } from '../service/dogservice';

@Component({
  selector: 'app-show-dogs',
  templateUrl: './show-dogs.component.html',
  styleUrls: ['./show-dogs.component.css']
})
export class ShowDogsComponent implements OnInit {
  dogs: Dog[] = []
  constructor(private dogService: Dogservice) { }

  ngOnInit(): void {
    this.dogService.getDogs().subscribe((data: Dog[]) => {this.dogs = data});
    
  }

}



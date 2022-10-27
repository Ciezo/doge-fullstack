import { Component, OnInit } from '@angular/core';
import { Dog } from '../model/dog';
import { Dogservice } from '../service/dogservice';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-front-page-admin',
  templateUrl: './front-page-admin.component.html',
  styleUrls: ['./front-page-admin.component.css'],// add NgbModalConfig and NgbModal to the component providers
	providers: [NgbModalConfig, NgbModal],
})
export class FrontPageAdminComponent implements OnInit {

  dogs = null as any;

  dogToUpdate = {
 
    name:"",
    breed:"",
    age:"",
    weight:"",
    height:"",
    status:"",
  }
  constructor(private dogService:Dogservice,config: NgbModalConfig, private modalService: NgbModal) {
    this.getDogDetails();
    config.backdrop = 'static';
		config.keyboard = false;
    
  }
	open(content: any) {
		this.modalService.open(content);
	}
  
  getDogDetails() {
    this.dogService.getDogs().subscribe(
      (resp: any) => {
        console.log(resp);
       // this.tDetails = resp;
      },
      (err: any) => {
        console.log(err);
      }
    );
  }
  removeDog(dog:  any) {
    this.dogService.deleteDog(dog.id).subscribe(
      (resp) => {
        console.log(resp);
      
      },
      (err) => {
        console.log(err);
      }
    );
  }
  edit(dogs: any){
    this.dogToUpdate = dogs;
 }
 editDog(){
  this.dogService.updateDog(this.dogToUpdate).subscribe(
    (resp:any) => {
      console.log(resp);
    },
    (err:any) => {
      console.log(err);
    }
  );
}

  ngOnInit(): void {
    this.dogService.getDogs().subscribe((data: Dog[]) => {this.dogs = data});
    
  }
}
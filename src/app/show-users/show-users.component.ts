import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { Userservice } from '../service/userservice';

@Component({
  selector: 'app-show-users',
  templateUrl: './show-users.component.html',
  styleUrls: ['./show-users.component.css']
})
export class ShowUsersComponent implements OnInit {
  users: User[] = []

  constructor(private usersService: Userservice) { }

  ngOnInit(): void {
    this.usersService.getUsers().subscribe((data: User[]) =>
     {this.users = data});
    
  }

}




import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ShowCountryComponent } from './show-country/show-country.component';
//import { ShowCountriesComponent } from './show-countries/show-countries.component';
import { ShowDogsComponent } from './show-dogs/show-dogs.component';
import { ShowUsersComponent } from './show-users/show-users.component';

const routes: Routes = [
  { path: '', redirectTo: '/dogs', pathMatch: 'full' },
  { path: '', redirectTo: '/users', pathMatch: 'full' },
  { path: 'dogs', component: ShowDogsComponent },
  { path: 'dog/:id', component: ShowCountryComponent },
  { path: 'users', component: ShowUsersComponent },
  { path: 'user/:id', component: ShowCountryComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ShowCountryComponent } from './show-country/show-country.component';
//import { ShowCountriesComponent } from './show-countries/show-countries.component';
import { ShowDogsComponent } from './show-dogs/show-dogs.component';
import { ShowUsersComponent } from './show-users/show-users.component';
import { ConfirmComponent } from './confirm/confirm.component';

// Designate the URL paths on AngularJS (Localhost Node server)
// These arrays are set to match the path
const routes: Routes = [
  { path: '', redirectTo: '/dogs', pathMatch: 'full' },
  { path: '', redirectTo: '/users', pathMatch: 'full' },
  { path: 'dogs', component: ShowDogsComponent },
  { path: 'dog/:id', component: ShowCountryComponent },
  { path: 'users', component: ShowUsersComponent },
  { path: 'user/:id', component: ShowCountryComponent },
  { path: 'confirm', component: ConfirmComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

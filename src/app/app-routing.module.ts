import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConfirmPageComponent } from './confirm-page/confirm-page.component';
import { FrontPageAdminComponent } from './front-page-admin/front-page-admin.component';
import { FrontPageUserComponent } from './front-page-user/front-page-user.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { LoginUserComponent } from './login-user/login-user.component';
import { CreateDogComponent } from './create-dog/create-dog.component';
import { ShowCountriesComponent } from './show-countries/show-countries.component';

import { ShowCountryComponent } from './show-country/show-country.component';
//import { ShowCountriesComponent } from './show-countries/show-countries.component';
import { ShowDogsComponent } from './show-dogs/show-dogs.component';
import { ShowUsersComponent } from './show-users/show-users.component';

// Designate the URL paths on AngularJS (Localhost Node server)
// These arrays are set to match the path
const routes: Routes = [
  { path: '', redirectTo: '/landing-page', pathMatch: 'full' },
  { path: '', redirectTo: '/admin', pathMatch: 'full' },
  { path: '', redirectTo: '/dogs', pathMatch: 'full' },
  { path: '', redirectTo: '/users', pathMatch: 'full' },
  { path: '', redirectTo: '/countries', pathMatch: 'full' },
  { path: 'dogs', component: ShowDogsComponent },
  { path: 'dog/:id', component: ShowCountryComponent },
  { path: 'users', component: ShowUsersComponent },
  { path: 'user/:id', component: ShowCountryComponent },
  { path: 'confirm', component: ConfirmPageComponent },
  { path: 'front-user', component: FrontPageUserComponent},
  { path: 'front-admin', component: FrontPageAdminComponent},
  { path: 'login-user', component: LoginUserComponent},
  { path: 'login-admin', component: LoginAdminComponent},
  { path: 'landing-page', component: LandingPageComponent},
  { path: 'countries', component: ShowCountriesComponent},
  { path: 'country/:id', component: ShowCountryComponent},
  { path: 'admin', component: CreateDogComponent},
  { path: 'admin/:id', component: CreateDogComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

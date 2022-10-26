import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ConfirmPageComponent } from './confirm-page/confirm-page.component';
import { FrontPageAdminComponent } from './front-page-admin/front-page-admin.component';
import { FrontPageUserComponent } from './front-page-user/front-page-user.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { LoginUserComponent } from './login-user/login-user.component';

import { ShowCountryComponent } from './show-country/show-country.component';
//import { ShowCountriesComponent } from './show-countries/show-countries.component';
import { ShowDogsComponent } from './show-dogs/show-dogs.component';
import { ShowUsersComponent } from './show-users/show-users.component';

const routes: Routes = [
  { path: '', redirectTo: '/landing-page', pathMatch: 'full' },
  { path: '', redirectTo: '/users', pathMatch: 'full' },
  { path: 'dogs', component: ShowDogsComponent },
  { path: 'dog/:id', component: ShowCountryComponent },
  { path: 'users', component: ShowUsersComponent },
  { path: 'user/:id', component: ShowCountryComponent },
  { path: 'confirm', component: ConfirmPageComponent },
  { path: 'front-user', component: FrontPageUserComponent},
  { path: 'front-admin', component: FrontPageAdminComponent},
  { path: 'login-user', component: LoginUserComponent},
  { path: 'login-admin', component: LoginAdminComponent},
  { path: 'landing-page', component: LandingPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

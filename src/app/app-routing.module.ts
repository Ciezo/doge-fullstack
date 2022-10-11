import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ShowCountriesComponent } from './show-countries/show-countries.component';
import { ShowCountryComponent } from './show-country/show-country.component';

const routes: Routes = [
  {path:'',redirectTo: '/countries', pathMatch: 'full'},
  {path: 'countries', component: ShowCountriesComponent },
  {path: 'country/:id', component: ShowCountryComponent }, 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

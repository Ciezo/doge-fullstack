import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShowCountryComponent } from './show-country/show-country.component';
import { ShowDogsComponent } from './show-dogs/show-dogs.component';
import { ShowUsersComponent } from './show-users/show-users.component';
import { ConfirmComponent } from './confirm/confirm.component';

import { ShowCountriesComponent } from './show-countries/show-countries.component';
import { CreateDogComponent } from './create-dog/create-dog.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowCountryComponent,
    ShowCountriesComponent,
    ShowDogsComponent,
    ShowUsersComponent,

    CreateDogComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

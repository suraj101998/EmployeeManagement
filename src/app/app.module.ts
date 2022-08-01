import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { EmpListComponent } from './compnents/emp-list/emp-list.component';
import { FormsModule } from '@angular/forms';

import { Router ,RouterModule,Routes } from '@angular/router';

import { DepartmentListComponent } from './components/department-list/department-list.component';
import { WelcomeComponent } from './components/welcome/welcome.component';

const route : Routes =[

  {path : '' , component : WelcomeComponent},
  {path : 'employees' , component : EmpListComponent},
  {path : 'departments' , component : DepartmentListComponent}
  

]

@NgModule({
  declarations: [
    AppComponent,
    EmpListComponent,
    DepartmentListComponent,
    WelcomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot(route),
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

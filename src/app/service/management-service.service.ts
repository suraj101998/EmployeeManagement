import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import{Employee} from '../common/employee';

@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {

  empurl= "http://localhost:8080/api/emp"
  constructor(private httpClient : HttpClient) { }
  getAllEmployees() : Observable<Employee[]>{

    console.log(this.httpClient.get< getEmployeeResponse >(this.empurl).pipe(map(response => response._embedded.employees)))
    return this.httpClient.get< getEmployeeResponse >(this.empurl).pipe(map(response => response._embedded.employees))
  }
}
interface getEmployeeResponse{
  _embedded : {
    employees : Employee[]
  }
  
}

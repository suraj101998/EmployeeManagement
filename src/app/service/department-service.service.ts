import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, map } from 'rxjs';
import{Department} from '../common/department';

@Injectable({
  providedIn: 'root'
})
export class ManagementServiceService {

  depurl= "http://localhost:8080/api/dept"
  constructor(private httpclient : HttpClient) { }
  getAllDepartment() : Observable<Department[]>{
    return this.httpclient.get<getDepartmentResponse>(this.depurl).pipe(map(Response => Response._embedded.departments))
  }
}
interface getDepartmentResponse{
  _embedded:{
    departments : Department[]
  }
  
}
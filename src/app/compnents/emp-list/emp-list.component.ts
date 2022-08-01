import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/common/employee';
import { ManagementServiceService } from 'src/app/service/management-service.service';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  employees : Employee[]
  formModel :  Employee =new  Employee(0,"","","",0,0,0,0);
  constructor(private service : ManagementServiceService ) { }

  ngOnInit(): void {
    this.listofEmployees()
  }
  listofEmployees(){
    this.service.getAllEmployees().subscribe(data=>{
      console.log(data)
      this.employees=data
    }
    )
  }

  onSubmit()
  {
    this.employees.push(this.formModel);
  }

}

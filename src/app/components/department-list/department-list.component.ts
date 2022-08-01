import { Component, OnInit } from '@angular/core';
import { Department } from 'src/app/common/department';
import { ManagementServiceService } from 'src/app/service/department-service.service';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit {
  departments : Department[]
  formModel : Department=new Department(0,"","");
  constructor(private service :ManagementServiceService) { }

  ngOnInit(): void {
    this.listofDepartments()
  }
  listofDepartments(){
    this.service.getAllDepartment().subscribe(data=>{
      console.log(data)
      this.departments = data
    }
    )
  }

  onSubmit()
  {
    this.departments.push(this.formModel);
  }


}

package com.example.empmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.empmanagement.entity.Employee;


@RepositoryRestResource(path="emp")
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

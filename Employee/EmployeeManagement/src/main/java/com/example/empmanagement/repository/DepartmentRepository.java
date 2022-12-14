package com.example.empmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.empmanagement.entity.Department;
@RepositoryRestResource(path="dept")
@CrossOrigin(origins = "http://localhost:4200")
public interface DepartmentRepository  extends JpaRepository<Department, Integer>{

}

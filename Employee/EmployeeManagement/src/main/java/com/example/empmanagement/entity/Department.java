package com.example.empmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
	@Id			//primarykey
	@Column(name="deptno")
	private int deptno;
	
	@Column(name="departmentname")
	private String departmentname;
	
	@Column(name="location")
	private String location;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptno, String departmentname, String location) {
		super();
		this.deptno = deptno;
		this.departmentname = departmentname;
		this.location = location;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getdepartmentname() {
		return departmentname;
	}

	public void setdepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", departmentname=" + departmentname + ", location=" + location + "]";
	}
	

}

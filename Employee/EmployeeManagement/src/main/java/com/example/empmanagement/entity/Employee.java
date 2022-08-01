package com.example.empmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id			//primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) 	//autoincrement
	@Column(name="empno") 
	private Integer empno;
	
	@Column(name="ename") 
	private String ename;
	
	@Column(name="job") 
	private String job;
	
	@Column(name="hiredate")
	private String hiredate;
	
	@Column(name="managerid") 
	private Integer managerid;
	
	@Column(name="salary") 
	private Integer salary;
	
	@Column(name="commission") 
	private Integer commission;
	
	@Column(name="deptno") 
	private Integer deptno;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empno, String ename, String job, String hiredate, Integer managerid, Integer salary, Integer commission,
			Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.managerid = managerid;
		this.salary = salary;
		this.commission = commission;
		this.deptno = deptno;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public Integer getManagerid() {
		return managerid;
	}

	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate
				+ ", managerid=" + managerid + ", salary=" + salary + ", commission=" + commission + ", deptno="
				+ deptno + "]";
	}
	
	

}

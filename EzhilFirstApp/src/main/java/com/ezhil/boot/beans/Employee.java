package com.ezhil.boot.beans;

public class Employee {
	
	private String empId;
	private String empName;
	private String empFatherName;
	
	private boolean myFirstProjectWithSourceTree = true;
	
	public Employee(String empId, String empName, String empFatherName) {
	 
		this.empId = empId;
		this.empName = empName;
		this.empFatherName = empFatherName;
	}
	
	
 
	public Employee() {
		 
	}



	public String getEmpId() {
		return empId;
	}



	public void setEmpId(String empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpFatherName() {
		return empFatherName;
	}
	public void setEmpFatherName(String empFatherName) {
		this.empFatherName = empFatherName;
	}
	
	

}

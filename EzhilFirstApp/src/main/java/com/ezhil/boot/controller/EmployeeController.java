package com.ezhil.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ezhil.boot.beans.Employee;
import com.ezhil.boot.services.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@ApiOperation("List of Employees")
	@RequestMapping("empList")
	public List<Employee> getEmployeeList(){
		
		return empService.getEmployeeList();
	}
	
	@RequestMapping("emp/{id}")
	public Employee getEmpoyee(@PathVariable String id){
		return empService.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="empList")
	public void addEmployee(@RequestBody Employee emp){
		empService.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="empList/{id}")
	public void deleteEmployee(@PathVariable String id){
		empService.deleteEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="empList/{id}")
	public void replaceEmployee(@RequestBody Employee emp, @PathVariable String id){
		empService.replaceEmployee(emp,id);
	}
	
	
}

package com.ezhil.boot.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ezhil.boot.beans.Employee;

@Service
public class EmployeeService {

	private List<Employee> listofEmp=new ArrayList<> (Arrays.asList(
			new Employee("10","Ezhlarasan","Selvaraj"),
			new Employee("20","Thaleswari","Ezhilarasan"),
			new Employee("30","ThavaYazhisai","Ezhilarasan")
			));
	
public List<Employee> getEmployeeList(){
	return 	listofEmp;
}
	

public Employee getEmployee(String id){
	return listofEmp.stream().filter(t -> t.getEmpId().equals(id)).findFirst().get();
}


public void addEmployee(Employee emp) {
 	listofEmp.add(emp);
  }


public void deleteEmployee(String id) {
 		for(int i=0;i<=listofEmp.size();i++){
			if(listofEmp.get(i).getEmpId().equalsIgnoreCase(id)){
				listofEmp.remove(i);
				return;
			}
	}
}


public void replaceEmployee(Employee emp, String id) {
	
	for(int i=0;i<=listofEmp.size();i++){
		if(listofEmp.get(i).getEmpId().equalsIgnoreCase(id)){
			listofEmp.set(i, emp);
			return;
		}
	}
}
	

}


package com.wipro.service;
import java.util.ArrayList;
import java.util.List;
import com.wipro.bean.EmployeeBean;

public class EmployeeService {
	
	private List<EmployeeBean> listEmp = new ArrayList<>();
	
	// done
	// inserting employee
	public boolean insertEmployee(EmployeeBean e) {
		return listEmp.add(e);
	}
	
	// done
	// insert employee by position
	public String insertEmployeeBeanByPosition(EmployeeBean e, int position) {
		listEmp.add(position, e);
		return "Inserted employee";
	}
	
	// done
	// fetching all employees
	public void fetchAllEmployees() {
		if(listEmp.size() != 0) {
					System.out.println("EmpID | Name  |  Salary   | Designation");
			for (EmployeeBean emp : listEmp) {
					System.out.println(emp.getEmpID() +  "    " + emp.getName() + "    " + emp.getSalary() + "    " + emp.getDesignation());
			}
		}
	}
	
	// done
	// deleting employee by id
	public boolean deleteEmployeeByEmpID(int id){
		if(listEmp.removeIf(e->e.getEmpID()== id)) {
			return true;
		}
		return false;
	}
	
	// done
	// updating employee by EmpID
	public void updateEmployeeByEmpID(EmployeeBean emp, int id){
		int i=0;
		for(EmployeeBean tempEmp : listEmp) {
			if(id == tempEmp.getEmpID()) {
				listEmp.get(i).setName(emp.getName());
				listEmp.get(i).setEmpID(emp.getEmpID());
				listEmp.get(i).setSalary(emp.getSalary());
				listEmp.get(i).setDesignation(emp.getDesignation());
				return;
			}i++;
		}
	}
	
	// done
	// find employee by EmpID
	public EmployeeBean findEmployeeByEmpID (int EmpID){
		for(EmployeeBean em : listEmp) {
			if(em.getEmpID() == EmpID) {
				return em;
			}
		}
		return null;
	}
}


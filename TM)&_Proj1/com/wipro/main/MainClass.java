package com.wipro.main;

import com.wipro.service.*;
import com.wipro.bean.*;

public class MainClass {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		
		es.insertEmployee(new EmployeeBean(1001, "Raj", 29000, "SE"));
		es.insertEmployee(new EmployeeBean(2002, "Sourabh", 32000, "DSE"));
		es.insertEmployee(new EmployeeBean(3003, "Arpit", 31100, "QA"));
		es.insertEmployee(new EmployeeBean(4004, "Ravi", 30000, "TE"));
		
		es.insertEmployeeBeanByPosition(new EmployeeBean(4789, "Sobit", 36000, "TL"), 4);
		
		es.fetchAllEmployees();
		
		System.out.println(es.deleteEmployeeByEmpID(2002));
		
		es.updateEmployeeByEmpID(new EmployeeBean(7002, "Ronit", 24000, "ASE"), 4004);
		
		System.out.println(es.findEmployeeByEmpID(7002));
		
	}

}

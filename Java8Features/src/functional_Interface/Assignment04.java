package functional_Interface;
/*Create an Emp class with three private variables id, name and salary.
Create getters & setters and a parameterized constructor.

Create an ArrayList and store 5 to 10 Emp objects in it. 
Write a program using Predicate, to filter and display the name of the Emps whose salary is less than 10000.
 */

import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {
	private int id;
	private String name;
	private double salary;
	Emp(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
}

public class Assignment04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(101,"Sachin",20000));
		list.add(new Emp(102,"Kohli",5000));
		list.add(new Emp(103,"Dhoni",58000));
		list.add(new Emp(104,"Raina",97000));
		list.add(new Emp(105,"Rahul",40000));
		list.add(new Emp(104,"Rohit",9800));
		list.add(new Emp(105,"Mohit",9000));
		
		Predicate<Double> p = i -> i < 10000;
		ArrayList<String> res = new ArrayList<>();
		list.forEach(
		i -> {
			if(p.test(i.getSalary()))res.add(i.getName());
			}
		);
		System.out.println(res);
	}

}

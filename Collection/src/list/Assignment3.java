package list;
import java.util.Iterator;
import java.util.Vector;

class EmployeeList {
	private int id;
	private String name;
	private String address;
	private Double salary;	
	public EmployeeList(int id, String name, String address, Double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<EmployeeList> list = new Vector<>();
		
		list.add(new EmployeeList(01, "George", "Gurugram", 10000.0));
		list.add(new EmployeeList(02, "Mike", "Mumbai", 20000.0));
		list.add(new EmployeeList(03, "John", "Bangalore", 25000.0));
		list.add(new EmployeeList(04, "Watson", "Hyderabad", 30000.0));
		
		Iterator<EmployeeList> itr = list.iterator();
		while (itr.hasNext()) 
			System.out.println(itr.next());

	}
}

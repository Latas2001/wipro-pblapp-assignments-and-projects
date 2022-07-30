package set;
import java.util.TreeSet;

class Employee implements Comparable<Object>
{

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary)
    {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary
                + "]";
    }

    /*
     * This method has logic to arrange the employee objects in ascending order
     * based on the Age.
     */
    @Override
    public int compareTo(Object object)
    {

        Employee employee = (Employee) object;

        System.out.print("CompareTo method has been called to arrange the employee objects in ascending order based on the Age, ");

        System.out.println("this.getAge()= " + this.getAge()
                + ", employee.getAge()=" + employee.getAge() + "\n");

        if (this.getAge() < employee.getAge())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

}

/*
 * Storing user-defined class objects.
 */

public class Assignemnt3
{
    public static void main( String[] args )
    {
        TreeSet<Employee> treeSet = new TreeSet<Employee>();

        Employee john = new Employee("Anna", 20, 40000);
        Employee david = new Employee("Andrew", 10, 80000);
        Employee peter = new Employee("Peter", 30, 150000);

        System.out.println(john + " is going to be add in treeSet");
        treeSet.add(john);
        
        System.out.println(david + " is going to be add in treeSet");
        treeSet.add(david);
        
        System.out.println(peter + " is going to be add in treeSet");
        treeSet.add(peter);
        

        System.out.println("treeSet : " + treeSet + "\n");
        System.out.println("--------------------------------------------");
        /*
         * Using for each loop getting each employee object from the treeSet
         */
        for( Employee employee : treeSet )
        {
            System.out.println("Employee Age : "+employee.getAge());
            System.out.println("Employee Name : "+employee.getName());
            System.out.println("Employee Salary :"+ employee.getSalary());
            System.out.println("--------------------------------------------");
        }

    }
}
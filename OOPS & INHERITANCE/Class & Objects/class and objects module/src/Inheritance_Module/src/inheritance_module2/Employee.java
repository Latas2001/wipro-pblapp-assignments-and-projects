package inheritance_module2;

public class Employee extends Person {
	private double aSal;
	private int sWyear;
	private String nInumber;
	
	public Employee(String name, double aSal, int sWyear, String nInumber) {
		super(name);
		this.aSal = aSal;
		this.sWyear = sWyear;
		this.nInumber = nInumber;
	}
	
	public double getaSal() {
		return aSal;
	}
	
	public int getsWyear() {
		return sWyear;
	}
	
	public String getnInumber() {
		return nInumber;
	}
	public String getname() {
		return name;
	}
	
	public String toString() {
		return "Employee[name = " + name + ", annual salary = " + aSal + ", started working in year = " + sWyear + ", and national insurance number = "+ nInumber + "]";
	}

}

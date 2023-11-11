package oops;

public class Employee {
	
	String Name;
	int EmpId;
	private int salry;
	
	public void Display()
	{
		System.out.println("Name = " + Name);
		System.out.println("id = " + EmpId);
		System.out.println("sal = "+ salry);
	}
	public void salary(int sal)
	{
		salry=sal;
	}
	
	public Employee()
	{
		System.out.println("Default");
	}
	
	public Employee(String N1, int E1, int S1)
	{
		this.Name = N1;
		this.EmpId = E1;
		this.salry= S1;
	}
	

}

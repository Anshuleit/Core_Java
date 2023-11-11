package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1= new Employee();
		emp1.Name= "Abc";
		emp1.EmpId = 100;
		emp1.salary(50000);
		
		Employee emp2= new Employee();
		emp2.Name= "def";
		emp2.EmpId = 101;
		emp2.salary(56000);
		
		Employee emp3= new Employee("xyz",103,50000);
		emp1.Display();
		emp2.Display();
		emp3.Display();
		
		ICICI obj1 = new ICICI();
		obj1.acc_no= 1234;
		obj1.bankid= 100;
	}

}

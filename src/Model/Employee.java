package Model;

public class Employee extends Man {
	
	private int salary;
	
	
	
	
	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee()
	{
		
	}

	public Employee( String name , int age , Gender gender , int salary)
	{
		super(name , age , gender);
		this.salary = salary;
	}

}

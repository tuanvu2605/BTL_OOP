package Model;

public class Employee extends Man {
	
	private int id;
	private int salary;
	private long startTime;
	private long endTime;
	private boolean isFired;
	
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public long getStartTime() {
		return startTime;
	}



	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}



	public long getEndTime() {
		return endTime;
	}



	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}



	public boolean isFired() {
		return isFired;
	}



	public void setFired(boolean isFired) {
		this.isFired = isFired;
	}



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
		this.startTime = System.currentTimeMillis();
		this.isFired = false;
				
	}

}

package Model;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> listEmployee;
	private static EmployeeManager instance = null;
	
	
	
	public static EmployeeManager getInstance() {
	    if(instance == null) {
	       instance = new EmployeeManager();
	    }
	    return instance;
	 }

	public EmployeeManager()
	{
		this.listEmployee = new ArrayList<Employee>();
	}

	public ArrayList<Employee> getListEmployee() {
		return listEmployee;
	}
	
	public void addEmployee(Employee e)
	{
		this.listEmployee.add(e);
	}
	
	public void fireEmployee(Employee e)
	{
		if (this.listEmployee.contains(e))
		{
			this.listEmployee.remove(e);
		}
	}

	
	
}

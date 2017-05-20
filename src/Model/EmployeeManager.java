package Model;

import java.util.ArrayList;

public class EmployeeManager {
	
	private ArrayList<Employee> listEmployee;
	private static EmployeeManager instance = null;
	
	final static int  EMPLOYEE_SALARY = 1000000 ;
	
	
	
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
			e.setFired(true);
		}
	}
	
	public void paySalary(Employee e)
	{
		int pay = MoneyManager.getInstance().getInvestmentMoney() + EmployeeManager.EMPLOYEE_SALARY;
		MoneyManager.getInstance().setInvestmentMoney(pay);
		
		PaySalaryEmployee p = new PaySalaryEmployee(e , EmployeeManager.EMPLOYEE_SALARY);
		MoneyManager.getInstance().getListPaySalary().add(p);
		
		
		
		
	}

	
	
}

package Model;

public class Manager  extends Man{
	
	private MoneyManager moneyManager;
	private ProductManager productManager;
	private EmployeeManager employeeManager;
	public Manager() {
		// TODO Auto-generated constructor stub
		moneyManager = MoneyManager.getInstance();
		productManager = ProductManager.getInstance();
		employeeManager = EmployeeManager.getInstance();
	}
	public MoneyManager getMoneyManager() {
		return moneyManager;
	}
	public ProductManager getProductManager() {
		return productManager;
	}
	public EmployeeManager getEmployeeManager() {
		return employeeManager;
	} 
	
	

}

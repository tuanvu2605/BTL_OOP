package Model;

public class PaySalaryEmployee {
	
	private Employee emp;
	private int money;
	private long time;
	
	public PaySalaryEmployee(Employee e , int money){
		this.money = money;
		this.emp = e;
		this.time = System.currentTimeMillis();
				
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
	
	

}

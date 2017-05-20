package Model;

import java.util.ArrayList;



public class MoneyManager {
	

	private int revenue;
	private int investmentMoney;
	private ArrayList<SellItem> listSellItem;
	private ArrayList<PaySalaryEmployee> listPaySalary;
	
	private static MoneyManager instance = null;
	
	
	public ArrayList<PaySalaryEmployee> getListPaySalary() {
		return listPaySalary;
	}

	public static MoneyManager getInstance() {
	    if(instance == null) {
	       instance = new MoneyManager();
	    }
	    return instance;
	 }
	
	public MoneyManager()
	{
		this.listSellItem = new ArrayList<SellItem>();
		this.listPaySalary = new  ArrayList<PaySalaryEmployee>();
	}

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}

	public int getInvestmentMoney() {
		return investmentMoney;
	}

	public void setInvestmentMoney(int investmentMoney) {
		this.investmentMoney = investmentMoney;
	}

	public ArrayList<SellItem> getListSellItem() {
		return listSellItem;
	}

	public void setListSellItem(ArrayList<SellItem> listSellItem) {
		this.listSellItem = listSellItem;
	}
	
	
	public void moneyReport(long startDate , long endDate)
	{
		int tienlaibansach = 0;
		int tientraluongNV = 0;
		for (int i = 0 ; i < listSellItem.size() ; i ++){
			
			SellItem s = listSellItem.get(i);
			if (s.getTime() >= startDate && s.getTime() <= endDate){
				
				int offset =  s.getItem().getPrice().priceOut - s.getItem().getPrice().priceIn;
				tienlaibansach += offset;
			}
		}
		
		for (int i = 0 ; i < listPaySalary.size() ; i ++ ){
			PaySalaryEmployee p = listPaySalary.get(i);
			if (p.getTime() >= startDate && p.getTime() <= endDate)
			{
				tientraluongNV += p.getMoney();
			}
		}
		
	   System.out.println("so tien lai ban sach : " + tienlaibansach);
	   System.out.println("So tien tra luong cho nv: " + tientraluongNV);
			
		
	}
	
	
	
	
	
	

	

	
	

}

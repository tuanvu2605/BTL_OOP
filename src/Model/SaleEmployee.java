package Model;

import java.util.ArrayList;
import java.util.Map;

public class SaleEmployee  extends Employee{
	
	private ProductManager productManager;
	
	public SaleEmployee()
	{
		this.productManager = ProductManager.getInstance();
	}
	
	public SaleEmployee( String name , int age , Gender gender , int salary)
	{
		super(name , age , gender , salary);
		this.productManager = ProductManager.getInstance();
		
	}
	
	
	public void payForCustomer(Customer cus){
		
		ArrayList<Item> listItem = cus.getListItem();
		Map<Integer, Integer> itemsWithCount = cus.getItemsWithCount();
		int moneyToPay = 0;
		for (int i = 0 ; i < listItem.size() ; i ++ )
		{
			Item item = listItem.get(i);
			moneyToPay += item.getPrice().priceOut;
			int count = itemsWithCount.get(item.getId());
			this.productManager.sellItem(item, count);
		}
		
		
	}
	
	public void makeBill(ArrayList<Item> list , int moneyToPay)
	{
		
	}

}

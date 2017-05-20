package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Customer extends Man {
	
	private Map<Integer, Integer> itemsWithCount;
	private ArrayList<Item> listItem;
	
	public Customer()
	{
		this.itemsWithCount = new HashMap<Integer, Integer>();
		this.listItem = new ArrayList<Item>();
	}

	public Map<Integer, Integer> getItemsWithCount() {
		return itemsWithCount;
	}
	
	
	
	public ArrayList<Item> getListItem() {
		return listItem;
	}

	public void addItem(Item item , int count)
	{
	
		if (this.itemsWithCount.containsKey(item.getId()))
		{
			int oldCount = this.itemsWithCount.get(item.getId());
			int newCount = count + oldCount;
			this.itemsWithCount.put(item.getId(), newCount);
			
		}else
		{
			this.listItem.add(item);
			this.itemsWithCount.put(item.getId(), count);
		}
		
		
	}
	
	public void removeItem(Item item)
	{
		if (this.itemsWithCount.containsKey(item.getId()))
		{
			this.listItem.remove(item);
			this.itemsWithCount.remove(item.getId());
		}
	}
	
	
}

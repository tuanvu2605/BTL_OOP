package Model;

import java.util.ArrayList;
import java.util.Map;

public class ProductManager {
private ArrayList<Item> storeHouse; 
private Map<Integer, Integer> itemsWithCount;

public void AddItem(){
	String type = new String();
	switch (type) {
	case "book":
		Book newBook = new Book();
		checkItemAndAddCount(newBook);	
		break;
	case "filmcd":
		FilmCD newFilmCD = new FilmCD();
		checkItemAndAddCount(newFilmCD);
		break;
	case "musiccd":
		MusicCD newMusicCD = new MusicCD();
		checkItemAndAddCount(newMusicCD);
		break;
	default:
		break;
	}

}

public void checkItemAndAddCount(Item item)
{
	if(!storeHouse.contains(item)){
		this.storeHouse.add(item);
		itemsWithCount.put(item.getId(), 1);
	}else
	{
		Integer itemCount = itemsWithCount.get(item.getId());
		itemCount = itemCount+1;
		itemsWithCount.put(item.getId(),itemCount);
	}
}

public Item selectItemByID(int id)
{

	for(Item i : storeHouse){
		if(i.getId()== id)
		{
			return i;
		}
	}
	
	return null;
}

public void increseCount (Item item , int num)
{
	if(storeHouse.contains(item)){
		Integer itemCount = this.itemsWithCount.get(item.getId());
		itemCount = itemCount + num;
		itemsWithCount.put(item.getId(), itemCount);
	 	
	}else
	{
		storeHouse.add(item);
		itemsWithCount.put(item.getId(), num);
	}
	
}
public void decreseCount (Item item , int num)
{
	if(storeHouse.contains(item)){
		Integer itemCount = this.itemsWithCount.get(item.getId());
		if(itemCount > num){
			itemCount = itemCount - num ;
			itemsWithCount.put(item.getId(), itemCount);	
		}
		else if(itemCount == num){
			itemsWithCount.remove(item.getId());
			storeHouse.remove(item);
		}
		else {
			System.out.println("so luong cua item khong du");
		}
	}
	else{
		System.out.println("khong ton tai item ");
	}
}

public ArrayList<Item> listItemWithClass(Class<?> cls){
	ArrayList<Item> arrList = new ArrayList();
	
		for (int i = 0 ; i < storeHouse.size() ; i++)
		{
			Item item = storeHouse.get(i);
			if (item.getClass() == cls)
			{
				arrList.add(item);
			}
			
		}
		
	return arrList;
	
}

}

package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductManager {
	
private static ProductManager instance = null;	
	
private ArrayList<Item> storeHouse; 
private Map<Integer, Integer> itemsWithCount;

private ArrayList<Book> bookSelled;
private Map<Integer, Integer> bookSelledItemCount;

private ArrayList<FilmCD> filmCDSelled;
private Map<Integer, Integer> filmCDSelledCount;

private ArrayList<MusicCD> musicCDSelled;
private Map<Integer, Integer> musicCDSelledCount;

public static ProductManager getInstance() {
    if(instance == null) {
       instance = new ProductManager();
    }
    return instance;
 }


public ProductManager()
{
	storeHouse = new ArrayList<Item>();
	itemsWithCount = new HashMap<Integer, Integer>();
	
	bookSelled = new ArrayList<Book>();
	bookSelledItemCount = new HashMap<Integer, Integer>();
	
}


public void addItem(Item i){
//	String type = new String();
//	if (i.getClass().equals(Book.class))
//	{
//		type = "book";
//	}else if (i.getClass().equals(FilmCD.class)){
//		type = "filmcd";
//	}else if (i.getClass().equals(MusicCD.class))
//	{
//		type = "musiccd";
//	}
//	switch (type) {
//	case "book":
//		Book newBook = new Book();
//		checkItemAndAddCount(newBook);	
//		break;
//	case "filmcd":
//		FilmCD newFilmCD = new FilmCD();
//		checkItemAndAddCount(newFilmCD);
//		break;
//	case "musiccd":
//		MusicCD newMusicCD = new MusicCD();
//		checkItemAndAddCount(newMusicCD);
//		break;
//	default:
//		break;
//	}
	checkItemAndAddCount(i);

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

	for(int i = 0 ; i < storeHouse.size();i++){
		Item item = storeHouse.get(i);
		
		
		if(item.getId()== id)
		{
			return item;
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
public void sellItem(Item item,int count){
	if(item.getClass().equals(Book.class))
	{
		if(itemsWithCount.get(item.getId())>= count){
		decreseCount(item, count);
		if (bookSelled.contains((Book)item)){
			
			Integer bookCount = bookSelledItemCount.get(item.getId());
			bookCount = bookCount + count;
			bookSelledItemCount.put(item.getId(), count);
			
		}
		else
		{
			bookSelled.add((Book) item);
			bookSelledItemCount.put(item.getId(), count);
		}
	}
		else {
			System.out.println("khong ban duoc");
		}
	}

	else if(item.getClass().equals(FilmCD.class))
		{
			if(itemsWithCount.get(item.getId()) >= count)
			{
				decreseCount(item, count);
				if(filmCDSelled.contains((FilmCD)item)){
					Integer filmCDCount = filmCDSelledCount.get(item.getId());
						}
				else {
					filmCDSelled.add((FilmCD)item);
					filmCDSelledCount.put(item.getId(), count);
				}
			}
			else{
				System.out.println("khong ban duoc");
		}
	}
	
	else if (item.getClass().equals(MusicCD.class))
		{
			if(itemsWithCount.get(item.getId()) >= count){
				decreseCount(item, count);
				if(musicCDSelled.contains((MusicCD)item)){
					Integer musicCDCount = musicCDSelledCount.get(item.getId());
				}
				else {
					musicCDSelled.add((MusicCD)item);
					musicCDSelledCount.put(item.getId(), count);
					
				}
			}
			else {
				System.out.println("khong ban duoc");
			}
		}


}

}

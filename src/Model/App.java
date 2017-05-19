package Model;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  
			
			System.out.println(Book.class);
			
			for (String string : args) {
				
			}
			ProductManager manager = new ProductManager();
		
			
			Price price = new Price(10000, 25000);
			String newBookName = "GOT";
			BookKind newBookKind = BookKind.detective;
			Author newBookAuthor = new Author();
			
		

		    Book newBook = new Book(newBookName,price, newBookKind , newBookAuthor);
		    newBook.setId(999);

		    manager.addItem(newBook);
		    // cheeck Book 
		   
		    for (int i = 0 ; i < manager.storeHouse.size() ; i ++)
		    {
		    	Item it = manager.storeHouse.get(i);
		    	System.out.println(it.getName());
		 //   	System.out.println(it.getId()); id da trong storehouse 

		    }
		    // da ban Book co ID = 999
		    Item sellItem = manager.selectItemByID(999);
		    manager.sellItem(sellItem, 1);
		    
		    for (int i = 0 ; i < manager.bookSelled.size() ; i++){
		    	Book bk = manager.bookSelled.get(i);
		    	System.out.println("da ban "+bk.getName());
		    }
		  // them Item  Book co Id = 999 
		    manager.increseCount (newBook , 10);
		    for ( int i = 0 ; i< manager.storeHouse.size(); i++){
		    	Item hn = manager.storeHouse.get(i);
		    	System.out.println("them so luong Book  "+hn.getName()+"  "+manager.itemsWithCount.get(hn.getId()));
		    	
		    }
		 // giam Item Book co id = 999
		    manager.decreseCount (newBook , 3);
		    for ( int i = 0 ; i< manager.storeHouse.size(); i++){
		    	Item hn = manager.storeHouse.get(i);
		    	System.out.println("giam so luong sach "+hn.getName()
		    											+ " di 3 quyen con lai  "
		    											+manager.itemsWithCount.get(hn.getId()));
               }
		    
		    //  sach trong kho
		    ArrayList<Item> listBook = manager.listItemWithClass(Book.class);
		    for( int i = 0; i < listBook.size();i++){
		    	Item hn = listBook.get(i);
		    	System.out.println("sach trong kho : "+hn.getName());
		    }
		    
		    // ban san pham 
		    manager.sellItem(newBook, 3);
		    for( int i = 0 ; i < manager.storeHouse.size();i++){
		    	Item hn = manager.storeHouse.get(i);
		    	System.out.println("ban "+hn.getName()+" voi so luong  "
		    												+manager.bookSelledItemCount.get(hn.getId())
		    												+" con lai "
		    												+manager.itemsWithCount.get(hn.getId())) ;
		    }
		    	 
		     
	}
		   
}
	
		


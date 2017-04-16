package Model;

import java.util.Map;

public class Item {
 private String name;
 private Price price;
 private int id;
 
 public Item (){
	 
 }
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Price getPrice() {
	return price;
}
public void setPrice(Price price) {
	this.price = price;
}

//public void AddItem()
//{
//	
//	// nhap kieu - book , film CD , Music CD
//	
//
//	String type = new String();
//	switch (type) {
//	case "Book":
//		// nhap thong tin sach
//		String name =  new String();
//		Price bookPrice = new Price();
//		Author author = new Author();
//		author.setAge(30);
//		author.setName("KKK");
//		author.setGender(Gender.male);
//		Book newBook = new Book(name ,bookPrice, BookKind.detective ,author);
//		
//		break;
//
//	default:
//		break;
//	}
//	
//}
 
 
}

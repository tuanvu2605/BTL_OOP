package Model;

public class Book extends Item{
	private PublishingCompany publishingCompany;
	public BookKind kind ;
	private Author author;
	
	public Book(String name , Price price , BookKind kind , Author author)
	{
		this.setName(name);
		this.setPrice(price);
		this.kind = kind;
		this.setAuthor(author);
	}
	
	public PublishingCompany getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(PublishingCompany publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}

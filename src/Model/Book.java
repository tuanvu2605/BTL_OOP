package Model;

public class Book extends Item{
	private PublishingCompany publishingCompany;
	public BookKind kind ;
	private Author author;
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

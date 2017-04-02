package Model;

public class PublishingCompany {
private String name ;
private String address;

public PublishingCompany(String name , String adress)
{
	this.setName(name);
	this.setAddress(adress);

}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}

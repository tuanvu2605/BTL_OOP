package Model;

enum Gender
{
	male ,
	female
}

public class Man {
private String name;
private int age;
private Gender gender;

public Man()
{
	
}

public Man( String name , int age , Gender gender)
{
	this.setName(name);
	this.setAge(age);
	this.setGender(gender);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}

public void getInfo(){	
	System.out.println("Name : "+getName());
	System.out.println("Age : "+getAge());
	System.out.println("Gender : "+getGender());

}
}

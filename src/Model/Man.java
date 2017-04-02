package Model;

public class Man {
private String name;
private int age;
private int gender;
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
public int getGender() {
	return gender;
}
public void setGender(int gender) {
	this.gender = gender;
}

public void getInfo(){	
	System.out.println("Name : "+getName());
	System.out.println("Age : "+getAge());
	System.out.println("Gender : "+getGender());

}
}

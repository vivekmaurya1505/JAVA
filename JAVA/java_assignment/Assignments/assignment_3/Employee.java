package assignment3;

public class Employee {

private int id;
private String name;
private Address address;



public Employee() {
	
}



public Employee(int id, String name, Address address) {
	
	this.id = id;
	this.name = name;
	this.address = address;
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



public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	this.address = address;
}

void print() {
	System.out.print(id+ ", " + name );
	address.printAddress();
}

	
}

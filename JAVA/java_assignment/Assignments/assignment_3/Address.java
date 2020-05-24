package assignment3;

public class Address {


private String flat;
private String pincode;
private String city;
private String state;

Address(){
	
}

public String getFlat() {
	return flat;
}

public void setFlat(String flat) {
	this.flat = flat;
}

public String getPincode() {
	return pincode;
}

public void setPincode(String pincode) {
	this.pincode = pincode;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

void printAddress() {
	System.out.print(flat+", "+city+", "+pincode+", "+state);
}

	
}

public class Student extends User{
	private String address;

	public Student(int id,String firstName,String lastName,String email,String password,String address) {
	setId(id);
	setFirstName(firstName);
	setLastName(lastName);
	setEmail(email);
	setPassword(password);
	this.setAddress(address);
}

	public String getAddress() {
	return this.address;
}
	public void setAddress(String address) {
	this.address=address;
}
	
	
}

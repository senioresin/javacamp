public class Instructor extends User {
private String department;
	
	public Instructor() {
		
	}
	
	public Instructor(int id,String firstName,String lastName,String email,String password,String department) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPassword(password);
		this.setDepartment(department);
	}
	
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	

}

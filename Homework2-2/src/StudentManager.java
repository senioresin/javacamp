public class StudentManager extends UserManager{
	
	public void addComment(String comment) {
		System.out.println(comment);
		System.out.println("Yorumu sisteme eklendi");
	}
	
	public void addAddress(Student student,String address) {
		student.setAddress(address);
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getAddress()+" adresini ekledi.");	
	}

}
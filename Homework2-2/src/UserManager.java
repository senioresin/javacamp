public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName()+ " isimli kullanýcý sisteme eklendi.");
		System.out.println("Email: " +user.getEmail()+ " " +"Þifre: " +user.getPassword());
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName()+ " isimli kullanýcý sistemden silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+ " " +user.getLastName()+ " isimli kullanýcý bilgileri güncellendi.");
	}

}
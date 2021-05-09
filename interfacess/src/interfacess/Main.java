package interfacess;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager();
		
		Customer engin = new Customer (1,"Engin", "Demiroğ");
		
		customerManager.add(engin);
		
		}

}

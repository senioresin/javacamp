package interfacess;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi " + customer.getFirstname());
		
		
		
		DatabseLogger logger = new DatabseLogger ();
		logger.Log(customer.getFirstname()+ " veri tabanına logladnı");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri Sililndi " + customer.getFirstname());
		
		
		DatabseLogger logger = new DatabseLogger();
		logger.Log(customer.getFirstname() + " veri tabanına loglandı");
}
}
package inheritance;

public class CustomerManager {
	
	public void add(IndividualCustomer customer) {
		
		System.out.println(customer.customerNumber + "kaydedildi");
	}
	
	public void add(CorporateCustomer customer) {
		
	System.out.println(customer.customerNumber + "kaydeildi");	
	}

}

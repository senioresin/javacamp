package concrete;

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class CarCustomerManager extends CustomerManagerBase{

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void save(Customer customer)throws RemoteException {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Customer Saved to Database : " + customer.getFirstName());
		}
		else {
			
			System.out.println("Customer couldn't save !");
		}
	}
}
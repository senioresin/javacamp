package nLayeredDemo;

import nLayeredDemo.DataAccess.concretes.AbcProductDao;
import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//ToDo Spring IoC ile çözülücek
			ProductService productService = new ProductManager (new AbcProductDao() new JLoggerManagerAdapter());
			
			Product product = new Product(1,2," Elma ",12,50);
			productService.add(product);
		
		
	}

}

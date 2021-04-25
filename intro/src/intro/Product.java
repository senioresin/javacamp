package intro;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

class Product {
	
	private int id;
	private String name;
	private String detail;
	private int unitPrice;

	public static void main (String[] args) {
		
		Product product1 = new Product();
        product1.id = 1;
        product1.name = "Lenovo 14";
        product1.detail = "16 GB Ram";
        product1.unitPrice = 15000;

        Product[] products = {product1};

        System.out.println(products.length);
		
	}

}


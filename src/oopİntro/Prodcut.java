package src.oopİntro;

class Prodcut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	private double unitPriceAfterDiscount;
	
	
	public Prodcut(double unitPrice, String name, double discount, double unitPriceAfterDiscount, String detail,
			int id) {
		super();
		this.unitPrice = unitPrice;
		this.name = name;
		this.discount = discount;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
		this.detail = detail;
		this.id = id;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(AfterDiscount " this.discount / 100 );
	}


	
	
	

}

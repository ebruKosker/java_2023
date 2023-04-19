package classesWithAttributes;

public class Product {
	private int id;
	private String name;
	private double price;
	private String stockAmount;
	private String collor;
	private String code;

	
	public Product() {
		System.out.println("yapıcıblok çalıştı ");
	}
	

	public Product(int id, String name, double price, String stockAmount, String collor) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stockAmount = stockAmount;
		this.collor = collor;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(String stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
		this.collor = collor;
	}

	public String getCode() {
		return name.substring(0, 1)+id;
	}



}

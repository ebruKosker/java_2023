package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		Product product1= new Product(2,"mösd",99,"hkjkj","lsdlşd");
		product.setId(11);
		product.setName("sdkfj");
		product.setCollor("kldflş");
		product.setPrice(54487);
		product.setStockAmount("klşfg");

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
		
	}

}

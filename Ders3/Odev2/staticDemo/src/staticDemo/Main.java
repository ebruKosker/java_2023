package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.price=5;
		product.name="jklşl";
		manager.add(product);
		
		DatabaseHelper.Crud.Delete();

	}

}

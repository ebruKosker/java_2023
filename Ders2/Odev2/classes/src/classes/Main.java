package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManeger=new CustomerManager();
		CustomerManager customerManeger2=new CustomerManager();
		customerManeger=customerManeger2;
		customerManeger.Add();
		customerManeger.Remove();
		customerManeger.Update();
		
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=30;
		System.out.println(sayi1);
		
		int[] sayilar1= {1,2,3};
		int[]sayilar2= {4,5,6};
		sayilar1=sayilar2;
		sayilar2[0]=10;
		System.out.println(sayilar1[0]);
	}

}

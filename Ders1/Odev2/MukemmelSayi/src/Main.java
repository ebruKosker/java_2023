import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz");
		int value=input.nextInt(),toplam=0;
		
		if(value>2) {
			for(int i=1;i<value;i++) {
				if(value%i==0) {
					toplam=toplam+i;
				}
			}
		}
		
		if(toplam==value&&value!=0) {
			System.out.println("Sayi mukemmel sayidir");
		}
		else
			System.out.println("Sayi mukemmel sayi degildir");
	}

}

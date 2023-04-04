import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Birinci Sayiyi Giriniz");
		int value1=input.nextInt(),toplam1=0;
		System.out.println("Ikinci Sayiyi Giriniz");
		int value2=input.nextInt(),toplam2=0;
		if(value1>2) {
			for(int i=1;i<value1;i++) {
				if(value1%i==0) {
					toplam1=toplam1+i;
				}
			}
		}
		if(value2>2) {
			for(int i=1;i<value2;i++) {
				if(value2%i==0) {
					toplam2=toplam2+i;
				}
			}
		}
		
		if(toplam2==value1&&value1!=0&&toplam1==value2&&value2!=0) {
			System.out.println("Sayilar arkadas sayilardir");
		}
		else
			System.out.println("Sayilar arkadas sayilar DEGILDIR");
	}

}

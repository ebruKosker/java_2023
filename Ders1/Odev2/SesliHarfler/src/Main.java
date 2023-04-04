import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Sesli bir karakter giriniz");
		char c=input.next().charAt(0);
		switch(c) {
		case 'A':
		case 'a':
		case 'I':
		case 'ı':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("Girdiginiz Harf Kalindir");
			break;
		case 'e':
		case 'E':
		case 'İ':
		case 'i':
		case 'Ö':
		case 'ö':
		case 'Ü':
		case 'ü':
			System.out.println("Girdiginiz Harf İncedir");
			break;
			default:
				System.out.println("Girdiginiz Harf Gecersizdir");
			
		}

	}

}

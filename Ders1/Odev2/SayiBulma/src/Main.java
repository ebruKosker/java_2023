
public class Main {

	public static void main(String[] args) {
		int [] dizi= {1,2,3,4,10,15,19,23,30,41,44,50};
		int aranacakSayi=15,a=0;
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i]==aranacakSayi) {
				System.out.println("Dizinin içinde aranan sayi var");
				a=1;
				break;
			}
				
		}
		if(a==0)
			System.out.println("Dizinin içinde aranan sayi yok");
	}

}

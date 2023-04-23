package abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator gameCalculator=new KidsGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();
	}

}

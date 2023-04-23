package abstractClasses;

public abstract class GameCalculator {
//abstract sınıflar asla new leneme ve tek başına kullanılamaz
	public abstract void hesapla();
	public final void gameOver() {
		System.out.println("oyun bitti ...");
	}
}

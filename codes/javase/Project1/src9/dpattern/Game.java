package dpattern;

public class Game {
	
	private static Game instance;
	
	private Game() {
		System.out.println("Oyun yaradildi!");
	}
	
	public static Game getInstance() {
		if (instance == null) {
			instance = new Game();
		}
		
		return instance;
	}
	
	public void showInfo() {
		System.out.println("Oyun basladi!");
	}
	
	public static void main(String[] args) {
		Game g1 = getInstance();
		Game g2 = getInstance();
		
		g1.showInfo();
		g2.showInfo();
		
		System.out.println(g1 == g2);
	}

}

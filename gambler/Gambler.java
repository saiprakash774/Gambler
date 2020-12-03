package gambler;

public class Gambler {
	//Uc-1
	private final static int BET = 1;
	private static int STAKE = 100;
	//UC-2
	public static void checkWinorLoose() {
		int result = (int) Math.floor(Math.random() * 10) % 2;
		if(result==1)
			System.out.println("Gambler Wins");
		else
			System.out.println("Gambler Looser");
	}
	public static void main(String args[]) {
		checkWinorLoose();
	}
}

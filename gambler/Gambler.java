package gambler;


public class Gambler {
	private final static int BET=1;
	private static int STAKE=100;
	
	public static void game() {
		int result=(int)Math.floor(Math.random()*10)% 1;
		if(result==1) {
			STAKE++;
			System.out.println(STAKE);
		}
		else {
			STAKE--;
			System.out.println(STAKE);
		}
	}
	public static void main(String args[]) {
		game();
	}
}

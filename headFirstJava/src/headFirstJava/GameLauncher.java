package headFirstJava;

public class GameLauncher {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println(StartMsg());
		
		GuessGame game = new GuessGame();
		int guessNum = game.getRandomNumber();
		
		System.out.println(runningMsg(guessNum));
		
	player p1 = new player();
	player p2 = new player();
	player p3 = new player();
	
	int playerOne = p1.play();
	int playerTwo = p2.play();
	int playerThree = p3.play();
	
	System.out.println(status("Player One", playerOne));
	System.out.println(status("Player Two", playerTwo));
	System.out.println(status("Player Three", playerThree));
	System.out.println(conditionalFun(playerOne, guessNum));
}
	
	static String StartMsg(){
		return "I'm thinking of a number between 0-9";
	}
	
	static String runningMsg(int guess){
		return "Number to guess is: " + guess;
	}
	
	static String status(String player, int status) {
		return player + " guessed " + status;
	}
	
	static boolean conditionalFun(int input, int guessNum) {
		return input == guessNum;
	}
}










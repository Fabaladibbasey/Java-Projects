package headFirstJava;

public class GuessGame {

	private int randomNumber() {
		int ranNum = (int)Math.floor((Math.random() * 10));
		return ranNum;
	}
	
	int getRandomNumber() {
		return randomNumber();
	}

}


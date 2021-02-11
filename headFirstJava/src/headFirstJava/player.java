package headFirstJava;

import java.util.Scanner;

public class player {

		 int play() {
			Scanner scan = new Scanner(System.in);
			System.out.print("I'm Guessing: ");
			int inputNumber = scan.nextInt();	
			return inputNumber;
		}
		

	}


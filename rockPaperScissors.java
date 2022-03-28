package workDisplay;

import java.util.Scanner;

public class rockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String player1 = null, player2 = null, answer = null,
				a = player1 + " got rock and " + player2 + " got scissors. " + player1 + " WINS!",
				b = player1 + " got scissors and " + player2 + " got paper. " + player1 + " WINS!",
				c = player1 + " got paper and " + player2 + " got rock. " + player1 + " WINS!",
				d = player2 + " got rock and " + player1 + " got scissors. " + player2 + " WINS!",
				e = player2 + " got scissors and " + player1 + " got paper. " + player2 + " WINS!",
				f = player2 + " got paper and " + player1 + " got rock. " + player2 + " WINS!",
				g = "You got the same result.";
		int player1WinningCounter = 0, player2WinningCounter = 0;
		System.out.println("Welcome to my game ROCK-PAPER-SCISSORS! Please enter your names");
		player1 = input.nextLine();
		if (player1.charAt(0) >= 97 && player1.charAt(0) <= 122) {
			player1 = (char) (player1.charAt(0) - 32) + player1.substring(1);// set capital letter
		}
		player2 = input.nextLine();
		if (player2.charAt(0) >= 97 && player2.charAt(0) <= 122) {
			player2 = (char) (player2.charAt(0) - 32) + player2.substring(1); // set capital letter
		}
		int rock = 0, paper = 1, scissors = 2;
		System.out.println("Press any key to begin");
		answer = input.nextLine();

		System.out.println("Let's begin!");
		System.out.println("");
		System.out.println(gameWinner(player1, player2));
		if (gameWinner(player1, player2).equals(a)) {
			player1WinningCounter++;
		} else if (gameWinner(player1, player2).equals(b)) {
			player1WinningCounter++;
		} else if (gameWinner(player1, player2).equals(c)) {
			player1WinningCounter++;
		} else if (gameWinner(player1, player2).equals(d)) {
			player2WinningCounter++;
		} else if (gameWinner(player1, player2).equals(e)) {
			player2WinningCounter++;
		} else if (gameWinner(player1, player2).equals(f)) {
			player2WinningCounter++;
		}
		System.out.println("If you want to have more matches press '1', if you want to quit press '999'");
		int userChoose = input.nextInt();
		switch (userChoose) {
		case 1: {
			System.out.println("how many matches do you want to add?");
			int numberOfAddedMatches = input.nextInt();
			System.out.println("press any button to resume");
			for (int i = 0; i < numberOfAddedMatches; i++) {
				System.out.println(gameWinner(player1, player2));
				if (gameWinner(player1, player2).equals(a)) {
					System.out.println(gameWinner(player1, player2).equals(a));
					player1WinningCounter++;
				} else if (gameWinner(player1, player2).equals(b)) {
					System.out.println(gameWinner(player1, player2).equals(b));
					player1WinningCounter++;
				} else if (gameWinner(player1, player2).equals(c)) {
					System.out.println(gameWinner(player1, player2).equals(c));
					player1WinningCounter++;
				} else if (gameWinner(player1, player2).equals(d)) {
					System.out.println(gameWinner(player1, player2).equals(d));
					player2WinningCounter++;
				} else if (gameWinner(player1, player2).equals(e)) {
					System.out.println(gameWinner(player1, player2).equals(e));
					player2WinningCounter++;
				} else if (gameWinner(player1, player2).equals(f)) {
					System.out.println(gameWinner(player1, player2).equals(f));
					player2WinningCounter++;
				}
			}
		}

			if (player1WinningCounter > player2WinningCounter) {
				System.out.println(player1 + " got " + player1WinningCounter + " wins and " + player2 + " got "
						+ player2WinningCounter + " wins. " + player1 + " WINS!");
			} else if (player2WinningCounter > player1WinningCounter) {
				System.out.println(player2 + " got " + player2WinningCounter + " wins and " + player1 + " got "
						+ player1WinningCounter + " wins. " + player2 + " WINS!");
			} else if (player1WinningCounter == player2WinningCounter) {
				System.out.println("You both scored the same!");
				while(player1WinningCounter==player2WinningCounter) {
					int funcRes= ifAlwaysTie(player1WinningCounter, player2WinningCounter);
					if (funcRes== player1WinningCounter+1) {
						System.out.println("eventually "+player1+ " WINS!");
					} else if (funcRes== player2WinningCounter+1){
						System.out.println("eventually "+player2+ " WINS!");
					}
			}
		}
			break;
		case 999: {

			System.out.println("THANK YOU!");
		}
			break;
		}
	}

	public static String gameWinner(String player1, String player2) {
		int result1 = 0, result2 = 0, rock = 0, paper = 1, scissors = 2;
		String a = player1 + " got rock and " + player2 + " got scissors. " + player1 + " WINS!",
				b = player1 + " got scissors and " + player2 + " got paper. " + player1 + " WINS!",
				c = player1 + " got paper and " + player2 + " got rock. " + player1 + " WINS!",
				d = player2 + " got rock and " + player1 + " got scissors. " + player2 + " WINS!",
				e = player2 + " got scissors and " + player1 + " got paper. " + player2 + " WINS!",
				f = player2 + " got paper and " + player1 + " got rock. " + player2 + " WINS!",
				g = "You got the same result.";
		result1 = (int) (Math.random() * 3) + 0;
		result2 = (int) (Math.random() * 3) + 0;
		if (result1 == rock && result2 == scissors) { // terms for winning
			return a;
		} else if (result1 == scissors && result2 == paper) {
			return b;
		} else if (result1 == paper && result2 == rock) {
			return c;
		} else if (result2 == rock && result1 == scissors) {
			return d;
		} else if (result2 == scissors && result1 == paper) {
			return e;
		} else if (result2 == paper && result1 == rock) {
			return f;
		} else if (result1 == result2) {

		}
		return g;
	}
	public static int ifAlwaysTie(int player1WinningCounter, int player2WinningCounter) {
		int rock = 0, paper = 1, scissors = 2, result1=0, result2=0, a=1, b=1, c= 1, d=1, e=1, f=1, g=0;
		result1 = (int) (Math.random() * 3) + 0;
		result2 = (int) (Math.random() * 3) + 0;
		if (result1 == rock && result2 == scissors) { 
			return player1WinningCounter++;
		} else if (result1 == scissors && result2 == paper) {
			return player1WinningCounter++;
		} else if (result1 == paper && result2 == rock) {
			return player1WinningCounter++;
		} else if (result2 == rock && result1 == scissors) {
			return player2WinningCounter++;
		} else if (result2 == scissors && result1 == paper) {
			return player2WinningCounter++;
		} else if (result2 == paper && result1 == rock) {
			return player2WinningCounter++;
		} else if (result1 == result2) {

		}
		return g;
	}
}

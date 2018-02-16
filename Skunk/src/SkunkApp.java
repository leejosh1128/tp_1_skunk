import java.util.Scanner;

public class SkunkApp {

	public static void main(String[] args) {
		System.out.println("-----------Welcome to the Game of Skunk-----------");
		System.out.println("How many players do you have?");
		System.out.println("You have");
		Scanner scan = new Scanner(System.in);
		String option = "";
		boolean systemRun = true;
		int playerNumber = numberOfPlayers(scan);
		System.out.println(playerNumber);
		int[] playerScore = new int[playerNumber];
		int diceResult1 = 0;
		int diceResult2=0;
		PairOfDice pairOfDice=new PairOfDice();
		for (int n = 0; n < playerNumber; n++) {
			System.out.println("You are the No." + (n + 1) + " player. Here are you options");
			systemRun=true;
			while (systemRun) {
				System.out.println("1. roll the dice.");
				System.out.println("2. end this term.");
				option = scan.next();
//				if (option.equals("1")) {
//					
//					System.out.println(pairOfDice.getTotal());
//
//				}
//				if (option.equals("2")) {
//					systemRun=false;
//					System.out.println("Next player");
//
//				} else {
//					System.out.println("Invalid input, please enter againg");
//				}
			}
		}

	}

	public static int numberOfPlayers(Scanner scan) {
		int players = 0;
		try {
			while (true) {
				players = scan.nextInt();
				if (players > 1) {
					System.out.println("You have " + players + " Players.");
					return players;
				} else {
					System.out.println("Please enter the right player numbers.");
				}
				;
			}
		} catch (Exception e) {
			System.out.println("You entered the wrong number. Now the game will start with 2 defalut players");
			players = 2;
			return players;
		}

	}

}

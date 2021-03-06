import java.util.Scanner;

public class PlayerTerm {
	int termScore = 0;

	// RollOrDone rollOrDone=new RollOrDone();
	PairOfDice pairOfDice = new PairOfDice();
	// PlayerSelection playerSelc=new PlayerSelection();
	// int playerNumber=playerSelc.getPlayerNumber();

	int[] playerTermResult = new int[2];
	// Scanner scan = new Scanner(System.in);
	int[]playerLastTerm=new int[2];
	int option = 0;

	public void printSkunkRule() {
		System.out.println("Do you want to see the rules?");
		System.out.println("1. see the rule");
		System.out.println("2. Let's start the game");

		try {
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();
			if (option == 1) {
				String rule1 = "";
				String rule2 = "";
				String rule3 = "";
				rule1 = "A skunk in any series voids the score for that series only and draws a penalty of 1 chip placed in the 'kitty' and loss of dice.";
				rule2 = "A skunk and a deuce voids the score for that series only and draws a penalty of 2 chips placed in the 'kitty,' and loss of dice.";
				rule3 = "TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the 'kitty,' and loss of dice. Player must again start to score from scratch.";
				System.out.println(rule1);
				System.out.println(rule2);
				System.out.println(rule3);
			} else {
				System.out.println("It seems like you all know the rule. Let's start to play.");
			}
		} catch (Exception e) {
			System.out.println("Please enter 1 or 2");
		}
	}

	public void getOptions() {
		// Ask players if they want to roll the dice or end this term
		System.out.println("-------------------------------");
		System.out.println("1. Roll the dice.");
		System.out.println("2. End this term.");

		try {
			Scanner scan = new Scanner(System.in);
			option = scan.nextInt();

		} catch (Exception e) {
			System.out.println("Please enter 1 or 2.");

		}
	}

	public int[] playerTermRun(int playerNumber) {
		boolean termRun = true;

		while (termRun) {

			playerTermResult[0] = 0;
			playerTermResult[1] = 0;
			this.getOptions();

			if (option == 1) {

				playerTermResult = pairOfDice.rollOrDie(playerNumber);
				if (playerTermResult[0] == 0) {

					termRun = false;
				}
				if (playerTermResult[0] != 0) {
					termScore += playerTermResult[0];
					System.out.println("Your current term score is " + termScore);
				}
			}
			if (option == 2) {

				playerTermResult[0] = termScore;

				termRun = false;

			}

			if (option != 1 && option != 2) {
				System.out.println("Wrong input, please use 1 or 2.");

			}

		}
		termScore = 0;
		return playerTermResult;

	}
	
//	public int[] lastTerm(int playerNumber){
//		playerLastTerm[0] = 0;
//		playerLastTerm[1] = 0;
//		System.out.println("------Last term----------------");
//		System.out.println(playerName[lastRun] + " please make your choice:");
//		playerLastTerm = this.playerTermRun(lastRun);
//		playerScore[lastRun] = playerScore[lastRun] + playerCurrentTerm[0];
//		System.out
//				.println(playerName[lastRun] + ", Your total score is " + playerScore[lastRun]);
//		playerChip[lastRun] = playerChip[lastRun] + playerCurrentTerm[1];
//		System.out
//				.println(playerName[lastRun] + ", You have " + playerChip[lastRun] + " chips.");
//		kittyBank = kittyBank - playerCurrentTerm[1];
//		System.out.println("Now in the bank there is " + kittyBank + " chips.");
//		if (playerChip[lastRun] <= 0) {
//			System.out.println(
//					"Sorry, player " + playerName[lastRun] + " you lose all your chips.");
//			System.out.println("You lose");
//			System.out.println("--------------------");
//		}
//		
//		return playerLastTerm;
//	}

}

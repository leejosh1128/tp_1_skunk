import java.util.Scanner;

public class PlayerSelection {

	int allPlayerNumber = 0;

	Scanner scan = new Scanner(System.in);

	public int getPlayerNumber() {
		// Scanner scan=new Scanner(System.in);
		try {
			while (true) {
				allPlayerNumber = scan.nextInt();
				if (allPlayerNumber > 1) {
					System.out.println("Great! You have " + allPlayerNumber + " Players. Let's Go!");
					return allPlayerNumber;
				} else {
					System.out.println("Please enter the right player numbers.");
				}

			}
		} catch (Exception e) {
			System.out.println("You entered the wrong number. Now the game will start with 2 defalut players");
			allPlayerNumber = 2;
			return allPlayerNumber;
		}
	}

	public String[] getPlayerName(int playerNumber) {
		
		String playerName[] = new String[playerNumber];
		for (int n = 0; n <playerNumber; n++) {
			System.out.println("The number " + (n + 1) + " player please enter your name:");
			playerName[n] = scan.next();

		}
		return playerName;
	}
	public int [] getPlayerChips(int playerNumber){
		int[] playerChips=new int[playerNumber];
		for(int n=0;n<playerNumber;n++){
			playerChips[n]=50;
		}
		return playerChips;
	}
	public int [] getPlayerScore(int playerNumber){
		int[] playerScore=new int[playerNumber];
		
		return playerScore;
	}
}

import java.util.Scanner;

public class PlayerSelection {

	int playerNumber = 0;

	Scanner scan = new Scanner(System.in);

	public int getPlayerNumber() {
		// Scanner scan=new Scanner(System.in);
		try {
			while (true) {
				playerNumber = scan.nextInt();
				if (playerNumber > 1) {
					System.out.println("Great! You have " + playerNumber + " Players. Let's Go!");
					return playerNumber;
				} else {
					System.out.println("Please enter the right player numbers.");
				}

			}
		} catch (Exception e) {
			System.out.println("You entered the wrong number. Now the game will start with 2 defalut players");
			playerNumber = 2;
			return playerNumber;
		}
	}

	public String[] getPlayerName() {
		playerNumber = this.getPlayerNumber();
		String playerName[] = new String[playerNumber];
		for (int n = 0; n <= playerNumber; n++) {
			System.out.println("The number " + (n + 1) + " player please enter your name:");
			playerName[n] = scan.next();

		}
		return playerName;
	}

}

public class SkunkPlay {

	public static void main(String[] args) {
		PlayerSelection playerSele = new PlayerSelection();
		PlayerTerm playerTerm = new PlayerTerm();
		final int winnerScore = 100;
		int allPlayerNumber = 0;
		// Start the game, ask how many players to play this game
		System.out.println("-----------Welcome to the Game of Skunk-----------");
		System.out.println("How many players do you have?");
		allPlayerNumber = playerSele.getPlayerNumber();
		System.out.println("You have " + allPlayerNumber + " players.");
		// ask players' names
		System.out.println("Now enter your names.");
		String[] playerName = playerSele.getPlayerName(allPlayerNumber);
		int[] playerScore = playerSele.getPlayerScore(allPlayerNumber);
		int[] playerChip = playerSele.getPlayerChips(allPlayerNumber);
		int kittyBank = 0;
		// game ends until one player gets 100 or lose 50 chips
		boolean gameRun = true;
		while (gameRun) {
			for (int n = 0; n < allPlayerNumber; n++) {

				if (playerChip[n]> 47) {

					System.out.println("-----------------------------");
					System.out.println(playerName[n] + " please make your choice:");

					int[] playerCurrentTerm = playerTerm.playerTermRun(n + 1);
					playerScore[n] = playerScore[n] + playerCurrentTerm[0];
					System.out.println(playerName[n] + ", Your total score is " + playerScore[n]);
					playerChip[n] = playerChip[n] + playerCurrentTerm[1];
					System.out.println(playerName[n] + ", You have " + playerChip[n] + " chips.");
					kittyBank = kittyBank - playerCurrentTerm[1];
					System.out.println("Now in the bank there is " + kittyBank + " chips.");
					if (playerScore[n] >= winnerScore && playerChip[n] > 0) {
						System.out.println("Congratulations!" + playerName[n] + " You win the game!");
						System.out.println("You get " + kittyBank + " chips in the kittybank.");
						// break;
						System.exit(n);

					}
				}
				 if(playerChip[n]<=47){
				 System.out.println("YOu lose");
				 }
				 
			}

		}

	}
}




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
		playerTerm.printSkunkRule();

		while (gameRun) {
			for (int n = 0; n < allPlayerNumber; n++) {

				if (playerChip[n] > 0) {

					System.out.println("\n------------------------------- New term ----------------------------------");
					System.out.println(playerName[n] + " please make your choice:");

					int[] playerCurrentTerm = playerTerm.playerTermRun(n + 1);
					if (playerCurrentTerm[1] == -4) {
						playerScore[n] = 0;

					} else {
						playerScore[n] = playerScore[n] + playerCurrentTerm[0];
					}

					playerChip[n] = playerChip[n] + playerCurrentTerm[1];

					System.out.println(playerName[n] + ", Your total score is " + playerScore[n]);

					System.out.println(playerName[n] + ", You have " + playerChip[n] + " chips.");
					kittyBank = kittyBank - playerCurrentTerm[1];
					System.out.println("Now in the bank there is " + kittyBank + " chips.");
					if (playerChip[n] <= 0) {
						System.out.println("Sorry, player " + playerName[n] + " you lose all your chips.");
						System.out.println("You lose");
						System.out.println("--------------------");
					}
					int numWinner = 0;
					if (playerScore[n] >= winnerScore && playerChip[n] > 0) {
						for (int lastRun = n + 1; lastRun < allPlayerNumber; lastRun++) {
							if (playerChip[lastRun] > 0) {

								System.out.println("------Last term----------------");
								System.out.println(playerName[lastRun] + " please make your choice:");
								playerCurrentTerm = playerTerm.playerTermRun(lastRun);
								playerScore[lastRun] = playerScore[lastRun] + playerCurrentTerm[0];
								System.out
										.println(playerName[lastRun] + ", Your total score is " + playerScore[lastRun]);
								playerChip[lastRun] = playerChip[lastRun] + playerCurrentTerm[1];
								System.out
										.println(playerName[lastRun] + ", You have " + playerChip[lastRun] + " chips.");
								kittyBank = kittyBank - playerCurrentTerm[1];
								System.out.println("Now in the bank there is " + kittyBank + " chips.");
								if (playerChip[lastRun] <= 0) {
									System.out.println(
											"Sorry, player " + playerName[lastRun] + " you lose all your chips.");
									System.out.println("You lose");
									System.out.println("--------------------");
								}
							}
						}
						for (int finalWinner = 0; finalWinner < allPlayerNumber; finalWinner++) {
							if (playerScore[finalWinner] >= 100) {
								System.out.println("Congratulations!" + playerName[finalWinner] + " You win the game!");
								numWinner = numWinner + 1;
							}
						}
						int winnerGetChip = 0;
						winnerGetChip = kittyBank / numWinner;
						System.out.println("Winner get " + winnerGetChip + " chips in the kittybank.");

						for (int r = 0; r < allPlayerNumber; r++) {
							if (playerScore[r] >= 100) {
								System.out.println("Winner get " + winnerGetChip + " chips in the kittybank.");
								System.out.println("-----Winner---------");
								playerChip[r] = playerChip[r] + winnerGetChip;
								System.out
										.println("Player " + playerName[r] + " ,your final score is " + playerScore[r]);
								System.out
										.println("Player " + playerName[r] + " ,you have " + playerChip[r] + " chips.");
								System.out.println("---------------------");

							} else {
								System.out.println("-----not Winner---------");
								System.out
										.println("Player " + playerName[r] + " ,your final score is " + playerScore[r]);
								System.out
										.println("Player " + playerName[r] + " ,you have " + playerChip[r] + " chips.");
								System.out.println("---------------------");
							}
						}
						// break;
						System.exit(n);

					}
				}

			}

		}

	}
}

import java.util.Scanner;

public class SkunkPlay {

	public static void main(String[] args) {
		PlayerSelection playerSele = new PlayerSelection();
		PlayerTerm playerTerm = new PlayerTerm();

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

				System.out.println(playerName[n] + " please make your choice:");

				int[] playerCurrentTerm = playerTerm.playerTermRun(n + 1);
				playerScore[n] = playerScore[n] + playerCurrentTerm[0];
				System.out.println(playerName[n] + ", Your total score is " + playerScore[n]);

				System.out.println(playerName[n] + ", You have " + (playerChip[n] + playerCurrentTerm[1]) + " chips.");
				kittyBank = kittyBank - playerCurrentTerm[1];
				System.out.println("Now in the bank there is " + kittyBank + " chips.");
				if (playerScore[n] >= 100) {
					System.out.println("Congratulations!" + playerName[n] + " You win the game!");
					System.out.println("You get " + kittyBank + " chips.");
					gameRun = false;
					
				}

			}
		}

	}

}

// String option = "";
// boolean systemRun = true;
// boolean termRun=true;
// int playerNumber = numberOfPlayers(scan);
// // System.out.println(playerNumber);
// int[] playerScore = new int[playerNumber];
// int termScore=0;
// PairOfDice pairOfDice = new PairOfDice();
// for (int n = 0; n < playerNumber; n++)
// {
// System.out.println("You are the No." + (n + 1) + " player. Here are your
// options");
// systemRun = true;
// while (systemRun)
// {
// // Ask players if they want to roll the dice or end this term
// System.out.println("1. Roll the dice.");
// System.out.println("2. End this term.");
// option = scan.next();
//
// // If player chooses to roll the dice, it shows the result of 2 dices and
// // the total number
// if (option.equals("1"))
// {
// pairOfDice.roll();
// diceResult1 = pairOfDice.getDice1();
// diceResult2 = pairOfDice.getDice2();
// System.out.println("Your dice-1 result is " + diceResult1 +
// " and your dice-2 result is " + diceResult2);
// while(termRun){
// if(diceResult1==1||diceResult2==1){
// termRun = false;
// termScore=0;
// System.out.println("Player "+(n+1)+" end your term. Next Player.");
// }
// if(diceResult1!=1||diceResult2!=1){
// termScore=pairOfDice.getTotal()+termScore;
// System.out.println("1. Roll the dice.");
// System.out.println("2. End this term.");
// option = scan.next();
// if(option.equals("1")){
// pairOfDice.roll();
// diceResult1 = pairOfDice.getDice1();
// diceResult2 = pairOfDice.getDice2();
// System.out.println("Your dice-1 result is " + diceResult1 +
// " and your dice-2 result is " + diceResult2);
// if(diceResult1 !=1||diceResult2!=1){
// termScore=pairOfDice.getTotal()+termScore;
// System.out.println("This term your total score is "+ termScore);
// }else {
// termScore=0;
// termRun=false;
// System.out.println("Player "+(n+1)+" end your term. Your total score is:" +
// playerScore[n]+"Next Player, Player "+(n+2));
// }
//
//
// }
// if(option.equals("2")){
// playerScore[n]=playerScore[n]+termScore;
// termRun=false;
// System.out.println("Player "+(n+1)+" end your term. Your total score is:" +
// playerScore[n]+"Next Player, Player"+(n+2));
// }
// }
//
//
// }
//
//
//
//
//
// System.out.println("Your total number is " + pairOfDice.getTotal());
//
// }
//
// // If player chooses to end this term, go to the next player
// if (option.equals("2"))
// {
// systemRun = false;
// System.out.println("Next player");
// }
//// else
//// {
//// System.out.println("Invalid input, please enter again");
//// }
// }
// }
//
// }
//
// public static int numberOfPlayers(Scanner scan)
// {
// int players = 0;
// try
// {
// while (true)
// {
// players = scan.nextInt();
// if (players > 1)
// {
// System.out.println("Great! You have " + players + " Players. Let's Go!");
// return players;
// }
// else
// {
// System.out.println("Please enter the right player numbers.");
// }
//
// }
// }
// catch (Exception e)
// {
// System.out.println("You entered the wrong number. Now the game will start
// with 2 defalut players");
// players = 2;
// return players;
// }

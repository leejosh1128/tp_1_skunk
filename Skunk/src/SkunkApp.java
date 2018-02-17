import java.util.Scanner;

public class SkunkApp
{
	public static int diceResult1 = 0;
	public static int diceResult2 = 0;

	public static void main(String[] args)
	{
		// Start the game, ask how many players to play this game
		// Ask player input a number
		System.out.println("-----------Welcome to the Game of Skunk-----------");
		System.out.println("How many players do you have? \nYou have");
		
		Scanner scan = new Scanner(System.in);
		String option = "";
		boolean systemRun = true;
		int playerNumber = numberOfPlayers(scan);
		
		int[] playerScore = new int[playerNumber];

		PairOfDice pairOfDice = new PairOfDice();
		for (int n = 0; n < playerNumber; n++)
		{
			System.out.println("\n-----------------------------------------------"
					+ "\nYou are the No." + (n + 1) + " player. Here are your options");
			systemRun = true;
			while (systemRun)
			{
				// Ask players if they want to roll the dice or end this term
				System.out.println("1. Roll the dice.");
				System.out.println("2. End this term.");
				option = scan.next();
				
				// If player chooses to roll the dice, it shows the result of 2 dices and 
				// the total number
				if (option.equals("1"))
				{
					pairOfDice.roll();
					diceResult1 = pairOfDice.getDice1();
					diceResult2 = pairOfDice.getDice2();
					System.out.println("Your dice-1 result is " + diceResult1 +
							" and your dice-2 result is " + diceResult2);
					System.out.println("Your total number is " + pairOfDice.getTotal());
					if (pairOfDice.getTotal() != 0)
					{
						systemRun = true;
						System.out.println("-----------------------------------------------"
								+ "\nDo you want to roll the dice again or end this term?");
					}
					else
					{
						systemRun = false;
						System.out.println("Sorry, your term is over!");
					}	
				}
				
				// If player chooses to end this term, go to the next player
				if (option.equals("2"))
				{
					systemRun = false;
					System.out.println("Next player");
				}
//				else
//				{
//					System.out.println("Invalid input, please enter again");
//				}
			}
		}

	}

	public static int numberOfPlayers(Scanner scan)
	{
		int players = 0;
		try
		{
			while (true)
			{
				players = scan.nextInt();
				if (players > 1)
				{
					System.out.println("Great! You have " + players + " Players. Let's Go!"
							+ "");
					return players;
				}
				else
				{
					System.out.println("Please enter the right player numbers.");
				}
				;
			}
		}
		catch (Exception e)
		{
			System.out.println("You entered the wrong number. Now the game will start with 2 defalut players");
			players = 2;
			return players;
		}

	}

}

import java.util.Scanner;
//
public class RollOrDone  {
	
private boolean gameRun=true;
PairOfDice pairOfDice=new PairOfDice();	
private static int diceResult1 = 0;
private static int diceResult2 = 0;
private boolean termRun=true;
private int termScore=0;
GameScore gameS=new GameScore();
int[]playerGameScore=gameS.playerScore();
public void roll(int playerNumber){
	
//	while(gameRun){
//		// Ask players if they want to roll the dice or end this term
//		System.out.println("1. Roll the dice.");
//		System.out.println("2. End this term.");
//		Scanner scan=new Scanner(System.in);
//		String option="";
//		option = scan.next();
		
		// If player chooses to roll the dice, it shows the result of 2 dices and 
		// the total number
//		if (option.equals("1"))
//		{
			pairOfDice.roll();
			diceResult1 = pairOfDice.getDice1();
			diceResult2 = pairOfDice.getDice2();
			System.out.println("Your dice-1 result is " + diceResult1 +
					" and your dice-2 result is " + diceResult2);
			if(diceResult1==1||diceResult2==1){
				termRun = false;
				termScore=0;
				System.out.println("Player "+(playerNumber+1)+" end your term. Next Player.");
			}
			if()
			
			
			
			
			
			
			
			
			
			
			while(termRun){
				if(diceResult1==1||diceResult2==1){
					termRun = false;
					termScore=0;
					System.out.println("Player "+(playerNumber+1)+" end your term. Next Player.");
				}
				if(diceResult1!=1||diceResult2!=1){
					termScore=pairOfDice.getTotal()+termScore;
					System.out.println("1. Roll the dice.");
					System.out.println("2. End this term.");
					option = scan.next();
					if(option.equals("1")){
						pairOfDice.roll();
						diceResult1 = pairOfDice.getDice1();
						diceResult2 = pairOfDice.getDice2();
						System.out.println("Your dice-1 result is " + diceResult1 +
								" and your dice-2 result is " + diceResult2);
						if(diceResult1 !=1||diceResult2!=1){
							termScore=pairOfDice.getTotal()+termScore;
							System.out.println("This term your total score is "+ termScore);
						}else {
							termScore=0;
							termRun=false;
							System.out.println("Player "+(n+1)+" end your term. Your total score is:" + playerScore[n]+"Next Player, Player "+(n+2));
						}
						
						
//					}
					if(option.equals("2")){
						playerGameScore[n]=playerGameScore[n]+termScore;
						termRun=false;
						System.out.println("Player "+(n+1)+" end your term. Your total score is:" + playerScore[n]+"Next Player, Player"+(n+2));
					}
				}
				
				
			}
			
			
			
			
			
			System.out.println("Your total number is " + pairOfDice.getTotal());

		}
		
		// If player chooses to end this term, go to the next player
		if (option.equals("2"))
		{
			termRun = false;
			System.out.println("Next player");
		}
	}

	
}

}

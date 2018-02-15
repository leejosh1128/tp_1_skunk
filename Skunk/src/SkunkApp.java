import java.util.Scanner;

public class SkunkApp {

	public static void main(String[] args){
		System.out.println("-----------Welcome to the Game of Skunk-----------");
		System.out.println("How many players do you have?");
		System.out.println("You have");
		Scanner scan =new Scanner(System.in);
		
		int number=numberOfPlayers(scan);
		System.out.println(number);
		int[][] playerScore = new int[number][1];
		for(int n=0;n<number;n++){
			
		}
	
	}
	public static int numberOfPlayers(Scanner scan){
		int players=0;
		try{
			while(true){
			players=scan.nextInt();
			if(players >1){
				System.out.println("You have "+players+ " Players.");
				return players;
			}else {
				System.out.println("Please enter the right player numbers.");
			};
			}
		}catch (Exception e){
			System.out.println("You entered the wrong number. Now the game will start with 2 defalut players");
			players=2;
			return players;
		}
		
	}
	public int roll(){
		int diceResult=0;
		diceResult= (int)(6.0*Math.random())+1;
		
		
		return diceResult;
		
	}
	
}

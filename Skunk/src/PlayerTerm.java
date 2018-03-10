import java.util.Scanner;

public class PlayerTerm {
int termScore;
boolean termRun=true;
RollOrDone rollOrDone=new RollOrDone();
public String playerOption(){
	// Ask players if they want to roll the dice or end this term
	System.out.println("1. Roll the dice.");
	System.out.println("2. End this term.");
	Scanner scan=new Scanner(System.in);
	String option="";
	option = scan.next();
	return option;
}
public void playerTermRun(){
	while(termRun){
		
		if(this.playerOption()=="1"){
			rollOrDone.roll(playerNumber);
		}if(this.playerOption()=="2"){
			
		}
		
	}
	
}


}

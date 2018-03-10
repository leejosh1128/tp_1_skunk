
public class GameScore {
final int winnerScore=100;
PlayerSelection playerSele=new PlayerSelection();
int playerNum=playerSele.getPlayerNumber();
public int[] playerScore(){
	int[] playerScore= new int[playerNum];
	return playerScore;
}
public int getPlayerScore(int playerNumber){
	
	
	return playerScore()[playerNumber-1];
}
public int getChips(){
	int chips=0;
	return chips;
}
}

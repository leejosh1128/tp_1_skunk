import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerSelectionTest {

	@Test
	public void testGetPlayerNumber() {
		PlayerSelection playerSele=new PlayerSelection();
		int allPlayerNumber = 0;
		allPlayerNumber=playerSele.getPlayerNumber();
		
		assertTrue("it's an integer", allPlayerNumber>=2);
	}

	@Test
	public void testGetPlayerName() {
//		String x = "123";
//		Integer y = ((int) x.toString();
		
		PlayerSelection playerSele=new PlayerSelection();
		playerSele.getPlayerNumber();
		assertTrue("it's an integer", playerSele.getPlayerNumber()>=2);
		
	}

	@Test
	public void testGetPlayerChips() {
		PlayerSelection playerSele=new PlayerSelection();
		int playerNumber=3;
		int[] playerChips = new int[playerNumber];
		playerChips=playerSele.getPlayerChips(playerNumber);
		assertEquals("Your player 2 has 50 chips",50,playerChips[1]);
	}

	@Test
	public void testGetPlayerScore() {
		PlayerSelection playerSele=new PlayerSelection();
		int playerNumber=3;
		int[]playerScore=playerSele.getPlayerScore(playerNumber);
		assertEquals("You have 3 score",3,playerScore.length);
		assertEquals("Your player 1's score is 0. ",0,playerScore[0]);
	}

}

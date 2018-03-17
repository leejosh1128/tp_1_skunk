import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerSelectionTest {

	@Test
	public void testGetPlayerNumber() {
		PlayerSelection playerSele=new PlayerSelection();
		int allPlayerNumber = 0;
		
		allPlayerNumber=playerSele.getPlayerNumber();
		
		
	}

	@Test
	public void testGetPlayerName() {
		
		PlayerSelection playerSele = new PlayerSelection();
		playerSele.getPlayerNumber();
		assertTrue("", playerSele.getPlayerNumber()>=2);
		
	}

	@Test
	public void testGetPlayerChips() {
		PlayerSelection playerSele=new PlayerSelection();
		int playerNumber=3;
		int[] playerChips = new int[playerNumber];
		playerChips=playerSele.getPlayerChips(playerNumber);
		assertEquals("The default chips number should be 50", 50, playerChips[1]);
	}

	@Test
	public void testGetPlayerScore() {
		PlayerSelection playerSele = new PlayerSelection();
		int playerNumber = 3;
		int[]playerScore = playerSele.getPlayerScore(playerNumber);
		assertEquals("The score should be 3", 3, playerScore.length);
		assertEquals("The default score should be 0.",0,playerScore[0]);
	}

}

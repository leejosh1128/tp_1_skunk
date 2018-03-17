import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTermTest {

	@Test
	public void testPrintSkunkRule() {
		String rule1 = "";
		String rule2 = "";
		String rule3 = "";
		rule1 = "A skunk in any series voids the score for that series only and draws a penalty of 1 chip placed in the 'kitty' and loss of dice.";
		rule2 = "A skunk and a deuce voids the score for that series only and draws a penalty of 2 chips placed in the 'kitty,' and loss of dice.";
		rule3="TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the 'kitty,' and loss of dice. Player must again start to score from scratch.";
		PlayerTerm termTest = new PlayerTerm();
		
	}

	@Test
	public void testPlayerTermRun() {
		PlayerTerm termTest=new PlayerTerm();
		termTest.option=2;
		int[] result=termTest.playerTermResult;
		assertEquals("The result should be 0", 0,result[0]);
		assertEquals("The result shoud be 0", 0,result[1]);
		
	}

}

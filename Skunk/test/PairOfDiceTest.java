import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class PairOfDiceTest {
	PairOfDice pairOfDice = new PairOfDice();

	@Test
	public void testRoll() {
		pairOfDice.roll();
		int diceResult1 = pairOfDice.getDice1();
		assertFalse("The diceResult1 cannot over 6", diceResult1 > 6);
		assertFalse("The diceResult1 cannot less than 1", diceResult1 < 1);
		assertFalse("The diceResult1 cannot be a negtive number", diceResult1 < 0);
	}

	@Test
	public void testGetDice1() {
		pairOfDice.roll();
		int diceResult1 = pairOfDice.getDice1();
		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
		assertTrue("The diceResult1 should be one of number in arr", Arrays.asList(arr).contains(diceResult1));
	}

	@Test
	public void testGetDice2() {
		pairOfDice.roll();
		int diceResult2 = pairOfDice.getDice2();
		Integer[] arr = { 1, 2, 3, 4, 5, 6 };
		assertTrue("The diceResult2 should be one of number in arr", Arrays.asList(arr).contains(diceResult2));
	}

	@Test
	public void testGetTotal() {
		pairOfDice.roll();
		int diceResult1 = pairOfDice.getDice1();
		int diceResult2 = pairOfDice.getDice2();
		int total = pairOfDice.getTotal();
		if (diceResult1 == 1 || diceResult2 == 1) {
			assertEquals("The total number should be 0", 0, total);
		} else
			assertEquals("The total number should equals diceResult1 + diceResult2", diceResult1 + diceResult2, total);
	}

	@Test
	public void testrollOrDie() {
		pairOfDice.roll();
		int[] rollOrDie = pairOfDice.rollOrDie(2);
		int diceResult1 = pairOfDice.getDice1();
		int diceResult2 = pairOfDice.getDice2();
		int total = pairOfDice.getTotal();
		if (diceResult1 == 1 && diceResult2 == 1) {
			assertEquals("The total number should be 0", 0, rollOrDie[0]);
			assertEquals("The chips number should be -4", -4, rollOrDie[1]);
		}
		if (diceResult1 != 1 && diceResult2 != 1) {
			assertEquals("The total number should be 0", total, rollOrDie[0]);
			assertEquals("The chips number should be 0", 0, rollOrDie[1]);
		}
		if ((diceResult1 == 1 && diceResult2 != 1 && diceResult2 != 2)
				|| (diceResult1 != 1 && diceResult2 == 1 && diceResult1 != 2)) {
			assertEquals("The total number should be 0", 0, rollOrDie[0]);
			assertEquals("The chips number should be -1", -1, rollOrDie[1]);
		}
		if ((diceResult1 == 1 && diceResult2 == 2) || (diceResult2 == 1 && diceResult1 == 2)) {
			assertEquals("The total number should be 0", 0, rollOrDie[0]);
			assertEquals("The chips number should be -2", -2, rollOrDie[1]);
		}
	}

}

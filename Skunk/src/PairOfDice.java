
public class PairOfDice {
	private int diceResult1 = 0;
	private int diceResult2 = 0;

	public PairOfDice() {
		roll();
	}

	public void roll() {

		diceResult1 = (int) (6.0 * Math.random()) + 1;
		diceResult2 = (int) (6.0 * Math.random()) + 1;

	}

	public int getDice1() {
		return diceResult1;
	}

	public int getDice2() {
		return diceResult2;
	}

	public int getTotal() {
		if (diceResult1 == 1 || diceResult2 == 1) {
			return 0;
		} else
			return diceResult1 + diceResult2;
	}
}

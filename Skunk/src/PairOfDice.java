
public class PairOfDice {
	private int diceResult1 = 0;
	private int diceResult2 = 0;

	public PairOfDice() {
		roll();
	}

	public String toString(int msg) // Overloading... but NOT overriding!
	{
		return msg + this.toString();
	}
	////////////
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

	public int[] rollOrDie(int playerNumber) {
		this.roll();
		int[] rollOrDie = new int[2];
		System.out.println("Your dice-1 result is " + diceResult1 + " and your dice-2 result is " + diceResult2);
		if (diceResult1 == 1 || diceResult2 == 1) {
			rollOrDie[0] = 0;
			if ((diceResult1 == 1 && diceResult2 == 2) || (diceResult1 == 2 && diceResult2 == 1)) {

				rollOrDie[1] = -2;
				System.out.println("You got a Skunk and a Deuce.");
			}
			if (diceResult1 == 1 && diceResult2 == 1) {
				// rollOrDie[0] = 0;
				rollOrDie[1] = -4;
				System.out.println("Whoops, you got 2 Skunks!");
			}
			if ((diceResult1 == 1 && diceResult2 != 2 && diceResult2 != 1)
					|| (diceResult1 != 2 && diceResult2 == 1 && diceResult1 != 1)) {
				rollOrDie[1] = -1;
				System.out.println("You got a Skunk");
			}

		} else {
			rollOrDie[0] = this.getTotal();
		}
		return rollOrDie;

	}

	public int getTotal() {
		if (diceResult1 == 1 || diceResult2 == 1) {
			return 0;
		} else
			return diceResult1 + diceResult2;
	}
}

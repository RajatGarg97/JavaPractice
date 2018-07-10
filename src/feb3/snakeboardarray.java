package feb3;

public class snakeboardarray {

	public static void main(String[] args) {

		int[] snkbrd = { 0, 0, 19, 0, 0, 13, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 3, 0, 0, 0 };

		int[] dice = { 2, 6, 3, 4, 3, 2, 5, 2, 6, 1, 4, 3 };

		int i = 0;

		int pos = 0;

		while ((i < dice.length) && ((dice[i] != 1) || (dice[i] != 6))) {
			// loop to begin the game with 6 or 1
			if ((dice[i] == 1) || (dice[i] == 6)) {
				pos = 1;
				break;
			}
			i++;
		}
		// i = i - 1;

		System.out.println("!! Goti Khul Gyi !!");

		while ((i < dice.length) && (pos < snkbrd.length)) {

			if (pos + dice[i] < snkbrd.length) {

				pos = pos + dice[i];

			}

			if ((snkbrd[pos] < pos) && (snkbrd[pos] != 0)) {

				System.out.println("Saanp kaat gya");
				pos = snkbrd[pos];
			} else if (snkbrd[pos] > pos) {
				System.out.println("Bhut upar ja rhe ho");
				pos = snkbrd[pos];
			}

			i++;
		}
		if (pos == (snkbrd.length - 1)) {

			System.out.println("!! Jeet gye Sirji !!");

		}

		else {
			System.out.println(pos);
		}

		return;
	}

}

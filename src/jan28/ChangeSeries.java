package jan28;

import java.util.Scanner;

public class ChangeSeries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int prev = scn.nextInt();
		boolean goingdownhill = true;
		for (int i = 2; i <= n; i++) {

			int curr = scn.nextInt();
			if (goingdownhill) {
				if (curr < prev) {

				} else {
					goingdownhill = false;
				}
			} else {
				if (curr > prev) {

				} else {
					System.out.println("Invalid");
					return;
				}

			}

			prev = curr;

		}
		System.out.println("Valid");
	}

}

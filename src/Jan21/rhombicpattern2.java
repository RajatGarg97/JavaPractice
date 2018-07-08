package Jan21;

import java.util.Scanner;

public class rhombicpattern2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = (n / 2) + 1;
		int k = 1;

		while (row >= 1) {
			int i = 1;
			int j = 1;
			while (i <= row) {
				System.out.print("* ");
				i++;
			}

			while (j <= k) {

				System.out.print("  ");
				j++;
			}
			k += 2;
			i = i - 1;
			while (i >= 1) {
				System.out.print("* ");
				i--;
			}
			System.out.println();
			row--;
		}
		row = 2;
		while (row <= (n / 2) + 1) {
			int i = 1;
			int j = 1;
			while (i <= row) {
				System.out.print("* ");
				i++;
			}

			while (k - j > 3) {

				System.out.print("  ");
				j++;
			}
			k -= 2;
			i = i - 1;
			while (i >= 1) {
				System.out.print("* ");
				i--;
			}
			System.out.println();
			row++;
		}
	}
}

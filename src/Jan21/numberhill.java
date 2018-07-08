package Jan21;
import java.util.Scanner;

public class numberhill {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int num = 1;
		int sp = 1;
		while (row <= n) {
			num = 1;
			sp = 1;
			while (num <= row) {

				System.out.print(num + " ");

				num++;
			}

			while ((n - row)*2 > sp ) {
				System.out.print("  ");
				sp++;
			}
			num = row;
			if (row == n) {
				num = row - 1;
			}
			while (num >= 1) {
				System.out.print(num + " ");

				num--;
			}
			System.out.println();
			row++;
		}
	}

}

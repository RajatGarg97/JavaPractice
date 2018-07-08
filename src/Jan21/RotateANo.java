package Jan21;

import java.util.Scanner;

public class RotateANo {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int n = scn.nextInt();
		int r = scn.nextInt();
		int x = n;
		int i = 0;
		while (n != 0) {
			// count the number of digits
			n = n / 10;
			i++;
		}

		r = r % i;
		if (r < 0) {
			r += i;

		}

		/*
		 * while (r != 0) {
		 * 
		 * int y = x % 10; x = x - (x % 10); x = x / 10; int pow = (int) Math.pow(10, (i
		 * - 1)); x += pow * y; r--; }
		 */
		int pow2 = (int) Math.pow(10, r);
		int z = x % pow2;
		x = x / pow2;
		int pow1 = (int) Math.pow(10, (i - r));
		x += z * pow1;
		System.out.println(x);
		return;
	}

}

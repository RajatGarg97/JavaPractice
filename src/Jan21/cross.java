package Jan21;

import java.util.Scanner;

public class cross {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 1;
		int i = 1;
		int j = n - 2;
			while(row <= n) {
				int col = 1;
				int sp1 = 1;
				int sp2 = 1;
				int sp = row;
				if(row <= (n/2) + 1) {
					while(col < row) {
					System.out.print(" ");
					col++;
					}
				}
				
				else {
					
					while(n - sp > 0) {
						System.out.print(" ");
						sp++;
					}
				}
				System.out.print("*");
				if(row != (n/2) + 1) {
				if(row < (n/2)+1) {
					while(sp1 <= j) {
						System.out.print(" ");
						sp1++;
					}
					j = j - 2;
				}
				
				else if(row > (n/2)+1) {
					while(sp2 <= i) {
						System.out.print(" ");
						sp2++;
					}
					i+=2;
				}
				System.out.print("*");
				}
				System.out.println();
			row++;
		}
	}

}

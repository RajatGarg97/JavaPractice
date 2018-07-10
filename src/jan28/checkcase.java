package jan28;

import java.util.Scanner;

public class checkcase {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a char");
		char ch = scn.next().charAt(0);
		
		if((ch >= 'a') && (ch <= 'z')) {
			System.out.println("Lower");
		}
		else if((ch >= 'A') && (ch <= 'Z')) {
			System.out.println("Upper");
		}
	else {
		System.out.println("Invalid");
	}

}
}
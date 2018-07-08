package Jan21;

import java.util.Scanner;

public class FindInverse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scn.nextInt();

		int temp = n;
		int nod = 0;

		
		 while (temp != 0) {
		  
		 temp = temp/10 ;
		 nod++ ;
		 
		 }
		 
		int temp1 = n;
		int i = 0;
		int sum = 0;
		while (temp1 != 0) {

			int pow = (int) Math.pow(10, (nod - (temp1 % 10)));
			sum = sum + ((nod - i) * pow);
			temp1 = temp1 / 10;
			i++;
		}
		System.out.println(sum);
		return;
	}

}

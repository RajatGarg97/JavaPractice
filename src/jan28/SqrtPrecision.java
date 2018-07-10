package jan28;

import java.util.Scanner;

public class SqrtPrecision {

	public static void main(String[] args) {

	//	Scanner scn = new Scanner(System.in);
	//	int n = scn.nextInt();
		int n = 46 ;
		double i = 1;
		while(i*i <= n) {
			i++;
		}
		if(i*i == n) {
			System.out.println(i);
			return;
		}
		i--;
		while(i*i < n) {
			i = i + 0.1;
		}
		
		if(i*i == n) {
			System.out.println(i);
			return;
		}
		i = i - 0.1;
		while(i*i < n) {
			i = i + 0.01;
		}
		i = i - 0.01;
		while(i*i < n) {
			i = i + 0.001;
		}
		i = i - 0.001;
		System.out.println(i);
	}

}

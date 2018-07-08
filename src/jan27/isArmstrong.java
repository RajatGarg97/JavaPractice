package jan27;

public class isArmstrong {

	public static void main(String[] args) {

		int n = 9;
		int num = n;
		int test = n;
		int count = 0; 
		int sum = 0 ;
		while(n != 0) {
			n = n/10;
			count++;
		}
		
		while(num != 0) {
			int pow = (int)Math.pow(num%10, count);
			sum = sum + pow;
			num = num/10;
		}
		if(sum == test) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}

}

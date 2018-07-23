package feb10;

public class octaladd {

	public static void main(String[] args) {

		int a = 335;
		int b = 572;
		addOctal(a, b);

	}

	private static void addOctal(int a, int b) {

		int carry = 0;
		int sum = 0;
		int pow = 1;

		while ((a != 0) || (b != 0) || (carry != 0)) {
			int tempsum = 0;
			int i = a % 10;
			int j = b % 10;

			tempsum = (i + j + carry) % 8;
			carry = (i + j + carry) / 8;

			tempsum *= pow;

			sum += tempsum;

			a = a / 10;
			b = b / 10;
			pow = pow * 10;
		}

		System.out.println(sum);
	}

}

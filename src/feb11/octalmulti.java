package feb11;

public class octalmulti {

	public static void main(String[] args) {

		int a = 64;
		int b = 23;

		octalmulti(a, b);
	}

	private static void octalmulti(int a, int b) {

		int tempmulti = 0;
		int carry = 0;
		int num = 0;
		int place = 1;
		while ((a != 0) || (carry != 0)) {

			int digita = a % 10;
			 int digitb = b % 10;

			carry = ((digita * digitb) + carry) / 8;
			tempmulti = ((digita * digitb) + carry) % 8;
			tempmulti = tempmulti * place;
			num = num + tempmulti;
			place = place * 10;
			a = a / 10;
		}
		System.out.println(num);
	}

}
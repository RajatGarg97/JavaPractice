package feb11;

public class octalsub {

	public static void main(String[] args) {

		int a = 1000;
		int b = 1;
		int borrow = 0;
		int tempdiff = 0;
		int place = 1;
		int num = 0;
		while (a != 0) {

			int digita = a % 10;
			int digitb = b % 10;

			if (borrow == 1) {
				digita--;
				borrow = 0;
			}
			if ((digita - digitb) < 0) {
				borrow = 1;
				digita += 10;
				tempdiff = digita - digitb - 2;

			}

			else {
				tempdiff = digita - digitb;
			}

			tempdiff = tempdiff * place;
			place = place * 10;
			num = num + tempdiff;

			a = a / 10;
			b = b / 10;

		}
		System.out.println(num);
	}

}

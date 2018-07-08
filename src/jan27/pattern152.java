package jan27;

public class pattern152 {

	public static void main(String[] args) {

		int n = 7;
		int nst = 1;
		int nsp = n / 2;

		int row = 1;
		while (row <= n) {

			for (int i = 0; i < nsp; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < nst; i++) {
				System.out.print("*");
			}
			if (row <= n / 2) {
				nsp--;
				nst += 2;
			} else {
				nsp++;
				nst -= 2;
			}
			row++;
			System.out.println();
		}
	}
}

package jan27;

public class pattern159 {

	public static void main(String[] args) {

		int n = 7;
		int nst = 1;
		int nsp = n / 2;
		int val = 0;
		int row = 1;
		while (row <= n) {
			if(row <= n/2) {
			val = row;
			}
			else {
				val = n + 1 - row;
			}
			for (int i = 0; i < nsp; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < nst; i++) {
				System.out.print(val);
				if(i < nst/2) {
					val++;
				}
				else {
					val--;
				}
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

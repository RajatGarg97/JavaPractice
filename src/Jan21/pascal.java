package Jan21;

public class pascal {

	public static void main(String[] args) {

		int n = 6;
		int row = 2;
		int col = 1;
		int s1 = 1;
		int s2 = 0;
		System.out.println(s1);

		if (row > 1) {
			while (row <= n) {
				col = 1;
				s1 = 1;
				System.out.print(s1 + "\t");
				while (col <= row) {
					s2 = s1 * (row - (col - 1));
					s2 = s2 / col;
					System.out.print(s2 + "\t");
					s1 = s2;
					col++;
				}
				System.out.println();
				row++;
			}
		}
	}

}

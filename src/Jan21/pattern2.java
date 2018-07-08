package Jan21;

public class pattern2 {

	public static void main(String[] args) {

		int n = 4;
		int row = 2;
		int p = 0;
		int col = 1;
		int s1 = 0;
		int s2 = 1;
		System.out.println(s1);
		System.out.print(s2 + " ");

		while (row <= n) {
			col = 1;
			if (row == 2) {
				col = 2;
			}
			while (col <= row) {
				int temp = s2;
				s2 = s1 + s2;
				s1 = temp;
				System.out.print(s2 + " ");
				col++;
			}
			row++;
			System.out.println();
		}

	}

}

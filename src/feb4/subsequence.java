package feb4;

public class subsequence {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30 };

		for (int i = 0; i < (1 << arr.length); i++) {

			for (byte b = (byte) (arr.length - 1); b >= 0; b--) {
				byte bm = (byte) (1 << b);

				if ((bm & (byte) i) == bm) {
					System.out.print(arr[b] + " ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}
}

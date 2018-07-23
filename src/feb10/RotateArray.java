package feb10;

public class RotateArray {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 50, 45, 33, 21 };
		int i = 34;

		display(arr);
		rotate(arr, i);
		display(arr);
	}

	private static void rotate(int[] arr, int r) {

		if (r > arr.length) {
			r = r % arr.length;
		}
		if ((r + arr.length) < arr.length) {
			r += arr.length;
		}
		int j = 1;
		while (r >= j) {

			int temp1 = arr[(arr.length - 1)];
			for (int i = (arr.length - 2); i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp1 ;
			j++;
		}

	}

	private static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

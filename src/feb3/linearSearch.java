package feb3;

public class linearSearch {

	public static void main(String[] args) {

		int[] arr = { 12, 97, 34, 85, 56, 67 };
		int num = 34;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				break;
			}
		}
		if (i < arr.length) {
			System.out.println(i);
		} else {
			System.out.println("-1");
		}
	}

}

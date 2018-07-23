package feb11;

public class kadane {

	public static void main(String[] args) {

		int[] arr = { 5, -8, 2, 7, 12, 3, -25, 15, 7, 1 };

		int max_so_far = arr[0];
		int max_ending_here = arr[0];
		int start = 0;
		int end = 0;
		int ostart = 0 ;
		
		for (int i = 1; i < arr.length; i++) {

			max_ending_here += arr[i];

			if (max_ending_here < 0) {
				max_ending_here = 0;
				start = i + 1 ;
			}

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				end = i;
				ostart = start ;
			}

		}
		System.out.println(max_so_far);

		for (int i = ostart; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

package feb10;

public class RotateArrayalt {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 50, 45, 33, 21 };
		int i = 2;

		rotate(arr, i) ;
	}

	public static void rotate(int[] arr, int r) {

		if (r >= arr.length) {
			r = r % arr.length;
		}
		if ((r + arr.length) < arr.length) {
			r += arr.length;
		}
		int j = (arr.length - r - 1) ;
		display(arr) ;
		reverse(arr, 0, j) ;
		//display(arr) ;
		reverse(arr, j, (arr.length - 1)) ;
		//display(arr) ;
		reverse(arr, 0, (arr.length - 1)) ;
		display(arr) ;
		
	}

	public static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	private static void reverse(int[] arr, int start, int end) {
		int last=end;
		for(int i = start; i <= ((end - start)/2); i++) {
			
			int temp = arr[i] ;
			arr[i] = arr[last] ;
			arr[last] = temp ;
			last--;
		}
		System.out.println();
	}
	}




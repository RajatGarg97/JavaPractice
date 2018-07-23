package feb10;

public class reverseArray {

	public static void main(String[] args) {

		int [] arr = {10, 20, 50, 45, 33, 21} ;
		
		display(arr) ;
		reverse(arr) ;
		display(arr) ;
	}

	private static void display(int[] arr) {

		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverse(int[] arr) {

		for(int i = 0; i < (arr.length/2); i++) {
			
			int temp = arr[i] ;
			arr[i] = arr[(arr.length - 1 - i)] ;
			arr[(arr.length - 1 - i)] = temp ;
		}
		System.out.println();
	}

}

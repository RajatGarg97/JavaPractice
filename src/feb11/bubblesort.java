package feb11;

public class bubblesort {

	public static void main(String[] args) {

		int[] arr = { 55, 22, 10, 73, 95 };
		display(arr);
		//bubblesort(arr);
		//selection(arr);
		insertion(arr) ;
		display(arr);

	}

	private static void insertion(int[] arr) {

		int tourcounter = 1;

		while (tourcounter <= arr.length - 1) {

			for (int i = tourcounter; i > 0; i--) {
				
				if (arr[i - 1] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
				
				else {
					break;
				}
			}
			tourcounter++;
		}
		System.out.println();
	}

	private static void selection(int[] arr) {

		int tourcounter = 1;

		while (tourcounter <= arr.length - 1) {

			for (int i = tourcounter; i < arr.length; i++) {
				
				if (arr[tourcounter - 1] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[tourcounter - 1];
					arr[tourcounter - 1] = temp;
				}
			}
			tourcounter++;
		}
		System.out.println();
	}

	private static void bubblesort(int[] arr) {

		int tourcounter = 1;

		while (tourcounter <= arr.length - 1) {

			for (int i = 0; i < arr.length - tourcounter; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			tourcounter++;
		}
		System.out.println();
	}

	private static void display(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

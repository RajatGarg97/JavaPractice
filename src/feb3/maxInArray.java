package feb3;

public class maxInArray {

	public static void main(String[] args) {

		int []arr = {12, 97, 34, 85, 56, 67} ;
		int max = arr[0] ;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i] ;
			}
		}
		System.out.println(max);
	}

}

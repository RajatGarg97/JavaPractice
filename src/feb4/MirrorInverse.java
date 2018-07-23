package feb4;

public class MirrorInverse {

	public static void main(String[] args) {

		int [] arr = {4, 2, 1, 3, 0} ;
		int j = 0 ;
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr[arr[i]]) {
				j++ ;
			}
		}
		
		if(j == (arr.length)) {
			System.out.println("Mirror Inverse");
		}
		else {
			System.out.println("Not a Mirror Inverse");
		}
	}

}

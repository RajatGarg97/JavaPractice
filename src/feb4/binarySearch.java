package feb4;

public class binarySearch {

	public static void main(String[] args) {

		int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100} ;
		int num = 30 ;
		int lo = 0 ;
		int hi = arr.length - 1 ;
		
		
		
		while(lo <= hi) {
			
			int mid = (hi + lo)/2 ;
			
			if(num < arr[mid]) {
				hi = mid - 1 ;
			}
			else if(num > arr[mid]){
				lo = mid + 1 ;
			}
			else {
				System.out.println(mid);
				return ;
			}
		}
		System.out.println(-1);
	}

}

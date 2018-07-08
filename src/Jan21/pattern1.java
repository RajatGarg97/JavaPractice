package Jan21;

public class pattern1 {

	public static void main(String[] args) {

		int n = 4 ;
		int row = 1 ;
		int temp = 1 ;
		int temp1 = temp ;
		
		while(row <= n) {
			temp = 1 ;
			while(temp <= row) {
				
				System.out.print(temp1+" ");
				temp1++ ;
				temp++ ;
			}
			row++ ;
			System.out.println();
		}
	}

}

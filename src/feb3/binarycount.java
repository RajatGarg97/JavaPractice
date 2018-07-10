package feb3;

public class binarycount {

	public static void main(String[] args) {

		byte n1 = -128  ;
		byte n2 = 127;
		
		for(byte n = n1; n < n2; n++) 
		//while(n1 < n2)
		{
			for(byte b = 7; b >= 0; b--) {
				byte bm = (byte) (1 << b);
				
				if((n & bm) == 0) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
			System.out.println();
	//		n1++ ;
		}
		return;
		
		
	}

}

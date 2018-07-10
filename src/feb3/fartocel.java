package feb3;

public class fartocel {

	public static void main(String[] args) {

		int minf = 0;
		int maxf = 300;
		int stepf = 20 ;
		
		for(int i = minf; i <= maxf; i = i + stepf) {
			
			int cel = (5*(i - 32))/9 ;
			System.out.println(i + "\t" + cel);
			
		}
		return;
	}

}

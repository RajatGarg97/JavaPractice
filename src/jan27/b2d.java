package jan27;

public class b2d {

	public static void main(String[] args) {
		
		int sn = 111001;
		int sb = 2;
		int db = 10;
		int dn = 0;
		int i = 1;
		while(sn != 0) {
			int rem = sn%db ;
			sn = sn/db;
			//int pow = (int)Math.pow(sb, i);
			dn = dn + (rem*i);
			i = i*sb;
		}
		System.out.println(dn);
	}

}

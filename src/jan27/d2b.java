package jan27;

public class d2b {

	public static void main(String[] args) {

		int sn = 57;
		int sb = 10;
		int db = 2;
		int dn = 0;
		int i = 1; //power counter
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

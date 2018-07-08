package jan27;

public class o2b {

	public static void main(String[] args) {

		int sn = 572;
		int sb = 8;
		int db = 2;
		int dn = 0;
		int pow = 1;
		while(sn!= 0) {
			int num = sn % 10;
			if(num == 0) {
				num = 0;
			}
			else if(num == 1) {
				num = 1;
			}
			else if(num == 2) {
				num = 10;
			}else if(num == 3) {
				num = 11;
			}else if(num == 4) {
				num = 100;
			}else if(num == 5) {
				num = 101;
			}else if(num == 6) {
				num = 110;
			}else if(num == 7) {
				num = 111;
			}
			dn = dn + (num*pow);
			pow = pow*1000;
			sn = sn/10;
		}
		System.out.println(dn);
	}

}

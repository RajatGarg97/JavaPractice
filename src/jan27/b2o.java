package jan27;

public class b2o {

	public static void main(String[] args) {
		int sn = 101111010;
		int sb = 2;
		int db = 8;
		int dn = 0;
		int pow = 1;
		while(sn!= 0) {
			int num = sn % 1000;
			if(num == 0) {
				num = 0;
			}
			else if(num == 1) {
				num = 1;
			}
			else if(num == 10) {
				num = 2;
			}else if(num == 11) {
				num = 3;
			}else if(num == 100) {
				num = 4;
			}else if(num == 101) {
				num = 5;
			}else if(num == 110) {
				num = 6;
			}else if(num == 111) {
				num = 7;
			}
			dn = dn + (num*pow);
			pow = pow*10;
			sn = sn/1000;
		}
		System.out.println(dn);
	}

}

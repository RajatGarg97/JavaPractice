package jan28;

import java.util.Scanner;

public class b2ondrev {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sn = scn.nextInt();
		int sb = scn.nextInt();//2
		int db = scn.nextInt();//8
		int dn = 0; 
		int pow = 1;
		if(sb == 2) {
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
		}
		
		else if(sb == 8) {
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
		}
		System.out.println(dn);
	}


}

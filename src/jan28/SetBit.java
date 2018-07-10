package jan28;

public class SetBit {

	public static void main(String[] args) {

		byte b = (byte)600;
		int idx = 6; //0 to 7
		int idx1 = 4;
		int idx2 = 2;
		int bitmask = 1 << idx;
		int bitmask1 = 1 << idx1;
		int bitmask2 = 1 << idx2;
		System.out.println("Bit On "+ (b|bitmask));
		System.out.println("Bit Off "+ (b&(~bitmask1)));
		System.out.println("Bit Toggle "+ (b^bitmask2));
	}

}

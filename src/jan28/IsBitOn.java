package jan28;

public class IsBitOn {

	public static void main(String[] args) {

		byte b = (byte)57;
		int idx = 3; //0 to 7
		int bitmask = 1 << idx; 
		if((b & bitmask) == bitmask) {
			System.out.println("Bit On");
		}
		else {
			System.out.println("Bit Off");
		}
	}

}

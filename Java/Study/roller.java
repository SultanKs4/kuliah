import java.util.*;

public class roller {
	public static void main(String[] args) {
		int dadu1, dadu2, hasildadu, hasil=0;

		dadu1 = 1 + (int)(Math.random()*6);
		dadu2 = 1 + (int)(Math.random()*6);

		hasildadu = dadu1 + dadu2;
		hasil = hasil + hasildadu;

		System.out.println("Nilai dadu1 : " + dadu1);
		System.out.println("Nilai dadu2 : " + dadu2);
		System.out.println("Nilai total dadu : " + hasildadu);
		System.out.println("Maju " + hasil + " langkah");
	}
}
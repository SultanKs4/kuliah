import java.util.Scanner;

public class LatihanOOP {
	public static void main(String[] args) {

		Segitiga segitiga1 = new Segitiga();
		segitiga1.alas = 55;
		segitiga1.tinggi = 100;

		Segitiga segitiga2 = new Segitiga();
		segitiga2.alas = 150;
		segitiga2.tinggi = 200;

		segitiga1.tampilkanLuas();
		segitiga2.tampilkanLuas();

		// System.out.println("Luas segitiga 1 = " + segitiga1.alas * segitiga1.tinggi /
		// 2);
		// System.out.println("Luas segitiga 2 = " + segitiga2.alas * segitiga2.tinggi /
		// 2);
	}
}
import java.util.Scanner;

public class Segitiga{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int alas, tinggi;
		float luas;
		System.out.print("Masukkan alas: ");
		alas = scanner.nextInt();
		System.out.print("Masukkan tinggi: ");
		tinggi = scanner.nextInt();
		luas = alas * tinggi / 2;
		System.out.println("Luas segitiga: " + luas);

	}
}
import java.util.Scanner;

public class JS4_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int angka1, angka2;

		System.out.print("Masukkan Angka pertama \t\t: ");
		angka1 = scan.nextInt();
		System.out.print("Masukkan Angka kedua \t\t: ");
		angka2 = scan.nextInt();

		if (angka1 > angka2) {
			System.out.println("Angka dengan nilai terbesar \t: " + angka1);
		}
		else if (angka1 == angka2) {
			System.out.println("Kedua angka memiliki nilai yang sama besar");
		}
		else {
			System.out.println("Angka dengan nilai terbesar \t: " + angka2); 
		}
	}
}
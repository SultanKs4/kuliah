import java.util.Scanner;

public class Biodata{
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		String nama, noHp;
		int usia, tinggiBadan;
		System.out.print("Masukkan nama: ");
		nama = scString.nextLine();
		System.out.print("Masukkan no HP: ");
		noHp = scString.nextLine();
		System.out.print("Masukkan usia: ");
		usia = scInt.nextInt();
		System.out.print("Masukkan tinggi badan: ");
		tinggiBadan = scInt.nextInt();
		System.out.println("Nama: " + nama);
		System.out.println("No. HP: " + noHp);
		System.out.println("Usia: " + usia);
		System.out.println("Tinggi badan: " + tinggiBadan);
	}
}
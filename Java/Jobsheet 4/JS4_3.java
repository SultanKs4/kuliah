import java.util.Scanner;

public class JS4_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalGaji, gajiPokok, uangMakan, uangTransportasi;
		float pajak = 0.05f, finalGaji, potongGaji;

		System.out.print("Masukkan jumlah Gaji Pokok \t\t: ");
		gajiPokok = scan.nextInt();
		System.out.print("Masukkan jumlah Uang Makan \t\t: ");
		uangMakan = scan.nextInt();
		System.out.print("Masukkan jumlah Uang Transportasi \t: ");
		uangTransportasi = scan.nextInt();

		totalGaji = gajiPokok + uangMakan + uangTransportasi;

		if (totalGaji >= 1500000) {
			potongGaji = totalGaji * pajak;
			finalGaji = totalGaji - potongGaji;
			System.out.println("\nTotal Gaji kotor adalah \t\t= " + totalGaji);
			System.out.println("Total terkena pajak adalah \t\t= " + potongGaji);
			System.out.println("Total Gaji bersih adalah \t\t= " + finalGaji);
		}
		else{
			System.out.println("\nTotal Gaji bersih adalah \t\t= " + totalGaji);
		}
	}
}
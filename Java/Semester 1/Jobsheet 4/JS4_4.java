import java.util.Scanner;

public class JS4_4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int uts, uas;

		System.out.print("Masukkan Nilai UTS : ");
		uts = scan.nextInt();
		System.out.print("Masukkan Nilai UAS : ");
		uas = scan.nextInt();

		if (uts > 100 || uas > 100) {
			System.out.println("\nNilai maksimal adalah 100!");
			System.out.println("Silahkan coba lagi!");
		}
		else if (uts > 90 || uas == 100) {
			System.out.println("\nSelamat Anda masuk kelas A");
		}
		else if (uts < 0 || uas < 0) {
			System.out.println("\nNilai minimum adalah 0!");
			System.out.println("Silahkan coba lagi!");
		}
		else {
			System.out.println("\nSelamat Anda masuk kelas B");
		}
	}
}
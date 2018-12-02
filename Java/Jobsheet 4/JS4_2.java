import java.util.Scanner;

public class JS4_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int umur;

		System.out.print("Masukkan umur Anda : ");
		umur = scan.nextInt();

		if (umur >= 17) {
			System.out.println("Selamat, Anda sudah boleh berkendara");
		}
		else{
			System.out.println("Mohon maaf, Anda belum boleh berkendara");
		}
	}
}
import java.util.Scanner;

public class JS6_Perta1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n;

		System.out.print("Masukkan angka ");
		n = sc.nextInt();

		i = 0;
		while (i != n) {
			System.out.print("*");
			i++;
		}
	}
}
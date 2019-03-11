import java.util.Scanner;

public class ArrayPPTSoal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] bilangan = new int[7];

        for (int alpha = 0; alpha < 7; alpha++) {
            System.out.print("Masukkan Bilangan ke-" + alpha + ": ");
            bilangan[alpha] = scan.nextInt();
        }

        for (int alpha = 0; alpha < 7; alpha++) {
            System.out.println("Isi bilangan ke-" + alpha + " adalah : " + bilangan[alpha]);
        }
    }
}
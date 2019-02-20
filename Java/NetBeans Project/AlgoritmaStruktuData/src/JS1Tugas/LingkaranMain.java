package JS1Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class LingkaranMain {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Lingkaran bunder1 = new Lingkaran();

        System.out.print("Masukkan Jari-Jari : ");
        bunder1.r = scan.nextDouble();

        System.out.println("Luas lingkaran adalah : " + bunder1.hitungLuas());
        System.out.println("Keliling lingkaran adalah : " + bunder1.hitungKeliling());
    }
}

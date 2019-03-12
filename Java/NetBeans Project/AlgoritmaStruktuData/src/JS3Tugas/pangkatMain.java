package JS3Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class pangkatMain {
    public static pangkat p1 = new pangkat();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        inputangka();
        tampilPangkat();
    }

    public static void inputangka() {
        System.out.print("Masukkan angka : ");
        p1.n = scan.nextInt();
        while (p1.n <= 0) {
            System.out.print("Hanya Boleh memasukkan angka diatas 0\nTolong Masukkan angka lagi : ");
            p1.n = scan.nextInt();
        }
        System.out.print("Masukkan angka pemangkat : ");
        p1.x = scan.nextInt();
        while (p1.x <= 0) {
            System.out.print("Hanya Boleh memasukkan pemangkat diatas 0\nTolong Masukkan angka pemangkat lagi : ");
            p1.x = scan.nextInt();
        }
    }

    public static void tampilPangkat() {
        System.out.print("Dalam Bentuk Matematika  : ");
        for (int i = 0; i < p1.x; i++) {
            if (i == 0) {
                System.out.print(p1.n);
            }
            if (i >= 1) {
                System.out.print("x" + p1.n);
            }
        }
        System.out.println("\nProses Pemangkatan menggunakan Brute Force");
        System.out.println("Hasilnya adalah : " + p1.pangkatBruteForce());
        System.out.println("Proses Pemangkatan menggunakan Divide Conquer");
        System.out.println("Hasilnya adalah : " + p1.pangkatDivideConquer(p1.x));
    }
}

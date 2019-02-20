package JS2Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class MahasiswaMain {
    public static Scanner scanInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Jumlah Mahasiswa : ");
        int jumlahMah = scanInt.nextInt();
        Mahasiswa[] mahBEndArr = new Mahasiswa[jumlahMah];
        System.out.println();
        for (int i = 0; i < mahBEndArr.length; i++) {
            mahBEndArr[i] = new Mahasiswa();
            System.out.println("Mahasiswa " + (i + 1));
            System.out.print("Nilai 1 : ");
            mahBEndArr[i].nilai1 = scanInt.nextInt();
            System.out.print("Nilai 2 : ");
            mahBEndArr[i].nilai2 = scanInt.nextInt();

        }
        System.out.println();
        for (int i = 0; i < mahBEndArr.length; i++) {
            System.out.println("Nilai terbaik Mahasiswa " + (i + 1) + " : " + mahBEndArr[i].highest());
        }
    }
}

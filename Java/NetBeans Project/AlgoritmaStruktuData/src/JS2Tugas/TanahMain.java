package JS2Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class TanahMain {
    public static Scanner scanInt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Jumlah Tanah : ");
        int jumlahTan = scanInt.nextInt();
        Tanah[] tanBEndArr = new Tanah[jumlahTan];
        System.out.println();
        for (int i = 0; i < tanBEndArr.length; i++) {
            tanBEndArr[i] = new Tanah();
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang : ");
            tanBEndArr[i].panjang = scanInt.nextInt();
            System.out.print("Lebar : ");
            tanBEndArr[i].lebar = scanInt.nextInt();

        }
        System.out.println();
        int max = tanBEndArr[0].hitungLuas();
        int largest = 1;
        for (int i = 0; i < tanBEndArr.length; i++) {
            System.out.println("Luas Tanah " + (i + 1) + " : " + tanBEndArr[i].hitungLuas());
            if (max < tanBEndArr[i].hitungLuas()) {
                max = tanBEndArr[i].hitungLuas();
                largest = i + 1;
            }
        }
        System.out.println("\nTanah terluas : Tanah " + largest);
    }
}

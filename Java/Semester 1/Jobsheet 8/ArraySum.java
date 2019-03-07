import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Isi Array : ");
        int inputLength = scan.nextInt();
        int[] angka = new int[inputLength];
        int output = 0;

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Array ke-" + i + " : ");
            angka[i] = scan.nextInt();
            output += angka[i];
        }
        System.out.println("Hasil Penjumlahan isi elemen array : " + output);
        if (scan != null) {
            scan.close();
        }
    }
}
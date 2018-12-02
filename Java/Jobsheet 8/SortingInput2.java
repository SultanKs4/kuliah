import java.util.Arrays;
import java.util.Scanner;

public class SortingInput2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array : ");
        int inputLength = scan.nextInt();

        int[] angka = new int[inputLength];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Array ke " + i + " : ");
            angka[i] = scan.nextInt();
        }

        Arrays.sort(angka);
        System.out.print("Hasil Pengurutan : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        if (scan != null) {
            scan.close();
        }
    }
}
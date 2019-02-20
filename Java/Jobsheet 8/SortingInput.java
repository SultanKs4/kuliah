import java.util.Scanner;

public class SortingInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int swap = 0;

        System.out.print("Masukkan jumlah elemen array : ");
        int inputLength = scan.nextInt();

        int[] angka = new int[inputLength];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Array ke " + i + " : ");
            angka[i] = scan.nextInt();
        }
        for (int i = 0; i < angka.length; i++) {
            for (int a = 1; a < (angka.length - i); a++) {
                if (angka[a - 1] > angka[a]) {
                    swap = angka[a - 1];
                    angka[a - 1] = angka[a];
                    angka[a] = swap;
                }
            }
        }
        System.out.print("Hasil Pengurutan : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        if (scan != null) {
            scan.close();
        }
    }
}
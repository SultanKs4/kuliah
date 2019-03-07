import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Isi Array : ");
        int inputLength = scan.nextInt();
        int[] angka = new int[inputLength];
        int max = angka[0];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Array ke-" + i + " : ");
            angka[i] = scan.nextInt();
            if (angka[i] > max) {
                max = angka[i];
            }
        }

        System.out.println("Bilangan terbesar : " + max);
        if (scan != null) {
            scan.close();
        }
    }
}
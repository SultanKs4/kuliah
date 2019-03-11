import java.util.Scanner;

public class tugasPerulangan4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputAngka, w;

        System.out.print("Masukkan Angka : ");
        inputAngka = scan.nextInt();

        w = 1;
        while (w <= inputAngka) {
            if (w % 2 == 1) {
                System.out.print(" * ");
            }
            if (w % 2 == 0) {
                System.out.print(" - ");
            }
            w++;
        }
    }
}
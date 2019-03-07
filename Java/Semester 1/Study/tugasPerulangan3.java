import java.util.Scanner;

public class tugasPerulangan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputAngka, i;
        String tambahan = null;

        System.out.print("Masukkan Angka : ");
        inputAngka = scan.nextInt();

        for (i = 1; i <= inputAngka; i++) {
            if (i % 2 == 1) {
                tambahan = "*";
            }
            if (i % 2 == 0) {
                tambahan = "-";
            }
            System.out.print(i + " = (" + tambahan + "), ");
        }
    }
}
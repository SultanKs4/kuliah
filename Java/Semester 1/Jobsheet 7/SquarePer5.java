import java.util.Scanner;

public class SquarePer5 {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        int baris, kolom, inputBaris;

        System.out.print("Masukkan jumlah baris : ");
        inputBaris = scanInt.nextInt();

        for (baris = 1; baris <= inputBaris; baris++) {
            for (kolom = 1; kolom <= baris; kolom++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
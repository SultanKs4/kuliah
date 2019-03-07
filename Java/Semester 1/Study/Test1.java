import java.util.Scanner;

public class Test1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        System.out.print("Masukkan nilai N : ");
        int angka = scan.nextInt();
        proses(angka);
    }

    public static void proses(int angka) {
        for (int i = 1; i <= angka; i++) {
            for (int j = angka; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k < i * 2; k++) {
                System.out.print(" ");
            }
            for (int l = angka; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
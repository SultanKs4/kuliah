import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Isi Array : ");
        int inputLength = scan.nextInt();
        int[] angka = new int[inputLength];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan Array ke-" + i + " : ");
            angka[i] = scan.nextInt();
        }
        System.out.println("GANJIL");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 1) {
                System.out.print(angka[i] + " ");
            }
        }
        System.out.println("\nGENAP");
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + " ");
            }
        }
        if (scan != null) {
            scan.close();
        }
    }
}
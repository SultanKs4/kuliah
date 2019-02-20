import java.util.Scanner;

public class ArrayInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiUAS = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Masukkan nilai UAS ke-" + i + ": ");
            nilaiUAS[i] = sc.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Nilai UAS ke-" + i + " adalah: " + nilaiUAS[i]);
        }
        if (sc != null) {
            sc.close();
        }
    }
}
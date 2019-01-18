import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        System.out.print("Masukkan jumlah Baris : ");
        int n = scanInt.nextInt();

        if (n >= 2) {
            for (int l = 1; l <= n; l++) {
                for (int b = 1; b <= n; b++) {
                    for (int s = n - b; s > 0; s--) {
                        System.out.print(" ");
                    }
                    for (int bi = 1; bi <= b * 2 - 1; bi++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } else
            System.out.println("Jumlah Baris minimal 2");
    }
}
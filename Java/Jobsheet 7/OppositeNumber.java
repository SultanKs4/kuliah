import java.util.Scanner;

public class OppositeNumber {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        System.out.print("Masukkan jumlah Baris : ");
        int n = scanInt.nextInt();

        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    for (int gan = 1; gan <= n; gan++) {
                        System.out.print(gan + " ");
                    }
                } else {
                    for (int gen = n; gen >= 1; gen--) {
                        System.out.print(gen + " ");
                    }
                }
                System.out.println();
            }
        } else
            System.out.println("Jumlah Baris minimal 2");
    }
}
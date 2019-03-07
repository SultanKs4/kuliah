import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        int n, b;

        System.out.print("Masukkan jumlah Baris : ");
        n = scanInt.nextInt();

        if (n > 2) {
            for (int i = 1; i <= n; i++) {
                for (b = 1; b <= n; b++) {
                    if (i == 1 || i == n) {
                        System.out.print(n);
                    }
                }
                if (i > 1 && i < n) {
                    for (int test = 1; test <= n; test++) {
                        if (test == 1 || test == n) {
                            System.out.print(n);
                        } else
                            System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else
            System.out.println("Jumlah Baris minimal 3");
    }
}
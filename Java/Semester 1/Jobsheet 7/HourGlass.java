import java.util.Scanner;
import java.util.Scanner;

public class HourGlass {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        System.out.print("N : ");
        int n = scanInt.nextInt();

        if (n > 1) {
            for (int luar = 1; luar <= 1; luar++) {
                for (int i = n; i >= 1; i--) {
                    for (int j = n - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (int i = 2; i <= n; i++) {
                    for (int j = n - i; j > 0; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i * 2 - 1; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } else
            System.out.println("Nilai minimal 2");
    }
}
import java.util.Scanner;

public class Fibonacci {
    static Scanner scan = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        tampil(FiboRecursion(input()), FiboIteratif(n));
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        n = scan.nextInt();
        return n;
    }

    public static void tampil(int FiboRecursion, int FiboIteratif) {
        System.out.print("Fibonacci Rekursif : ");
        for (int i = 0; i <= n; i++) {
            System.out.print(FiboRecursion(i) + " ");
        }
        System.out.print("\nFibonacci Iteratif : ");
        for (int i = 0; i <= n; i++) {
            System.out.print(FiboIteratif(i) + " ");
        }
    }

    public static int FiboRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return FiboRecursion(n - 2) + FiboRecursion(n - 1);
    }

    public static int FiboIteratif(int n) {
        if (n == 1) {
            return 1;
        }
        int point1 = 0, point2 = 1, fibonacci = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci = point1 + point2;
            point1 = point2;
            point2 = fibonacci;
        }
        return fibonacci;
    }
}
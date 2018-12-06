import java.util.Scanner;

public class CekPrimaRekursif {
    static Scanner scan = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        checkFinal(prime(input(), 2));
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        n = scan.nextInt();
        return n;
    }

    public static boolean prime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return prime(n, i + 1);
    }

    public static void checkFinal(boolean prime) {
        if (prime == true) {
            System.out.println("Angka " + n + " Adalah bilangan prima");
        } else
            System.out.println("Angka " + n + " Bukanlah bilangan prima");
    }
}
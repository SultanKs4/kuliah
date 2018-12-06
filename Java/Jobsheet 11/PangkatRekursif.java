import java.util.Scanner;

public class PangkatRekursif {
    static Scanner scan = new Scanner(System.in);
    static int n, pangkat;

    public static void main(String[] args) {
        System.out.println("Hasilnya adalah : " + SqrtRecursion(input(), pangkat()));
        tampilan(pangkat, n);
        System.out.print(SqrtRecursion(n, pangkat));
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        n = scan.nextInt();
        return n;
    }

    public static int pangkat() {
        System.out.print("Masukkan Pangkat : ");
        pangkat = scan.nextInt();
        return pangkat;
    }

    public static void tampilan(int pangkat, int n) {
        if (pangkat == 0) {
            return;
        }
        if (pangkat == 1) {
            System.out.print(n + " = ");
        } else if (n != 1) {
            System.out.print(n + " * ");
        }
        tampilan(pangkat - 1, n);
    }

    public static int SqrtRecursion(int n, int pangkat) {
        if (pangkat == 0)
            return 1;
        else
            return n * SqrtRecursion(n, pangkat - 1);
    }
}
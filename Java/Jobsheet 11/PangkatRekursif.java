import java.util.Scanner;

public class PangkatRekursif {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hasilnya adalah : " + SqrtRecursion(input(), pangkat()));
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        int n = scan.nextInt();
        return n;
    }

    public static int pangkat() {
        System.out.print("Masukkan Pangkat : ");
        int pangkat = scan.nextInt();
        return pangkat;
    }

    public static int SqrtRecursion(int n, int pangkat) {
        if (pangkat == 0)
            return 1;
        else
            return n * SqrtRecursion(n, pangkat - 1);
    }
}
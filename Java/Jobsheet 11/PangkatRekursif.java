import java.util.Scanner;

public class PangkatRekursif {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        plusRecursion(input(), pangkat());
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

    public static void plusRecursion(int n, int pangkat) {
        int total = 1;
        for (int i = 1; i <= pangkat; i++) {
            total *= n;
        }
        System.out.println("Totalnya adalah : " + total);
    }
}
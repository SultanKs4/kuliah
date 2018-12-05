import java.util.Scanner;

public class PenjumlahanRekursif {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        plusRecursion(input());
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        int n = scan.nextInt();
        return n;
    }

    public static void plusRecursion(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("Totalnya adalah : " + total);
    }
}
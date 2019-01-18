import java.util.Scanner;

public class DeretDescendingRekursif {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        descending(input());
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        int n = scan.nextInt();
        return n;
    }

    public static int descending(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            return descending(n - 1);
        }
        return n;
    }
}
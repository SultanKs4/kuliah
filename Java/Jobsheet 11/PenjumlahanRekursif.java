import java.util.Scanner;

public class PenjumlahanRekursif {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Totalnya adalah : " + plusRecursion(input()));
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        int n = scan.nextInt();
        return n;
    }

    public static int plusRecursion(int n) {
        if (n == 1)
            return 0;
        else
            return plusRecursion(n - 1) + n;
    }
}
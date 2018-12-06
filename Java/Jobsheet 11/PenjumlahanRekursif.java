import java.util.Scanner;

public class PenjumlahanRekursif {
    static Scanner scan = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        System.out.println("Totalnya adalah : " + plusRecursion(input()));
        tampilan(n, 1);
        System.out.print(plusRecursion(n));
    }

    public static int input() {
        System.out.print("Masukkan nilai N : ");
        n = scan.nextInt();
        return n;
    }

    public static void tampilan(int n, int i) {
        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.print(i + " = ");
        } else if (n != 1) {
            System.out.print(i + " + ");
            i++;
        }
        tampilan(n - 1, i);
    }

    public static int plusRecursion(int n) {
        if (n == 1)
            return 1;
        else
            return plusRecursion(n - 1) + n;
    }
}
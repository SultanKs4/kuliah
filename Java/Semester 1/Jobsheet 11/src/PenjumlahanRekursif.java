import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int n = sc.nextInt();
        PenjumlahanRekursif(n);
        show(n, 1);
        System.out.print(PenjumlahanRekursif(n));
    }

    static void show(int n, int i) {
        if (n == 0)
            return;
        if (n == 1) {
            System.out.print(i + "=");
        } else if (n != 0) {
            System.out.print(i + "+");
            i++;
        }
        show(n - 1, i);
    }

    static int PenjumlahanRekursif(int n) {
        if (n > 1) {
            return n + PenjumlahanRekursif(n - 1);
        } else {
            return n;
        }
    }
}

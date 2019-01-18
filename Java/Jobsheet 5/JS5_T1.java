import java.util.Scanner;

public class JS5_T1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;

        System.out.print("Angka 1: ");
        a = scan.nextInt();
        System.out.print("Angka 2: ");
        b = scan.nextInt();
        System.out.print("Angka 3: ");
        c = scan.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Angka yang terbesar adalah angka 1 dengan nilai : " + a);
            } else
                System.out.println("Angka yang terbesar adalah angka 3 dengan nilai : " + c);
        } else if (b > a) {
            if (b > c) {
                System.out.println("Angka yang terbesar adalah angka 2 dengan nilai : " + b);
            } else
                System.out.println("Angka yang terbesar adalah angka 3 dengan nilai : " + c);
        }

        if (a < b) {
            if (a < c) {
                System.out.println("Angka yang terkecil adalah angka 1 dengan nilai : " + a);
            } else
                System.out.println("Angka yang terkecil adalah angka 3 dengan nilai : " + c);
        } else if (b < a) {
            if (b < c) {
                System.out.println("Angka yang terkecil adalah angka 2 dengan nilai : " + b);
            } else
                System.out.println("Angka yang terkecil adalah angka 3 dengan nilai : " + c);
        }
    }
}
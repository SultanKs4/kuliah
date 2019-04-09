import java.util.Scanner;

/**
 * @author Sultan deter2x2
 */
public class deter2x2 {
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static Innerdeter2x2 detObj = new Innerdeter2x2();

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        int stat = 19;
        System.out.println("x1  " + "x2\n" + "x3  " + "x4");
        System.out.println("Nilai Matriks statis : " + stat + "\n akan ditaruh di x1");
        detObj.x1 = stat;
        print();
        System.out.print("x2 : ");
        detObj.x2 = scan.nextInt();
        System.out.print("x3 : ");
        detObj.x3 = scan.nextInt();
        System.out.print("x4 : ");
        detObj.x4 = scan.nextInt();
        print();
        determinan();
    }

    public static void determinan() {
        int a = detObj.x1 * detObj.x4;
        int b = detObj.x2 * detObj.x3;
        System.out.println("\nHasil x1*x4 = " + a);
        System.out.println("Hasil x2*x3 = " + b);
        int c = a - b;
        System.out.println("Hasil determinan = " + c);
    }

    public static void print() {
        System.out.println("\n" + detObj.x1 + "  " + detObj.x2 + "\n" + detObj.x3 + "  " + detObj.x4);
    }

    /**
     * Innerdeter 2x2
     */
    public static class Innerdeter2x2 {
        int x1, x2, x3, x4;
    }
}
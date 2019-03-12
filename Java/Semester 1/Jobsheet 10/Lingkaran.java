import java.util.Scanner;

public class Lingkaran {
    static Scanner scan = new Scanner(System.in);
    static int jari;

    public static void main(String[] args) {
        input();
        Output(KelilingLingkaran(jari), LuasLingkaran(jari));
    }

    public static int input() {
        System.out.print("Masukkan Jari-Jari : ");
        jari = scan.nextInt();
        return jari;
    }

    public static double KelilingLingkaran(int jari) {
        double keliling;
        keliling = 3.14 * 2 * jari;
        return keliling;
    }

    public static double LuasLingkaran(int jari) {
        double luas;
        luas = 3.14 * jari * jari;
        return luas;
    }

    public static void Output(double keliling, double luas) {
        System.out.println("Nilai Keliling Lingkaran : " + keliling);
        System.out.println("Nilai Luas Lingkaran : " + luas);
    }
}
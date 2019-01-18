import java.util.Scanner;

public class FPBEuclidRekursif {
    static Scanner scan = new Scanner(System.in);
    static int angka1, angka2;

    public static void main(String[] args) {
        input();
        int hasil = fpb(angka1, angka2);
        System.out.println("FPB dari angka " + angka1 + " & " + angka2 + " adalah : " + hasil);
    }

    public static void input() {
        System.out.print("Masukkan angka 1 : ");
        angka1 = scan.nextInt();
        System.out.print("Masukkan angka 2 : ");
        angka2 = scan.nextInt();
    }

    public static int fpb(int angka1, int angka2) {
        if (angka1 == 0) {
            return angka2;
        }
        return fpb(angka2 % angka1, angka1);
    }
}
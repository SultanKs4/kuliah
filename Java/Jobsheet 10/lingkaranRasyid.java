import java.util.Scanner;

public class lingkaranRasyid {
    static Scanner sc = new Scanner(System.in);
    static double jari2, keliling, luas;

    public static void main(String[] args) {
        input();
        tampilMenu();
    }

    public static void input() {
        System.out.print("Inputkan Jari-Jari Lingkaran = ");
        jari2 = sc.nextInt();
    }

    public static void tampilMenu() {
        System.out.println("-----KELILING & LUAS LINGKURAN-----");
        System.out.println("1. Keliling");
        System.out.println("2. Luas");
        System.out.print("Masukkan pilihan Anda = ");
        verifPilihan(pilihan());
    }

    public static int pilihan() {
        System.out.print("\nMasukkan Pilihan Anda : ");
        int pilihan = sc.nextInt();
        return pilihan;
    }

    public static void verifPilihan(int pilihan) {
        if (pilihan == 1) {
            keliling(jari2);
        } else if (pilihan == 2) {
            luas(jari2);
        } else {
            System.out.print("Inputan Salah");
            tampilMenu();
        }
    }

    public static void keliling(double jari2) {
        keliling = Math.PI * 2 * jari2;
        System.out.print("Keliling Lingkaran = " + keliling);
    }

    public static void luas(double jari2) {
        luas = Math.PI * jari2 * jari2;
        System.out.print("Luas Lingkaran = " + luas);
    }
}
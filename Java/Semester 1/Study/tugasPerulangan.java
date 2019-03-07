import java.util.Scanner;

public class tugasPerulangan {
    static Scanner scanInt = new Scanner(System.in);
    static Scanner scanChar = new Scanner(System.in);

    static int pilihan, n, m, inputAngka, f, w, inputAngkaWhile;
    static String tambahan = null;

    public static void main(String[] args) {
        do {
            menu();
        } while (ulangi());
    }

    public static void menu() {
        System.out.println("1. Tugas Perulangan For Anak Ayam");
        System.out.println("2. Tugas Perulangan While Anak Ayam");
        System.out.println("3. Tugas Perulangan For Bilangan (* -)");
        System.out.println("4. Tugas Perulangan While Bilangan (* -)");
        verifMenu(pilihMenu());
    }

    public static int pilihMenu() {
        System.out.print("Masukkan Pilihan : ");
        pilihan = scanInt.nextInt();
        return pilihan;
    }

    public static void verifMenu(int pilihan) {
        if (pilihan == 1) {
            tugasFor();
        } else if (pilihan == 2) {
            tugasWhile();
        } else if (pilihan == 3) {
            tugasBilanganFor();
        } else if (pilihan == 4) {
            tugasBilanganWhile();
        } else {
            System.out.println("Input Salah!");
            menu();
        }
    }

    public static void tugasFor() {
        for (n = 10; n >= 1; n--) {
            m = n - 1;
            System.out.println("Anak ayam turun " + n + " Mati satu tinggal " + m);
        }
    }

    public static void tugasWhile() {
        n = 10;
        while (n >= 1) {
            m = n - 1;
            System.out.println("Anak ayam turun " + n + " Mati satu tinggal " + m);
            n--;
        }
    }

    public static void tugasBilanganFor() {
        System.out.print("Masukkan Angka : ");
        inputAngka = scanInt.nextInt();

        for (f = 1; f <= inputAngka; f++) {
            if (f % 2 == 1) {
                tambahan = "*";
            }
            if (f % 2 == 0) {
                tambahan = "-";
            }
            System.out.print(f + " = (" + tambahan + "), ");
        }
        System.out.println("\n* = Ganjil");
        System.out.println("- = Genap");
    }

    public static void tugasBilanganWhile() {
        System.out.print("Masukkan Angka : ");
        inputAngkaWhile = scanInt.nextInt();
        w = 1;
        while (w <= inputAngkaWhile) {
            if (w % 2 == 1) {
                tambahan = "*";
            }
            if (w % 2 == 0) {
                tambahan = "-";
            }
            System.out.print(w + " = (" + tambahan + "), ");
            w++;
        }
        System.out.println("\n* = Ganjil");
        System.out.println("- = Genap");
    }

    public static boolean ulangi() {
        System.out.print("\nUlang lagi (Y/N) ? ");
        char ulangi = scanChar.next().charAt(0);
        if (ulangi == 'N' || ulangi == 'n') {
            System.out.println("\nTerima Kasih");
        } else if (ulangi == 'Y' || ulangi == 'y') {
            return ulangi == 'Y' || ulangi == 'y';
        } else {
            System.out.println("Inputan tidak valid!");
            System.out.println("Coba lagi");
            ulangi();
        }
        return ulangi == 'Y' || ulangi == 'y';
    }
}
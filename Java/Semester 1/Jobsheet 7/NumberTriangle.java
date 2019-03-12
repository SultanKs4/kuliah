import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        System.out.print("Masukkan jumlah Baris 1 : ");
        int baris = scanInt.nextInt();
        System.out.print("Masukkan jumlah Baris 2 : ");
        int baris2 = scanInt.nextInt();
        int luar, kosong;

        if (baris > 0 || baris2 > 0) {
            if (baris < baris2) {
                for (luar = 1; luar <= baris2; luar++) {
                    for (kosong = baris2 - luar; kosong > 0; kosong--) {
                        System.out.print(" ");
                    }
                    for (int angka = 1; angka <= luar - (baris2 - baris); angka++) {
                        System.out.print(angka);
                    }

                    System.out.print("\t");

                    for (kosong = baris2 - luar; kosong > 0; kosong--) {
                        System.out.print(" ");
                    }
                    for (int angka2 = 1; angka2 <= luar; angka2++) {
                        System.out.print(angka2);
                    }

                    System.out.println();
                }
            } else {
                for (luar = 1; luar <= baris; luar++) {
                    for (kosong = baris - luar; kosong > 0; kosong--) {
                        System.out.print(" ");
                    }
                    for (int angka = 1; angka <= luar; angka++) {
                        System.out.print(angka);
                    }

                    System.out.print("\t");

                    for (kosong = baris - luar; kosong > 0; kosong--) {
                        System.out.print(" ");
                    }
                    for (int angka2 = 1; angka2 <= luar - (baris - baris2); angka2++) {
                        System.out.print(angka2);
                    }

                    System.out.println();
                }
            }
        } else
            System.out.println("Jumlah Baris Minimal 1");
    }
}
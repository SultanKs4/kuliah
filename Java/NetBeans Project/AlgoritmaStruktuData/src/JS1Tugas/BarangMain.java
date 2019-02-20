package JS1Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class BarangMain {
    public static Scanner scanInt = new Scanner(System.in);
    public static Scanner scanLine = new Scanner(System.in);

    public static void main(String[] args) {
        Barang b1BackEnd = new Barang();
        String diskonPerc;
        System.out.print("Nama Barang : ");
        b1BackEnd.nama = scanLine.nextLine();
        System.out.print("Harga Barang : ");
        b1BackEnd.hargaSatuan = scanInt.nextInt();
        System.out.print("Jumlah Barang : ");
        b1BackEnd.jumlah = scanInt.nextInt();
        System.out.println("Harga Total : " + b1BackEnd.hitungHargaTotal());
        if (b1BackEnd.hitungHargaTotal() > 100000) {
            diskonPerc = "10%";
        } else if (b1BackEnd.hitungHargaTotal() >= 50000 && b1BackEnd.hitungHargaTotal() <= 100000) {
            diskonPerc = "5%";
        } else
            diskonPerc = "Tidak ada diskon";
        System.out.println("Diskon yang diterima : " + diskonPerc + ", Dengan Nominal = " + b1BackEnd.hitungDiskon());
        System.out.println("Harga Setelah diskon : " + b1BackEnd.hitungHargaBayar());
    }
}

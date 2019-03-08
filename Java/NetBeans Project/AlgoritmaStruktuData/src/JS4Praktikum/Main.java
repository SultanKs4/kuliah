package JS4Praktikum;

import java.util.Scanner;

/**
 * @author Sultan
 */
public class Main {
    public static Scanner s = new Scanner(System.in);
    public static Scanner s1 = new Scanner(System.in);

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn Masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            System.out.println("-------------------");

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        System.out.println("Data Mahasiswa sebelum sorting = ");
        data.tampil();
        System.out.println("Data Mahasiswa setelah sorting desc berdasar ipk = ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data Mahasiswa setelah sorting asc berdasar ipk = ");
        data.selectionSort();
        data.tampil();
    }
}
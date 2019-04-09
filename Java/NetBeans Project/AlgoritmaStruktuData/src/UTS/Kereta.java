
package UTS;

import java.util.Scanner;

/**
 * KeretaMain
 */
public class Kereta {
    static InnerKereta[] ArrObj;
    static InnerKereta[] sisaKuota;
    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);

    /**
     * InnerKereta
     */
    static class InnerKereta {
        int kode_kereta, kuota_tiket, jumlah_beli;
        String nama_kereta;

        public int sisa_tiket() {
            return kuota_tiket - jumlah_beli;
        }

        public void tampil() {
            System.out.println("\nKode Kereta : " + kode_kereta);
            System.out.println("Nama Kereta : " + nama_kereta);
            System.out.println("Kuota Tiket Kereta : " + kuota_tiket);
            System.out.println("Jumlah Beli Tiket Kereta : " + jumlah_beli);
            System.out.println("Sisa Tiket : " + sisa_tiket());
            System.out.println("==============================");
        }

        public void tampilKuota() {
            System.out.println("\nKode Kereta : " + kode_kereta);
            System.out.println("Nama Kereta : " + nama_kereta);
            System.out.println("Sisa Tiket : " + sisa_tiket());
            System.out.println("==============================");
        }
    }

    public static void main(String[] args) {
        awal();
        SequentialSearchSearching();
    }

    public static void awal() {
        System.out.print("Input jumlah Data Kereta : ");
        int size = scan.nextInt();
        ArrObj = new InnerKereta[size];
        System.out.println("Input data kereta baru : \n");
        for (int i = 0; i < ArrObj.length; i++) {
            ArrObj[i] = new InnerKereta();
            System.out.print("Kode Kereta : ");
            ArrObj[i].kode_kereta = scan.nextInt();
            System.out.print("Nama Kereta : ");
            ArrObj[i].nama_kereta = scan1.nextLine();
            System.out.print("Kuota Tiket Kereta : ");
            ArrObj[i].kuota_tiket = scan.nextInt();
            System.out.print("Jumlah Pembelian Tiket Kereta : ");
            ArrObj[i].jumlah_beli = scan.nextInt();
            System.out.println("==============================");
        }
        for (int i = 0; i < ArrObj.length; i++) {
            ArrObj[i].tampil();
        }
    }

    public static void SequentialSearchSearching() {
        System.out.println("Mencari kereta yang masih belum memenuhi kuota");
        int ukuran = 0;
        for (int i = 0; i < ArrObj.length; i++) {
            if (ArrObj[i].sisa_tiket() > 0) {
                ukuran++;
            }
        }
        sisaKuota = new InnerKereta[ukuran];
        int count = -1;
        for (int i = 0; i < ArrObj.length; i++) {
            if (ArrObj[i].sisa_tiket() > 0) {
                count++;
                sisaKuota[count] = new InnerKereta();
                sisaKuota[count] = ArrObj[i];
            }
        }
        System.out.println("OK");
        BubbleSortSorting();
    }

    public static void BubbleSortSorting() {
        for (int i = 0; i < sisaKuota.length; i++) {
            for (int j = 1; j < sisaKuota.length - i; j++) {
                if (sisaKuota[j].sisa_tiket() > sisaKuota[j - 1].sisa_tiket()) {
                    // sisaKuota[i] = new InnerKereta();
                    InnerKereta Temp = sisaKuota[j];
                    sisaKuota[j] = sisaKuota[j - 1];
                    sisaKuota[j - 1] = Temp;
                }
            }
        }
        System.out.print("\nKereta yang masih belum memenuhi kuota urut secara DESC");
        for (int i = 0; i < sisaKuota.length; i++) {
            sisaKuota[i].tampilKuota();
        }
    }
}
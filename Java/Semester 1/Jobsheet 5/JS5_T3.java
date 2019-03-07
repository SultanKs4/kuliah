import java.util.Scanner;

public class JS5_T3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        int nomorMember, jumlahBarang, hargaBarang, totalHarga;
        float diskon1 = 0.15f, diskon2 = 0.3f, potongHarga, finalHarga;
        char tanyaMember;

        System.out.print("Masukkan jumlah barang \t\t : ");
        jumlahBarang = scan.nextInt();
        System.out.print("Masukkan harga barang \t\t : ");
        hargaBarang = scan.nextInt();
        System.out.print("Apakah anda seorang member?(Y/N) : ");
        tanyaMember = scanStr.next().charAt(0);

        totalHarga = jumlahBarang * hargaBarang;

        if (tanyaMember == 'Y') {
            System.out.print("Masukkan nomor member \t\t : ");
            nomorMember = scan.nextInt();
            if (nomorMember > 1) {
                if (jumlahBarang <= 10) {
                    System.out.print("Total Harga yang harus dibayar \t : " + totalHarga);
                } else if (jumlahBarang >= 11 && jumlahBarang <= 30) {
                    potongHarga = totalHarga * diskon1;
                    finalHarga = totalHarga - potongHarga;
                    System.out.println("Total Harga sebelum diskon \t : " + totalHarga);
                    System.out.println("Diskon yang didapat adalah 15%\t : " + potongHarga);
                    System.out.println("Total Harga setelah diskon \t : " + finalHarga);
                } else {
                    potongHarga = totalHarga * diskon2;
                    finalHarga = totalHarga - potongHarga;
                    System.out.println("Total Harga sebelum diskon \t : " + totalHarga);
                    System.out.println("Diskon yang didapat adalah 30%\t : " + potongHarga);
                    System.out.println("Total Harga setelah diskon \t : " + finalHarga);
                }
            }
        } else if (tanyaMember == 'N') {
            System.out.print("Total Harga yang harus dibayar \t : " + totalHarga);
        } else
            System.out.print("Inputan yang dimasukkan tidak valid!");
    }
}
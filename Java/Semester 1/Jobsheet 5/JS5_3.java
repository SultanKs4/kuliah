import java.util.Scanner;

public class JS5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nomorMember, member, jumlahBarang, hargaBarang, totalHarga;
        float pajak1 = 0.15f, pajak2 = 0.3f, potongHarga, finalHarga;

        member = 1841720019;

        System.out.print("Masukkan nomor member (10 Digit) : ");
        nomorMember = scan.nextInt();

        if (nomorMember == member) {
            System.out.print("Masukkan jumlah barang \t\t : ");
            jumlahBarang = scan.nextInt();
            System.out.print("Masukkan harga barang \t\t : ");
            hargaBarang = scan.nextInt();
            totalHarga = jumlahBarang * hargaBarang;
            if (jumlahBarang <= 10) {
                System.out.print("Total Harga yang harus dibayar \t : " + totalHarga);
            } else if (jumlahBarang >= 11 && jumlahBarang <= 30) {
                potongHarga = totalHarga * pajak1;
                finalHarga = totalHarga - potongHarga;
                System.out.println("Total Harga sebelum diskon \t : " + totalHarga);
                System.out.println("Diskon yang didapat adalah 15%\t : " + potongHarga);
                System.out.println("Total Harga setelah diskon \t : " + finalHarga);
            } else {
                potongHarga = totalHarga * pajak2;
                finalHarga = totalHarga - potongHarga;
                System.out.println("Total Harga sebelum diskon \t : " + totalHarga);
                System.out.println("Diskon yang didapat adalah 30%\t : " + potongHarga);
                System.out.println("Total Harga setelah diskon \t : " + finalHarga);
            }
        } else
            System.out.print("Nomor member tidak terdaftar!");
    }
}
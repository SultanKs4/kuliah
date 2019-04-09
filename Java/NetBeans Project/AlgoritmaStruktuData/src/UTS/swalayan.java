package UTS;

/**
 * @author Sultan
 * @see swalayan
 */
public class swalayan {
    int kode_barang, jumlah_barang_toko, stok_barang_gudang;
    String nama_barang;

    public void tampil() {
        System.out.println("\n======================");
        System.out.println("Kode Barang \t\t: " + kode_barang);
        System.out.println("Nama Barang \t\t: " + nama_barang);
        System.out.println("Jumlah Barang di Toko \t: " + jumlah_barang_toko);
        System.out.println("Stok Barang di Gudang \t: " + stok_barang_gudang);
        System.out.println("======================");
    }
}
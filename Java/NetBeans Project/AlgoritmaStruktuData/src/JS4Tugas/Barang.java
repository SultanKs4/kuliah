package JS4Tugas;

/**
 *
 * @author Sultan
 */
public class Barang {
    String nama;
    int jumlah, hargaSatuan;

    public Barang(String n, int j, int hs) {
        nama = n;
        jumlah = j;
        hargaSatuan = hs;
    }

    public void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga Satuan : " + hargaSatuan);
        System.out.println("Harga Total : " + hitungHargaTotal());
    }

    public int hitungHargaTotal() {
        return jumlah * hargaSatuan;
    }
}

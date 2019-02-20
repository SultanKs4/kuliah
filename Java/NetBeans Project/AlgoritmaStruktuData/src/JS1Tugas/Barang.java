package JS1Tugas;

/**
 *
 * @author Sultan
 */
public class Barang {
    public String nama;
    public int hargaSatuan, jumlah;

    public int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    public int hitungDiskon() {
        int diskon;
        if (hitungHargaTotal() > 100000) {
            diskon = hitungHargaTotal() * 10 / 100;
        } else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            diskon = hitungHargaTotal() * 5 / 100;
        } else
            diskon = hitungHargaTotal();

        return diskon;
    }

    public int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }
}

package JS5Tugas;

/**
 * @author Sultan Barang
 */
public class Barang {
    int noBarang, stok, harga;
    String nama;

    public void output() {
        System.out.println("No. Barang\t: " + noBarang);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Stok\t\t: " + stok);
        System.out.println("Harga\t\t: " + harga);
        System.out.println("-----------------------------");
    }
}
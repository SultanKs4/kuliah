package Queue;

/**
 * @author Sultan
 * @see Nasabah
 */
public class Nasabah {
    String noRekening, nama;

    Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }

    public void print() {
        System.out.println("No. Rekening : " + noRekening);
        System.out.println("Nama : " + nama + "\n");
    }
}
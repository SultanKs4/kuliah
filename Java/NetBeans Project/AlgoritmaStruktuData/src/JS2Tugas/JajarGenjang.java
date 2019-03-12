package JS2Tugas;

/**
 *
 * @author Sultan
 */
public class JajarGenjang {
    public int tinggi, panjang, sisimiring;

    public int hitungLuas() {
        return panjang * tinggi;
    }

    public int hitungKeliling() {
        return 2 * (panjang + sisimiring);
    }
}

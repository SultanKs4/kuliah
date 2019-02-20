/**
 *
 * @author Sultan
 */
public class Segitiga {
    public int alas, tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas * tinggi / 2;
    }

    public int hitungKeliling() {
        int aSec = alas / 2;
        int aMin = aSec * aSec;
        int tHor = tinggi * tinggi;
        float hasil = aMin + tHor;
        int sisi = (int) Math.sqrt(hasil);
        return sisi + alas + tinggi;
    }
}

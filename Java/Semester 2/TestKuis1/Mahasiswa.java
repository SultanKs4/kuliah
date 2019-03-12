import java.util.Scanner;

/**
 * 
 * @author Sultan Mahasiswa
 */
public class Mahasiswa {
    public static String nama, text;
    public static float nilaikuis, nilaiuts, nilaiuas;
    public static Scanner scanLine = new Scanner(System.in);
    public static Scanner scanFloat = new Scanner(System.in);
    public static Mahasiswa mhsObj = new Mahasiswa();

    public static void main(String[] args) {
        input();
        output();
    }

    public static void input() {
        System.out.print("Nama Mahasiswa : ");
        nama = scanLine.nextLine();
        System.out.print("Nilai Kuis : ");
        nilaikuis = scanFloat.nextFloat();
        System.out.print("Nilai UTS : ");
        nilaiuts = scanFloat.nextFloat();
        System.out.print("Nilai UAS : ");
        nilaiuas = scanFloat.nextFloat();
    }

    public float nilaiakhir() {
        return (0.2f * nilaikuis) + (0.4f * nilaiuts) + (0.4f * nilaiuas);
    }

    public char predikat() {
        if (nilaiakhir() <= 100 && nilaiakhir() >= 80) {
            return 'A';
        } else if (nilaiakhir() < 80 && nilaiakhir() >= 50) {
            return 'B';
        } else
            return 'C';
    }

    public void predikatToText() {
        if (predikat() == 'A') {
            text = "Baik";
        } else if (predikat() == 'B') {
            text = "Cukup";
        } else
            text = "Kurang";
    }

    public static void output() {
        mhsObj.predikat();
        mhsObj.predikatToText();
        System.out.println("Nama Mahasiswa : " + nama + "\nNilai Kuis : " + nilaikuis + ", nilai UTS : " + nilaiuts
                + ", nilai UAS : " + nilaiuas);
        System.out.println("Dengan bobot nilai Kuis 20%, nilai UTS 40%, nilai UAS 40%");
        System.out.println("Dengan nilai akhir : " + mhsObj.nilaiakhir() + " \nAnda mendapatkan Predikat : " + text);
    }
}
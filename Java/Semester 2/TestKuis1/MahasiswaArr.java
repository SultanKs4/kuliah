import java.util.Scanner;

/**
 * 
 * @author Sultan Mahasiswa
 */
public class MahasiswaArr {
    public static String nama, text, namaMin, namaMax;
    public static float nilaikuis, nilaiuts, nilaiuas, min, max;
    public static Scanner scanLine = new Scanner(System.in);
    public static Scanner scanFloat = new Scanner(System.in);
    public static MahasiswaArr mhsObj = new MahasiswaArr();
    public static String[] namaArr = new String[5];
    public static String[] textArr = new String[5];
    public static float[] nilaikuisArr = new float[5];
    public static float[] nilaiutsArr = new float[5];
    public static float[] nilaiuasArr = new float[5];
    public static float[] nilaiAkhirArr = new float[5];
    public static char[] predikatArr = new char[5];

    public static void main(String[] args) {
        input();
        output();
    }

    public static void input() {
        for (int i = 0; i < namaArr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama Mahasiswa : ");
            namaArr[i] = scanLine.nextLine();
            System.out.print("Nilai Kuis : ");
            nilaikuisArr[i] = scanFloat.nextFloat();
            System.out.print("Nilai UTS : ");
            nilaiutsArr[i] = scanFloat.nextFloat();
            System.out.print("Nilai UAS : ");
            nilaiuasArr[i] = scanFloat.nextFloat();
            System.out.println();
        }
    }

    public float nilaiakhir() {
        for (int i = 0; i < nilaikuisArr.length; i++) {
            nilaiAkhirArr[i] = (0.2f * nilaikuisArr[i]) + (0.4f * nilaiutsArr[i]) + (0.4f * nilaiuasArr[i]);
        }
        return 0f;
    }

    public char predikat() {
        for (int i = 0; i < nilaiAkhirArr.length; i++) {
            if (nilaiAkhirArr[i] <= 100 && nilaiAkhirArr[i] >= 80) {
                predikatArr[i] = 'A';
            } else if (nilaiAkhirArr[i] < 80 && nilaiAkhirArr[i] >= 50) {
                predikatArr[i] = 'B';
            } else
                predikatArr[i] = 'C';
        }
        return 'A';
    }

    public void predikatToText() {
        for (int i = 0; i < textArr.length; i++) {
            if (predikatArr[i] == 'A') {
                textArr[i] = "Baik";
            } else if (predikatArr[i] == 'B') {
                textArr[i] = "Cukup";
            } else
                textArr[i] = "Kurang";
        }
    }

    public void minMaxNilaiAkhir() {
        min = nilaiAkhirArr[0];
        namaMin = namaArr[0];
        max = nilaiAkhirArr[0];
        namaMax = namaArr[0];
        for (int i = 0; i < nilaiAkhirArr.length; i++) {
            if (max < nilaiAkhirArr[i]) {
                max = nilaiAkhirArr[i];
                namaMax = namaArr[i];
            } else if (min > nilaiAkhirArr[i]) {
                min = nilaiAkhirArr[i];
                namaMin = namaArr[i];
            }
        }
    }

    public static void output() {
        mhsObj.nilaiakhir();
        mhsObj.predikat();
        mhsObj.predikatToText();
        mhsObj.minMaxNilaiAkhir();
        for (int i = 0; i < namaArr.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama Mahasiswa : " + namaArr[i] + "\nNilai Kuis : " + nilaikuisArr[i] + ", nilai UTS : "
                    + nilaiutsArr[i] + ", nilai UAS : " + nilaiuasArr[i]);
            System.out.println("Dengan bobot nilai Kuis 20%, nilai UTS 40%, nilai UAS 40%");
            System.out.println(
                    "Dengan nilai akhir : " + nilaiAkhirArr[i] + " \nAnda mendapatkan Predikat : " + textArr[i]);
            System.out.println();
        }
        System.out.println("Pencarian Tertinggi & Terendah menggunakan metode Brute Force");
        System.out.println("Nilai Akhir Tertinggi : " + max + ", A.N : " + namaMax);
        System.out.println("Nilai Akhir Terendah : " + min + ", A.N : " + namaMin);
    }
}
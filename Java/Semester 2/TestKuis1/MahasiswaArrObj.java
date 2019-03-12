import java.util.Scanner;

/**
 * 
 * @author Sultan Mahasiswa
 */
public class MahasiswaArrObj {
    String nama, text, minNama, maxNama;
    float nilaikuis, nilaiuts, nilaiuas, nilaiakhir;
    public static Scanner scanLine = new Scanner(System.in);
    public static Scanner scanFloat = new Scanner(System.in);
    MahasiswaArrObj[] mhsObjArr = new MahasiswaArrObj[5];

    public static void main(String[] args) {
        MahasiswaArrObj mhsObj = new MahasiswaArrObj();
        mhsObj.input();
        mhsObj.output();
    }

    public void input() {
        for (int i = 0; i < mhsObjArr.length; i++) {
            mhsObjArr[i] = new MahasiswaArrObj();
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama Mahasiswa : ");
            mhsObjArr[i].nama = scanLine.nextLine();
            System.out.print("Nilai Kuis : ");
            mhsObjArr[i].nilaikuis = scanFloat.nextFloat();
            System.out.print("Nilai UTS : ");
            mhsObjArr[i].nilaiuts = scanFloat.nextFloat();
            System.out.print("Nilai UAS : ");
            mhsObjArr[i].nilaiuas = scanFloat.nextFloat();
        }
    }

    public float nilaiakhir() {
        return (0.2f * nilaikuis) + (0.4f * nilaiuts) + (0.4f * nilaiuas);
    }

    public char predikat(float nilaiakhir) {
        if (nilaiakhir <= 100 && nilaiakhir >= 80) {
            return 'A';
        } else if (nilaiakhir < 80 && nilaiakhir >= 50) {
            return 'B';
        } else
            return 'C';
    }

    public void predikatToText(char predikat) {
        if (predikat == 'A') {
            text = "Baik";
        } else if (predikat == 'B') {
            text = "Cukup";
        } else
            text = "Kurang";
    }

    public float min() {
        float min = mhsObjArr[0].nilaiakhir();
        for (int i = 0; i < mhsObjArr.length; i++) {
            if (min > mhsObjArr[i].nilaiakhir()) {
                min = mhsObjArr[i].nilaiakhir();
                minNama = mhsObjArr[i].nama;
            }
        }
        return min;
    }

    public float max() {
        float max = mhsObjArr[0].nilaiakhir();
        for (int i = 0; i < mhsObjArr.length; i++) {
            if (max < mhsObjArr[i].nilaiakhir()) {
                max = mhsObjArr[i].nilaiakhir();
                maxNama = mhsObjArr[i].nama;
            }
        }
        return max;
    }

    public void output() {
        for (int i = 0; i < mhsObjArr.length; i++) {
            mhsObjArr[i].predikatToText(mhsObjArr[i].predikat(mhsObjArr[i].nilaiakhir()));
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama Mahasiswa : " + mhsObjArr[i].nama + "\nNilai Kuis : " + mhsObjArr[i].nilaikuis
                    + ", nilai UTS : " + mhsObjArr[i].nilaiuts + ", nilai UAS : " + mhsObjArr[i].nilaiuas);
            System.out.println("Dengan bobot nilai Kuis 20%, nilai UTS 40%, nilai UAS 40%");
            System.out.println("Dengan nilai akhir : " + mhsObjArr[i].nilaiakhir() + " \nAnda mendapatkan Predikat : "
                    + mhsObjArr[i].text);
        }
        System.out.println("\nPencarian nilai tertinggi & terendah menggunakan metode Brute Force");
        System.out.println("Nilai Akhir tertinggi : " + max() + ", A.N : " + maxNama);
        System.out.println("Nilai Akhir terendah : " + min() + ", A.N : " + minNama);
    }
}
package Kuis1;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class Pegawai {
    String nama, minNama, maxNama;
    double gajiPokok;
    int jamketerlambatan, jamlembur, min, max;
    public static Scanner scanLine = new Scanner(System.in);
    public static Scanner scanDoub = new Scanner(System.in);
    public static Scanner scanInt = new Scanner(System.in);
    Pegawai[] pgwObjArr = new Pegawai[5];

    public static void main(String[] args) {
        Pegawai pgwObj = new Pegawai();
        pgwObj.input();
        pgwObj.output();
    }

    public void input() {
        for (int i = 0; i < pgwObjArr.length; i++) {
            pgwObjArr[i] = new Pegawai();
            System.out.println("Pegawai ke-" + (i + 1));
            System.out.print("Masukkan Nama Pegawai : ");
            pgwObjArr[i].nama = scanLine.nextLine();
            System.out.print("Masukkan jumlah Gaji Pokok : ");
            pgwObjArr[i].gajiPokok = scanDoub.nextDouble();
            System.out.print("Masukkan jumlah Jam Lembur : ");
            pgwObjArr[i].jamlembur = scanInt.nextInt();
            System.out.print("Masukkan jumlah Jam Keterlambatan : ");
            pgwObjArr[i].jamketerlambatan = scanInt.nextInt();
            System.out.println();
        }
    }

    public double totalgaji() {
        return gajiPokok + (jamlembur * 10000) - (jamketerlambatan * 5000);
    }

    public char predikat() {
        if (jamlembur - jamketerlambatan >= 8) {
            return 'B';
        } else if (jamlembur - jamketerlambatan > 3 && jamlembur - jamketerlambatan < 8) {
            return 'C';
        } else
            return 'K';
    }

    public void minMaxBF() {
        min = pgwObjArr[0].jamlembur - pgwObjArr[0].jamketerlambatan;
        minNama = pgwObjArr[0].nama;
        max = pgwObjArr[0].jamlembur - pgwObjArr[0].jamketerlambatan;
        maxNama = pgwObjArr[0].nama;
        for (int i = 0; i < pgwObjArr.length; i++) {
            if (max < pgwObjArr[i].jamlembur - pgwObjArr[i].jamketerlambatan) {
                max = pgwObjArr[i].jamlembur - pgwObjArr[i].jamketerlambatan;
                maxNama = pgwObjArr[i].nama;
            } else if (min > pgwObjArr[i].jamlembur - pgwObjArr[i].jamketerlambatan) {
                min = pgwObjArr[i].jamlembur - pgwObjArr[i].jamketerlambatan;
                minNama = pgwObjArr[i].nama;
            }
        }
    }

    public void output() {
        for (int i = 0; i < pgwObjArr.length; i++) {
            System.out.println("Pegawai ke-" + (i + 1));
            System.out.println("Nama Pegawai : " + pgwObjArr[i].nama);
            System.out.println("jumlah Gaji Pokok : " + pgwObjArr[i].gajiPokok);
            System.out.println("Jumlah Jam Lembur : " + pgwObjArr[i].jamlembur);
            System.out.println("jumlah Jam Keterlambatan : " + pgwObjArr[i].jamketerlambatan);
            System.out.println("Jumlah Total Gaji : " + pgwObjArr[i].totalgaji());
            System.out.println("Predikat Pegawai : " + pgwObjArr[i].predikat());
            System.out.println();
        }
        minMaxBF();
        System.out.println("Nilai Predikat Terendah adalah : " + min + ", A.N : " + minNama);
        System.out.println("Nilai Predikat Tertinggi adalah : " + max + ", A.N : " + maxNama);
    }
}

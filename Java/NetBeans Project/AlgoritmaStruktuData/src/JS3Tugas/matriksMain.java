package JS3Tugas;

import java.util.Scanner;

public class matriksMain {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        inputMatriks();
        outputMatriks();
        outputPerkalianBF();
        outputPerkalianDC();
    }

    public static void inputMatriks() {
        System.out.println(
                "Perkalian matriks Ordo 4x4\n* Isi matriks menggunakan pemisah spasi hingga baris terakhir matriks, contoh : \n1 2 3 4\n1 2 3 4");
        for (int i = 1; i < 3; i++) {
            System.out.println("\nSilahkan masukkan angka Matriks ke-" + i + " yang diinginkan : ");
            if (i == 1) {
                inputloop(matriks.matriksArr1);
            } else
                inputloop(matriks.matriksArr2);
        }
    }

    public static void inputloop(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
    }

    public static void outputMatriks() {
        System.out.println("\nHasil Input Matriks : ");
        System.out.println("Matriks ke-1\t|\tMatriks ke-2");
        for (int i = 0; i < matriks.matriksArr1.length; i++) {
            for (int j = 0; j < matriks.matriksArr1[i].length; j++) {
                System.out.print(matriks.matriksArr1[i][j] + " ");
            }
            System.out.print("\t|\t");
            for (int k = 0; k < matriks.matriksArr2[i].length; k++) {
                System.out.print(matriks.matriksArr2[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void outputPerkalianBF() {
        kaliMatriksBF.proses();
        System.out.println("\nHasil Perkalian Brute Force");
        for (int i = 0; i < kaliMatriksBF.hasilKali.length; i++) {
            for (int j = 0; j < kaliMatriksBF.hasilKali[i].length; j++) {
                System.out.print(kaliMatriksBF.hasilKali[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void outputPerkalianDC() {
        System.out.println("\nMatriks sebelum di gabung");
        kaliMatriksDC kMDCbEnd = new kaliMatriksDC(matriks.matriksArr1, matriks.matriksArr2,
                matriks.matriksArr1.length);
        kMDCbEnd.join();
        System.out.println("Matriks DC 1\t|\tMatriks DC 2");
        for (int i = 0; i < kaliMatriksDC.tempArrDC.length; i++) {
            for (int j = 0; j < kaliMatriksDC.tempArrDC[i].length; j++) {
                System.out.print(kaliMatriksDC.tempArrDC[i][j] + " ");
            }
            System.out.print("\t|\t");
            for (int j = 0; j < kaliMatriksDC.tempArrDC2[i].length; j++) {
                System.out.print(kaliMatriksDC.tempArrDC2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nHasil Perkalian Divide Conquer : ");
        for (int i = 0; i < kaliMatriksDC.hasilKaliDC.length; i++) {
            for (int j = 0; j < kaliMatriksDC.hasilKaliDC[i].length; j++) {
                System.out.print(kaliMatriksDC.hasilKaliDC[i][j] + " ");
            }
            System.out.println();
        }
    }
}

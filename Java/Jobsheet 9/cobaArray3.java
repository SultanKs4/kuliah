import java.util.Scanner;

public class cobaArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int barisA, kolomA;
        System.out.print("Masukkan Size Baris Matriks A : ");
        barisA = sc.nextInt();
        System.out.print("Masukkan Size Kolom Matriks A : ");
        kolomA = sc.nextInt();
        int[][] array = new int[barisA][kolomA];

        System.out.println("Input Elemen Array : ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("Matrik A[" + i + "][" + j + "]" + ": ");
                array[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int i = 0, j = 0;
        int max = array[0][0];
        int min = Integer.MAX_VALUE;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Paling besar semuanya adalah " + max);
        System.out.println("Paling kecil semuanya adalah " + min);

        for (i = 0; i < array.length; i++) {
            max = array[0][0];
            min = Integer.MAX_VALUE;
            for (j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.println("Pada baris ke-" + i + " paling besar adalah " + max);
            System.out.println("Pada baris ke-" + i + " paling kecil adalah " + min);
        }
    }
}
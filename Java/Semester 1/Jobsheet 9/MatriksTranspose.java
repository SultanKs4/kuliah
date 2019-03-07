import java.util.Scanner;
public class MatriksTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int barisA, kolomA;
        System.out.print("Masukkan Size Baris Matriks : ");
        barisA = input.nextInt();
        System.out.print("Masukkan Size Kolom Matriks : ");
        kolomA = input.nextInt();
        int[][] array = new int[barisA][kolomA];

        System.out.println("Input Elemen Matriks : ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("Matrik A[" + i + "][" + j + "]" + ": ");
                array[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Hasil output Matriksnya adalah (normal) : ");
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Hasil output Matriksnya adalah (transpose) : ");
        for (int i = 0; i < kolomA; i++) {
            for (int j = 0; j < barisA; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class tran {

    public static void main(String args[]) {

        int i, j;
        Scanner hmm = new Scanner(System.in);
        System.out.print("Masukan jumlah Baris : ");
        int n = hmm.nextInt();
        System.out.print("Masukan Jumlah kolom : ");
        int k = hmm.nextInt();
        int array[][] = new int[n][k];
        System.out.println("Masukan Nilai :");
        for (i = 0; i < n; i++) {
            for (j = 0; j < k; j++) {
                System.out.print("Array [" + i + "][" + j + "] : ");
                array[i][j] = hmm.nextInt();
            }
            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println("Matrix sebelum Transpose ");

        for (i = 0; i < n; i++) {
            for (j = 0; j < k; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("------------------------");
        System.out.println("Matrix Sesudah Transpose ");

        for (i = 0; i < k; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}
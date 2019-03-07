import java.util.Scanner;

class tugas4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, i;
        int[][] angka = new int[3][5];
        int[] max = new int[3];
        int[] posisi = new int[3];
        int[] hasil = new int[3];
        int temp, j, k;

        for (i = 0; i < angka.length; i++) {
            for (n = 0; n < angka[0].length; n++) {
                System.out.print("Array [" + i + "][" + n + "] : ");
                angka[i][n] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("-----------------------");

        for (i = 0; i < angka.length; i++) {
            temp = angka[0][0];
            j = 0;
            for (n = 0; n < angka[i].length; n++) {
                if (angka[i][n] > temp) {
                    temp = angka[i][n];
                    j = n;
                }
            }
            posisi[i] = j;
            max[i] = temp;
        }
        System.out.println("Matrix");
        for (i = 0; i < angka.length; i++) {
            for (n = 0; n < angka[i].length; n++) {
                System.out.print(angka[i][n] + "  ");
            }
            System.out.println();
        }
        for (k = 0; k < max.length; k++) {
            for (j = 0, i = 0; i < angka.length; i++) {
                if (max[k] > angka[i][posisi[k]]) {
                    j++;
                } else {

                }

                if (j == 2) {
                    hasil[k] = max[k];
                }
            }
        }
        System.out.println("Nilai Terbesar Baris & Kolom : ");
        for (i = 0; i < hasil.length; i++) {
            if (hasil[i] > 0)
                System.out.println(hasil[i]);
        }
    }
}
import java.util.Scanner;

class kondisi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan jumlah baris : ");
        int n = scan.nextInt();
        System.out.print("Masukan jumlah kolom : ");
        int i = scan.nextInt();
        int[][] angka = new int[n][i];
        int temp, jumlah;

        for (i = 0; i < angka.length; i++) {
            for (n = 0; n < angka[0].length; n++) {
                System.out.print("Array [" + i + "][" + n + "] : ");
                angka[i][n] = scan.nextInt();
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        System.out.println("1. Nilai Mix");
        System.out.println("2. Nilai Mix & jumlahnya");
        System.out.println("3. Kondisi Array");
        System.out.print("Masukan pilihan : ");
        i = scan.nextInt();
        System.out.println("-----------------------");
        if (i == 1) {
            temp = angka[0][0];
            for (i = 0; i < angka.length; i++) {
                for (n = 0; n < angka[0].length; n++) {
                    if (angka[i][n] < temp) {
                        temp = angka[i][n];
                    }
                }
            }
            System.out.println("Nilai Terkecil : " + temp);
        } else if (i == 2) {
            temp = angka[0][0];
            for (i = 0; i < angka.length; i++) {
                for (n = 0; n < angka[0].length; n++) {
                    if (angka[i][n] < temp) {
                        temp = angka[i][n];
                    }
                }
            }
            System.out.println("Nilai terkecil : " + temp + " ");
            jumlah = 0;
            System.out.print("Berada di posisi : ");
            for (i = 0; i < angka.length; i++) {
                for (n = 0; n < angka[0].length; n++) {
                    if (temp == angka[i][n]) {
                        jumlah++;
                        System.out.print("[" + i + "][" + n + "]  ");
                    }
                }
            }
            System.out.println();
            System.out.println("Jumlahnya : " + jumlah);

        } else if (i == 3) {

        } else
            System.out.println("Error");

    }
}
import java.util.Scanner;

class tugas3 {
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
        System.out.println("-------------------------MENU-------------------------");
        System.out.println("1. Nilai Elemen Array Terkecil ");
        System.out.println("2. Nilai Elemen Array Terkecil, jumlah, dan lokasinya");
        System.out.println("3. Kondisi Array tampilkan 'Ada' jika ada nilai 50 ");
        System.out.print("Masukan pilihan : ");
        i = scan.nextInt();
        System.out.println("------------------------------------------------------");
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
            System.out.print("Berada di      : ");
            for (i = 0; i < angka.length; i++) {
                for (n = 0; n < angka[0].length; n++) {
                    if (temp == angka[i][n]) {
                        jumlah++;
                        System.out.print("[" + i + "][" + n + "]  ");
                    }
                }
            }
            System.out.println();
            System.out.println("Jumlahnya      : " + jumlah);

        } else if (i == 3) {
            jumlah = 0;
            for (i = 0; i < angka.length; i++) {
                for (n = 0; n < angka[0].length; n++) {
                    if (50 == angka[i][n]) {
                        jumlah++;
                    }
                }
            }
            if (jumlah > 0) {
                System.out.println("Ada");
            } else
                System.err.println("Tidak Ada");

        } else
            System.out.println("Error");

    }
}
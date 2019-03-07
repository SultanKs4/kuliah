import java.util.Scanner;

class Max {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, j, temp;
        int[][] angka = new int[3][4];

        for (i = 0; i < angka.length; i++) {
            for (j = 0; j < angka[0].length; j++) {
                System.out.print("Masukan Elemen ke-" + i + ": ");
                angka[i][j] = scan.nextInt();
            }
        }

        temp = angka[0][0];
        for (i = 0; i < angka.length; i++) {
            for (j = 0; j < angka[0].length; j++) {
                if (angka[i][j] > temp) {
                    temp = angka[i][j];
                }
            }
        }
        System.out.println("Nilai terbesar : " + temp);

    }
}
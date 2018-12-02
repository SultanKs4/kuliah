import java.util.Scanner;

class total {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i, j, temp;
        int[][] angka = new int[4][5];

        System.out.println("Masukan Nilai Elemen Array");
        for (i = 0; i < angka.length; i++) {
            for (j = 0; j < angka[0].length; j++) {

                System.out.print("Array-" + i + "-" + j + ": ");
                angka[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        temp = 0;
        for (i = 0; i < angka.length; i++) {
            for (j = 0; j < angka[0].length; j++) {
                temp += angka[i][j];
            }
        }
        System.out.println("Total isi array : " + temp);

    }
}
import java.util.Scanner;

public class Test2 {
    static Scanner scan = new Scanner(System.in);
    static char[][] array;

    public static void main(String[] args) {
        input();
    }

    public static void input() {
        System.out.print("Masukkan panjang array : ");
        int n = scan.nextInt();
        array = new char[n][n];
        proses();
    }

    public static void proses() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i <= j) {
                    array[i][j] = '*';
                    System.out.print(array[i][j]);
                } else if (i > j) {
                    array[i][j] = '-';
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
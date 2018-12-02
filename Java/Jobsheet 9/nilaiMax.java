import java.util.Scanner;
public class nilaiMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                array[i][j] = scan.nextInt();
            }
            System.out.println("------------------------");
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Paling besar semuanya adalah " + max);
    }
}
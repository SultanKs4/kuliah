import java.util.Scanner;
public class totalIsiArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = new int[4][5];
        int output = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                array[i][j] = scan.nextInt();
                output += array[i][j];
            }
            System.out.println("------------------------");
        }
        System.out.println("Total isi Array semuanya adalah " + output);
    }
}
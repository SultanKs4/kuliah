import java.util.Arrays;
import java.util.Scanner;

public class IsengArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert Line Array : ");
        int line = scan.nextInt();
        System.out.print("Insert Column Array : ");
        int column = scan.nextInt();
        int[][] array = new int[line][column];

        for (int ln = 0; ln < array.length; ln++) {
            for (int col = 0; col < array[ln].length; col++) {
                System.out.print("Insert Index Array Line " + ln + " Column " + col + " : ");
                array[ln][col] = scan.nextInt();
            }
        }
        for (int ln = 0; ln < array.length; ln++) {
            for (int col = 0; col < array[ln].length; col++) {
                Arrays.sort(array[ln]);
                System.out.print(array[ln][col] + " ");
            }
            System.out.println();
        }
        if (scan != null) {
            scan.close();
        }
    }
}
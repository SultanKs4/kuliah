import java.util.Scanner;

public class Arr3While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nilai = new int[2][3];
        int i = 0;
        int j;
        while (i < 2) {
            j = 0;
            while (j < 3) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                nilai[i][j] = input.nextInt();
                j++;
            }
            i++;
            System.out.println("------------------------");
        }
        i = 0;
        while (i < 2) {
            j = 0;
            while (j < 3) {
                System.out.print(nilai[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
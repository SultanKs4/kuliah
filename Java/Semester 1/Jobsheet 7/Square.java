import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int M = 4, i;

        for (int iOuter = 1; iOuter <= N; iOuter++) {

            for (i = 1; i <= N; i++) {
                System.out.print("*");
            }
            System.out.print(i);
            System.out.print("\t");

            for (i = 1; i <= M; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
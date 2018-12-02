import java.util.Scanner;

public class Max3 {
    static Scanner scan = new Scanner(System.in);
    static int bil1, bil2, bil3;

    public static void main(String[] args) {
        input();
        TampilMax3(Max3(bil1, bil2, bil3));
    }

    public static void input() {
        System.out.print("Masukkan nilai bilangan ke-1 : ");
        bil1 = scan.nextInt();
        System.out.print("Masukkan nilai bilangan ke-2 : ");
        bil2 = scan.nextInt();
        System.out.print("Masukkan nilai bilangan ke-3 : ");
        bil3 = scan.nextInt();
    }

    public static int Max3(int bil1, int bil2, int bil3) {
        int max = bil1;
        if (bil2 > max) {
            max = bil2;
        }
        if (bil3 > max) {
            max = bil3;
        }
        return max;
    }

    public static void TampilMax3(int max) {
        System.out.println("Nilai terbesarnya adalah : " + max);
    }
}
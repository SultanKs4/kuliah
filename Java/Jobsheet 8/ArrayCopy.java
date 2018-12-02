import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = new int[4];
        int[] arr2 = new int[4];

        System.out.println("Array pertama");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Masukkan angka pada Array 1 Index ke-" + i + ": ");
            arr1[i] = scan.nextInt();
        }

        System.out.println("---------------------------");
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        System.out.println("Array kedua ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Di Array 2 Index ke-" + i + ": " + arr2[i]);
        }
        if (scan != null) {
            scan.close();
        }
    }
}
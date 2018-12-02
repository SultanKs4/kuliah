import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Masukkan angka pada Array 1 Index ke-" + i + " : ");
            arr1[i] = scan.nextInt();
        }
        System.out.println("---------------------------");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Masukkan angka pada Array 2 Index ke-" + i + " : ");
            arr2[i] = scan.nextInt();
        }
        System.out.println("---------------------------");
        for (int i = 0; i < arr1.length; i++) {
            int output = arr1[i] + arr2[i];
            System.out.println("Hasil Index ke-" + i + " adalah : " + output);
        }
        if (scan != null) {
            scan.close();
        }
    }
}
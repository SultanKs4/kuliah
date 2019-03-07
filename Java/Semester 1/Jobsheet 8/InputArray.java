import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] bilangan = new int[7];

        System.out.println("Isi nya ada " + bilangan.length);
        for (int alpha = 0; alpha < bilangan.length; alpha++) {
            System.out.print("Masukkan Bilangan ke-" + alpha + ": ");
            bilangan[alpha] = scan.nextInt();
        }

        System.out.println("-----------------------------");

        for (int alpha = 0; alpha < bilangan.length; alpha++) {
            System.out.println("Isi bilangan ke-" + alpha + " adalah : " + bilangan[alpha]);
        }
        if (scan != null) {
            scan.close();
        }
    }
}
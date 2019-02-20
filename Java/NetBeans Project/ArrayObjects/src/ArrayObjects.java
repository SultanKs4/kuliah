/**
 *
 * @author Sultan
 */
import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[0].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[0].lebar = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        }
    }
}

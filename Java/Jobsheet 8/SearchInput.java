import java.util.Scanner;

public class SearchInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen Array : ");
        int inputLength = scan.nextInt();

        int[] angka = new int[inputLength];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Array ke " + i + " : ");
            angka[i] = scan.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        int key = scan.nextInt();
        for (int a = 0; a < angka.length; a++) {
            if (key == angka[a]) {
                System.out.println("Key ada diposisi index ke : " + a);
            }
        }
        if (scan != null) {
            scan.close();
        }
    }
}
package JS3Praktikum;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class faktorialMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        faktorial fakObjek = new faktorial();
        System.out.print("Masukkan jumlah n faktorial : ");
        fakObjek.nilai = sc.nextInt();

        fakObjek.faktorialBF();
        System.out.println("Nilai Faktorial Divide Conquer : " + fakObjek.faktorialDC(fakObjek.nilai));
        if (sc != null) {
            sc.close();
        }
    }
}

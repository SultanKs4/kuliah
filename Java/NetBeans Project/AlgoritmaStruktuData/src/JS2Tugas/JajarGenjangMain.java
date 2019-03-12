package JS2Tugas;

import java.util.Scanner;

/**
 *
 * @author Sultan
 */
public class JajarGenjangMain {
    public static Scanner scanInt = new Scanner(System.in);

    public static void main(String[] args) {
        JajarGenjang[] JG1bEndArr = new JajarGenjang[5];
        for (int i = 0; i < JG1bEndArr.length; i++) {
            JG1bEndArr[i] = new JajarGenjang();
            System.out.print("Tinggi Index ke-" + i + " : ");
            JG1bEndArr[i].tinggi = scanInt.nextInt();
            System.out.print("Panjang Index ke-" + i + " : ");
            JG1bEndArr[i].panjang = scanInt.nextInt();
            System.out.print("Sisi Miring Index ke-" + i + " : ");
            JG1bEndArr[i].sisimiring = scanInt.nextInt();
        }
        for (int i = 0; i < JG1bEndArr.length; i++) {
            System.out.println("Jajar Genjang Array Index ke-" + i + " Luasnya adalah : " + JG1bEndArr[i].hitungLuas()
                    + " & kelilingnya adalah : " + JG1bEndArr[i].hitungKeliling());
        }
    }
}

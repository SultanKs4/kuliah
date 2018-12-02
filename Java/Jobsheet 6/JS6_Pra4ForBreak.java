import java.util.Scanner;

public class JS6_Pra4ForBreak {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        int angka, b;

        System.out.println("========== PROGRAM LOOP DENGAN BREAK ==========");
        for (b = 0; true;) {
            System.out.print("Masukkan angka : ");
            angka = scanInt.nextInt();
            b += angka;
            if (b > 50)
                break;
        }
        System.out.println("Angka berhenti pada jumlah angka : " + b);
    }
}
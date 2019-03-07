import java.util.Scanner;

public class JS6_Pra6DoWhileBreak {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        int angka, b;
        b = 0;

        System.out.println("========== PROGRAM LOOP DENGAN BREAK ==========");
        do {
            System.out.print("Masukkan angka : ");
            angka = scanInt.nextInt();
            b += angka;
            if (b > 50)
                break;
        } while (true);
        System.out.println("Angka berhenti pada jumlah angka : " + b);
    }
}
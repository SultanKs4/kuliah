import java.util.Scanner;

public class JS6_Pra5WhileBreak {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        int angka, b;
        b = 0;

        System.out.println("========== PROGRAM LOOP DENGAN BREAK ==========");
        while (true) {
            System.out.print("Masukkan angka : ");
            angka = scanInt.nextInt();
            b += angka;
            if (b > 50)
                break;
        }
        System.out.println("Angka berhenti pada jumlah angka : " + b);
    }
}
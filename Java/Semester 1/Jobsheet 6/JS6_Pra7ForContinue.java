import java.util.Scanner;

public class JS6_Pra7ForContinue {
    public static void main(String[] args) {
        Scanner scanint = new Scanner(System.in);

        int angka, b, i, count;
        double avg;

        System.out.println("========== PROGRAM LOOP DENGAN CONTINUE ==========");
        b = 0;
        count = 0;
        for (i = 0; i < 5; i++) {
            System.out.print("Masukkan angka : ");
            angka = scanint.nextInt();
            if (angka >= 40)
                continue;
            b += angka;
            count++;
        }
        avg = (double) b / count;
        System.out.printf("Rata-rata angka kurang dari 40 : %.2f", avg);
    }
}
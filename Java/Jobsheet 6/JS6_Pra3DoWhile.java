import java.util.Scanner;

public class JS6_Pra3DoWhile {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        int angka, fac, i;

        System.out.println("========== PROGRAM MENGHITUNG NILAI FAKTORIAL ==========");
        System.out.print("Masukkan suatu angka : ");
        angka = scanInt.nextInt();

        fac = 1;
        i = 1;
        do {
            fac *= i;
            i++;
        } while (i <= angka);
        System.out.println("nilai faktorial angka tersebut adalah : " + fac);
    }
}
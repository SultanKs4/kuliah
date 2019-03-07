import java.util.Scanner;

public class JS6_Pra1For {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        int angka, fac, i;

        System.out.println("========== PROGRAM MENGHITUNG NILAI FAKTORIAL ==========");
        System.out.print("Masukkan suatu angka : ");
        angka = scanInt.nextInt();

        fac = 1;
        for (i = 1; i <= angka; i++) {
            fac *= i;
        }
        System.out.println("nilai faktorial angka tersebut adalah : " + fac);
    }
}
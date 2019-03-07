import java.util.Scanner;

public class tugasPemilihanSultanFor {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        int inputAngka, hitung, outputAngka;

        System.out.print("Masukkan angka : ");
        inputAngka = scanInt.nextInt();
        outputAngka = 68;

        if (inputAngka <= 0) {
            System.out.println("Error");
        } else {
            for (hitung = 1; hitung <= inputAngka; hitung++) {
                if (hitung % 2 == 0) {
                    outputAngka += 2;
                } else if (hitung == 1) {
                    outputAngka = 68;
                } else {
                    outputAngka -= 1;
                }
            }
            if (outputAngka > 90) {
                System.out.println("Error");
            } else {
                System.out.println("Hasil Output adalah : " + (char) outputAngka);
            }
        }

    }
}
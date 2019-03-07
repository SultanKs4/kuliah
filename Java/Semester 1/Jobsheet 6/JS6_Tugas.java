import java.util.Scanner;

public class JS6_Tugas {
    static Scanner scanInt = new Scanner(System.in);
    static int angka, sum, hitung, kuadrat, pilihan, genap, hitungK, odd;

    public static void main(String[] args) {
        menuTugas();

    }

    public static void menuTugas() {
        System.out.println("1. Tugas Jobsheet 6 Sum Genap");
        System.out.println("2. Tugas Jobsheet 6 Sum Kuadrat");
        System.out.println("3. Tugas Jobsheet 6 Odd Digit");
        verifMenu(pilihMenu());
    }

    public static int pilihMenu() {
        System.out.print("Masukkan Pilihan : ");
        pilihan = scanInt.nextInt();
        return pilihan;
    }

    public static void verifMenu(int pilihan) {
        if (pilihan == 1) {
            tugas1SumGenap();
        } else if (pilihan == 2) {
            tugas2SumKuadrat();
        } else if (pilihan == 3) {
            tugas3OddDigit();
        } else {
            System.out.println("Input Salah!");
            menuTugas();
        }
    }

    public static void inputAngka() {
        System.out.print("Masukkan angka : ");
        angka = scanInt.nextInt();
    }

    public static void tugas1SumGenap() {
        inputAngka();
        if (angka <= 0) {
            System.out.println("Error");
        } else {
            for (genap = 1; genap <= angka; genap++) {
                hitung = genap * 2 - 2;
                sum += hitung;
            }
            System.out.println("Total angka genap : " + sum);
        }
    }

    public static void tugas2SumKuadrat() {
        inputAngka();
        if (angka <= 0) {
            System.out.println("Error");
        } else {
            for (hitungK = 1; hitungK <= angka; hitungK++) {
                hitung = hitungK * hitungK;
                kuadrat += hitung;
            }
            System.out.println("Angka : " + kuadrat);
        }
    }

    public static void tugas3OddDigit() {
        inputAngka();
        if (angka <= 0) {
            System.out.println("Error");
        } else {
            while (angka > 0) {
                hitung = angka % 10;
                if (hitung % 2 != 0) {
                    odd += 1;
                }
                angka /= 10;
            }
            System.out.println("Angka Ganjil ada : " + odd);
        }
    }
}
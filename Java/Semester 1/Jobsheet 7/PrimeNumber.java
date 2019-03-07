import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);

        int i, j, k = 0;
        System.out.print("Masukkan angka positif (> 0) : ");
        int n = scanInt.nextInt();
        String primeNumbers = null;
        if (n > 0) {
            for (i = 1; i <= n; i++) {
                int counter = 0;
                for (int num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    // Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println(primeNumbers);
        } else
            System.out.println("Nilai N minimal 1");
    }
}
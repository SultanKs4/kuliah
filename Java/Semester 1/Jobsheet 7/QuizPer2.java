import java.util.Scanner;
import java.util.Random;

public class QuizPer2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < number) {
                    System.out.println("Angka yang Anda masukkan lebih kecil");
                } else if (answer > number) {
                    System.out.println("Angka yang Anda masukkan lebih besar");
                } else
                    success = (answer == number);
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = input.findInLine(".").charAt(0);
            input.nextLine();
        } while (menu == 'y' || menu == 'Y');
    }
}
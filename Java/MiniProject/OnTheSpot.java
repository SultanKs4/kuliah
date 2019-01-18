import java.util.Scanner;

public class OnTheSpot {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        int input, output, cekInput;
        System.out.print("Masukkan Bilangan : ");
        input = scanInt.nextInt();
        cekInput = input % 2;
        if (input == 1) {
            output = input + 1;
            System.out.println("Bilangan Deret ke " + input);
            System.out.println("adalah " + output);
        } else if (cekInput == 0) {
            output = input + 3;
            System.out.println("Bilangan Deret ke " + input);
            System.out.println("adalah " + output);
        } else if (cekInput == 1) {
            output = input + 2;
            System.out.println("Bilangan Deret ke " + input);
            System.out.println("adalah " + output);
        }
    }
}
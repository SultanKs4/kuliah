import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Lampu;

        System.out.print("Input warna lampu : ");
        Lampu = scan.nextLine();

        if ("hijau".equals(Lampu)) {
            System.out.println("Silahkan Jalan!");
        } else if ("kuning".equals(Lampu)) {
            System.out.println("Hati-Hati");
        } else if ("merah".equals(Lampu)) {
            System.out.println("Berhenti!");
        } else
            System.out.println("Inputan salah!");
    }
}
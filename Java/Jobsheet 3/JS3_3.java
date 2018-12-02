import java.util.Scanner;

public class JS3_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int jari, tinggi;
        float volume, phi = 3.14f;

        System.out.print("Jari-Jari \t: ");
        jari = scan.nextInt();
        System.out.print("Tinggi \t\t: ");
        tinggi = scan.nextInt();
        
        volume = phi * jari * jari * tinggi;

        System.out.print("Volume Tabung \t: " + volume);
    }
}
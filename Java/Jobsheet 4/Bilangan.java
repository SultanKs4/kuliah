import java.util.Scanner;

public class Bilangan{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  angka;

		System.out.print("Masukkan angka : ");
		angka = sc.nextInt();

		if(angka % 2 == 0){
			System.out.println("Angka "+ angka +" adalah angka genap");
		}
		else{
			System.out.println("Angka "+ angka +" adalah angka ganjil");
		}
	}
}
import java.util.Scanner;
public class Tugas1{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int bilangan1,bilangan2;

		System.out.println("Aplikasi Pembanding Dua Bilangan");
		System.out.print("Masukkan bilangan 1 : ");
		bilangan1=sc.nextInt();
		System.out.print("Masukkan bilangan 2 : ");
		bilangan2=sc.nextInt();

		if(bilangan1>bilangan2){
			System.out.print("\nbilangan terbesar : "+bilangan1);
		}else{
			System.out.print("\nbilangan terbesar "+bilangan2);
		}
	}
}
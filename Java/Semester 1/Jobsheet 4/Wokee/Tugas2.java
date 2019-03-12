import java.util.Scanner;
public class Tugas2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int umur;

		System.out.print("Masukkan umur Anda :");
		umur=sc.nextInt();

		if(umur>=17){
			System.out.println("Boleh berkendara");
		}else{
			System.out.println("Tidak boleh berkendara");
		}
	}
}
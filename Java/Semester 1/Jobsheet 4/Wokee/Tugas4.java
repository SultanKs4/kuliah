import java.util.Scanner;
public class Tugas4{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		float nilaiUas,nilaiUts;
		

		System.out.println("##Aplikasi Penentu Kelas Berdasarkan Nilai##");
		System.out.println("--------------------------------------------");
		System.out.print("Masukkan nilai UTS : ");
		nilaiUts=sc.nextFloat();
		System.out.print("Masukkan nilai UAS : ");
		nilaiUas=sc.nextFloat();

		if(nilaiUts>90 || nilaiUas==100){
			System.out.println("Anda masuk kelas : A");
		}else{
			System.out.println("Anda masuk kelas : B");
		}
		
	}

}
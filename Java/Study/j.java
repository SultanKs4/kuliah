import java.util.Scanner;
class j{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Masukkan angka :");
		int angka=sc.nextInt();

		for(int i=0;i<angka;i++){
			for(int j=angka-i;j>1;j--){
				System.out.print(" ");
			}
			for(int k=0;k<i+1;k++){
				System.out.print("*");
			}
			for(int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<angka;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=angka-i;k>0;k--){
				System.out.print("*");
			}
			for(int k=angka-i-1;k>0;k--){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
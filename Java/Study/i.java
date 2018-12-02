import java.util.Scanner;
class i{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Masukkan angka untuk baris dan kolom :");
		int input=sc.nextInt();

		for(int i=0;i<input;i++){
			for(int j=input-i;j>1;j--){
				System.out.print( " " );
			}
			for(int k=0;k<i+1;k++){
				System.out.print("*");
			}
			for(int k=0;k<i;k++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=0;i<input;i++){
			for(int j=0;j<i;j++){
				System.out.print( " " );
			}
			for(int k=input-i;k>0;k--){
				System.out.print("*");
			}
			for(int k=input-i-1;k>0;k--){
				System.out.print("*");
			}
			System.out.println("");	
		}
	}
}
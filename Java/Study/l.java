import java.util.Scanner;
class l{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input;

		System.out.print("Masukkan angka untuk baris dan kolom :");
		input=sc.nextInt();

		int arr [][]=new int[input][input];

		for(int i=0;i<input;i++){
			for(int j=0;j<input;j++){
				System.out.print("masukkan index ke [" +i+ "][" +j+ "] :");
				arr[i][j]=sc.nextInt();
			}
			System.out.println("");
		}
		for(int i=0;i<input;i++){
			for(int j=0;j<input;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
	}
}
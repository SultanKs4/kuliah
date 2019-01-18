import java.util.Scanner;

class Hello {  
	public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);    
	int usia;

    System.out.print("Masukkan usia anda: ");    
    usia = sc.nextInt();

    System.out.println("Usia anda: " + usia);  
	} 
}
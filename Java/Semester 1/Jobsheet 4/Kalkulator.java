import java.util.Scanner;

public class Kalkulator{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double angka1, angka2, hasil;
		char operator;

		System.out.print("Masukkan angka pertama \t\t: ");
		angka1=sc.nextDouble();
		System.out.print("Masukkan angka kedua \t\t: ");
		angka2=sc.nextDouble();
		System.out.print("Masukkan operator(+ - * / %) \t: ");
		operator=sc.next().charAt(0);

		switch(operator){
			case '+':
			hasil = angka1 + angka2;
			System.out.print(angka1 + " + " + angka2 + " = " + hasil);
			break;
			case '-':
			hasil = angka1 - angka2;
			System.out.print(angka1 + " - " + angka2 + " = " + hasil);
			break;
			case '*':
			hasil = angka1 * angka2;
			System.out.print(angka1 + " * " + angka2 + " = " + hasil);
			break;
			case '/':
			hasil = angka1 / angka2;
			System.out.print(angka1 + " / " + angka2 + " = " + hasil);
			break;
			case '%':
			hasil = angka1 % angka2;
			System.out.print(angka1 + " % " + angka2 + " = " + hasil);
			break;

			default:
			System.out.print("Operator yang Anda masukkan salah");
		}
	}
}
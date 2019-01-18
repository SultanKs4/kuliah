public class JS6_Perta2_3 {
	public static void main(String[] args) {
		int n = 1892;
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.print(sum);
	}
}
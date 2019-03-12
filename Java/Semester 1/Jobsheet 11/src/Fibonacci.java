import java.util.Scanner;
class Fibonacci{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input jumlah deret Fibonacci: ");
        int jml = sc.nextInt();
        fibonacciIterative(jml);
        System.out.print(fibonacci(jml));	
    }
    static int fibonacci(int fib){
	if (fib==1|| fib<=0) {
            return 0;
        }
        else if(fib==2){		
            return 1;
	}
	else{
            return fibonacci(fib-2) + fibonacci(fib-1);
        }
    }
    
    static void fibonacciIterative(int n){
	int a=0;
	int b=1;
	for (int i=0;i<n ;i++ ) {
            a=a+b;
            b=a-b;
            System.out.print(b+" ");
	}	
    }
}
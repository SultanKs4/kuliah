import java.util.Scanner;
public class PangkatRekursif {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);    
        System.out.print("Masukan nilai n :");
        int n = sc.nextInt();
        System.out.print("Masukan nilai p :");
        int p = sc.nextInt();
        PangkatRekursif(n,p);
        show(p,n);
        System.out.print(PangkatRekursif(n,p));
    }
    
    static void show(int p, int n){
        if(p == 0) return;
        if(p == 1){
            System.out.print(n+"=");
        }
        else if(p != 0){
            System.out.print(n+"x");
        }
        show(p-1, n);
    }
    
    static int PangkatRekursif(int n, int p){
	if(p>1){
            return n * PangkatRekursif(n, p-1);
	} 
        else {
            return n;
	}
    }
}

package JS3Praktikum;

/**
 *
 * @author Sultan
 */
public class faktorial {
    public int nilai, hasil;

    public void faktorialBF() {
        int fakto = 1;
        for (int i = 1; i <= nilai; i++) {
            fakto *= i;
        }
        System.out.println("Nilai Faktorial Brute Force : " + fakto);
    }

    public int faktorialDC(int n) {
        nilai = n;
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}

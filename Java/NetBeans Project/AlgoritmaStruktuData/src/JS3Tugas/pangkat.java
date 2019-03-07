package JS3Tugas;

/**
 *
 * @author Sultan
 */
public class pangkat {
    public int n, x;

    public int pangkatBruteForce() {
        int temp = n;
        for (int i = 1; i < x; i++) {
            temp *= n;
        }
        return temp;
    }

    public int pangkatDivideConquer(int x) {
        int temp = n;
        if (x == 1) {
            return n;
        } else {
            int tempdc = temp * pangkatDivideConquer(x - 1);
            return tempdc;
        }

    }
}

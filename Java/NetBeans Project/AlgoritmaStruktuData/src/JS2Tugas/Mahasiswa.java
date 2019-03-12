package JS2Tugas;

/**
 *
 * @author Sultan
 */
public class Mahasiswa {
    int nilai1, nilai2;

    public int highest() {
        int temp = nilai1;
        if (temp < nilai2) {
            temp = nilai2;
        }
        return temp;
    }
}

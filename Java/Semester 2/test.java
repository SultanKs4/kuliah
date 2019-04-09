/**
 * test
 */
public class test {
    public static void main(String[] args) {
        // int nilai[][] = new int[2][2];

        // nilai[0][0] = 3;
        // nilai[0][1] = 4;

        // nilai[1][0] = 5;
        // nilai[1][1] = 6;

        // for (int baris = 0; baris < nilai.length; baris++) {

        // for (int kolom = 0; kolom < nilai[0].length; kolom++) {

        // if (nilai[baris][kolom] % 2 != 0 && baris % 2 != 0) {

        // System.out.print(nilai[baris][kolom] + " ");

        // }

        // }

        // }

        Mahasiswa[] data = new Mahasiswa[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = new Mahasiswa();
            data[i].q1 = (i + 1) * 10;
            data[i].q2 = (i + 1) * 10;
            data[i].uts = (i + 1) * 10;
            data[i].uas = (i + 1) * 10;
        }

        int x = 0;
        for (int i = 0; i < data.length; i++) {
            int y = (x + data[i].q1 + x + data[i].q2 + x + data[i].uts + x + data[i].uas) / 4;
            x = x + y;
        }
        x = x / 5;
        System.out.println(x);
    }

    static class Mahasiswa {
        String nama;
        int q1, q2, uas, uts;
    }

}
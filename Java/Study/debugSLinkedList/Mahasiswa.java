public class Mahasiswa {
    String nama, nim;

    public Mahasiswa(String nm, String Nim) {
        nama = nm;
        nim = Nim;
    }

    void print() {
        System.out.println("Nama = " + nama);
        System.out.println("NIM = " + nim);
    }
}
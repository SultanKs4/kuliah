package JS1Tugas;

/**
 *
 * @author Sultan
 */
public class SewaGame {
    public int idMem, priSewa, lamPin;
    public String namMem, namGame;

    public int bill() {
        return priSewa * lamPin;
    }

    public void printReceipt() {
        System.out.println("\n~STRUK SEWA GAME~");
        System.out.println("1. ID Member : " + idMem + "\n2. Nama Member : " + namMem + "\n3. Judul Game : " + namGame);
        System.out.println("4. Durasi Pinjam (HARI) : " + lamPin + "\n5. Harga Sewa Game Per-Hari : " + priSewa);
        System.out.println("6. Harga Total : " + bill());
    }
}

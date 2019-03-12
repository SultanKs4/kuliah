package JS4Tugas;

/**
 *
 * @author Sultan
 */
public class KeranjangBelanja {
    Barang listBarang[] = new Barang[4];
    int idx;

    public void tambah(Barang brg) {
        if (idx < listBarang.length) {
            listBarang[idx] = brg;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampil() {
        for (Barang brg : listBarang) {
            brg.tampil();
            System.out.println("-------------------");
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < listBarang.length - 1; i++) {
            for (int j = 1; j < listBarang.length - i; j++) {
                if (listBarang[j].hargaSatuan < listBarang[j - 1].hargaSatuan) {
                    Barang tmp = listBarang[j];
                    listBarang[j] = listBarang[j - 1];
                    listBarang[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < listBarang.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBarang.length; j++) {
                if (listBarang[j].hitungHargaTotal() < listBarang[idxMin].hitungHargaTotal()) {
                    idxMin = j;
                }
            }
            Barang tmp = listBarang[idxMin];
            listBarang[idxMin] = listBarang[i];
            listBarang[i] = tmp;
        }
    }

    public void mergeSort() {

    }
}

package JS4Tugas;

/**
 *
 * @author Sultan
 */
public class KeranjangBelanja {
    public Barang listBarang[] = new Barang[4];
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

    public void mergeSort(int awal, int akhir) {
        if (akhir - awal == 0) {

        } else if (akhir - awal == 1) {
            if (listBarang[awal].jumlah > listBarang[akhir].jumlah) {
                Barang temp = listBarang[awal];
                listBarang[awal] = listBarang[akhir];
                listBarang[akhir] = temp;
            }
        } else {
            int tengah = (awal + akhir) / 2;
            mergeSort(awal, tengah);
            mergeSort(tengah + 1, akhir);

            Barang[] tempArr = new Barang[akhir - awal + 1];
            int i = awal, j = tengah + 1;
            for (int k = awal; k <= akhir; k++) {
                if (i > tengah || j > akhir) {
                    if (i > tengah && j <= akhir) {
                        tempArr[k - awal] = listBarang[j];
                        j++;
                    } else if (i <= tengah && j > akhir) {
                        tempArr[k - awal] = listBarang[i];
                        i++;
                    } else
                        break;
                } else {
                    if (listBarang[i].jumlah < listBarang[j].jumlah) {
                        tempArr[k - awal] = listBarang[i];
                        i++;
                    } else {
                        tempArr[k - awal] = listBarang[j];
                        j++;
                    }
                }
            }
            for (int tra = 0; tra < tempArr.length; tra++) {
                listBarang[awal + tra] = tempArr[tra];
            }
        }
    }
}

#include <iostream>

using namespace std;

int masukkanKode();
int masukkanJamKerja();
int masukkanGajiPerJam();
int hitungGaji(int kode, int jumlahjamkerja, int gajiperjam);
int hitungLembur(int jumlahjamkerja, int gajiperjam);
int hitungTotalGaji(int gaji, int uangmakan, int lembur);
void cetakGaji(string nama, int kode, int jumlahjamkerja, int gajiperjam, int gaji, int lembur, int uangmakan, int totalgaji);
char ngulang();
void cetakTotal(int jumlahpegawai, int totalbayargaji);
int main()
{
    //deklarasi variabel
    char nama[20], lagi;
    int kode, jumlahJamKerja, gajiPerjam, gaji;
    int gajiLembur, uangMakan, totalGaji;
    int jumlahPegawai = 0, totalBayarGaji = 0;

    do
    {
        //masukkan data
        cout << "Masukkan Nama : ";
        cin >> nama;
        kode = masukkanKode();
        jumlahJamKerja = masukkanJamKerja();
        gajiPerjam = masukkanGajiPerJam();

        //Proses
        if (jumlahJamKerja < 8)
        {
            uangMakan = 0;
            gajiLembur = 0;
            gaji = hitungGaji(kode, jumlahJamKerja, gajiPerjam);
        }
        else
        {
            uangMakan = 5000;
            gajiLembur = hitungLembur(jumlahJamKerja, gajiPerjam);
            gaji = hitungGaji(kode, 8, gajiPerjam);
        }
        totalGaji = hitungTotalGaji(gaji, uangMakan, gajiLembur);
        jumlahPegawai++;
        totalBayarGaji += totalGaji;

        //cetak
        cetakGaji(nama, kode, jumlahJamKerja, gajiPerjam, gaji, gajiLembur, uangMakan, totalGaji);
        lagi = ngulang();
    } while (lagi == 'y');
    cetakTotal(jumlahPegawai, totalBayarGaji);
    return 0;
}
void cetakTotal(int jumlahpegawai, int totalbayargaji)
{
    cout << "Jumlah pegawai yang dibayar     : " << jumlahpegawai << endl;
    cout << "Total gaji pegawai yang dibayar : " << totalbayargaji << endl;
}
char ngulang()
{
    char ulang;
    cout << "Apakah anda ingin mengulanginya lagi? [y/t] : ";
    cin >> ulang;
    return ulang;
}
void cetakGaji(string nama, int kode, int jumlahjamkerja, int gajiperjam, int gaji, int lembur, int uangmakan, int totalgaji)
{
    cout << "--------------CETAK GAJI--------------" << endl;
    cout << "Nama                = " << nama << endl;
    cout << "Kode kerja          = " << kode << endl;
    cout << "Jumlah jam kerja    = " << jumlahjamkerja << endl;
    cout << "Gaji per jam        = " << gajiperjam << endl;
    cout << "Gaji pegawai        = " << gaji << endl;
    cout << "Gaji lembur         = " << lembur << endl;
    cout << "Uang makan          = " << uangmakan << endl;
    cout << "Total gaji diterima = " << totalgaji << endl;
    cout << "--------------------------------------" << endl;
}
int hitungTotalGaji(int gaji, int uangmakan, int lembur)
{
    int totalgaji;
    totalgaji = gaji + uangmakan + lembur;
    return totalgaji;
}
int hitungLembur(int jumlahjamkerja, int gajiperjam)
{
    int lembur;
    lembur = (jumlahjamkerja - 8) * 2 * gajiperjam;
    return lembur;
}
int hitungGaji(int kode, int jumlahjamkerja, int gajiperjam)
{
    int gaji;
    if (kode == 1)
        gaji = jumlahjamkerja * gajiperjam;
    else
        gaji = 1.5 * jumlahjamkerja * gajiperjam;
    return gaji;
}
int masukkanGajiPerJam()
{
    int gajiPerJam;
    cout << "Masukkan Gaji Perjam : ";
    cin >> gajiPerJam;
    return gajiPerJam;
}
int masukkanJamKerja()
{
    int totalJamKerja;
    cout << "Masukkan Jumlah Jam Kerja : ";
    cin >> totalJamKerja;
    return totalJamKerja;
}
int masukkanKode()
{
    int kode;
    cout << "Masukkan Kode Kerja : ";
    cin >> kode;
    return kode;
}
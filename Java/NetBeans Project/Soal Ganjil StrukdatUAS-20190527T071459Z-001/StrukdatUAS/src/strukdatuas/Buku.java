/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package strukdatuas;

/**
 *
 * @author rrism
 */
public class Buku {
    public int kode;
    public String judul;
    public String penerbit;
    public int jumlahStok;
    public int jumlahRusak;

    Buku() {

    }

    Buku(int kode, String judul, String penerbit, int jumlahStok, int jumlahRusak) {
        this.kode = kode;
        this.judul = judul;
        this.penerbit = penerbit;
        this.jumlahRusak = jumlahRusak;
        this.jumlahStok = jumlahStok;
    }
}

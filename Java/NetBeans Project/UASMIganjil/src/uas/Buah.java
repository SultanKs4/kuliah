/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author ASUS
 */
public class Buah {

    public String nama;
    public int jumlahStok;
    public int jumlahBusuk;

    public Buah() {
        this.jumlahStok = 0;
        this.jumlahBusuk = 0;
    }

    public Buah(String nama, int jumlahStok) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.jumlahBusuk = 0;
    }

    public Buah(String nama, int jumlahStok, int jumlahBusuk) {
        this.nama = nama;
        this.jumlahStok = jumlahStok;
        this.jumlahBusuk = jumlahBusuk;
    }

}

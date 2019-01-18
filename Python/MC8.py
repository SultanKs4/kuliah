from bangun.Persegi import *
from bangun.PersegiPanjang import *


def menu():
    print("1. Persegi")
    print("2. Persegi Panjang")
    inputPil = int(input("Pilihannya : "))
    return inputPil


def cekPilihan(pilihan):
    if pilihan == 1:
        sisi = int(input("Masukkan sisi : "))
        Persegi(sisi).LuasPersegi()
    elif pilihan == 2:
        panjang = int(input("Masukkan Panjang : "))
        lebar = int(input("Masukkan lebar : "))
        PersegiPanjang(panjang, lebar).hitungLuas()


if __name__ == '__main__':
    cekPilihan(menu())

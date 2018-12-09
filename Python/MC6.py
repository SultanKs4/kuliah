def Pilihan():
    print("1. Luas")
    print("2. Keliling")
    inputPil = int(input("Pilihannya :"))
    return inputPil


def cekPilihan(pilihan):
    if pilihan == 1:
        LuasPersegi(sisi())
    elif pilihan == 2:
        kelilingPersegi(sisi())


def sisi():
    print("Ini untuk persegi")
    sisi = int(input("Masukkan sisi :"))
    return sisi


def LuasPersegi(sisi):
    luas = sisi*sisi
    print("Luas persegi adalah : "+str(luas))


def kelilingPersegi(sisi):
    keliling = 4 * sisi
    print("Keliling persegi adalah : "+str(keliling))


if __name__ == '__main__':
    cekPilihan(Pilihan())
    
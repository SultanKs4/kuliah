todolist = list((""))


def main():
    print("====================")
    print("TO DO LIST")
    print("====================")
    print(todolist)
    print("1. Tambah List")
    print("2. Mengurangi List")
    print("====================")
    pilihan = int(input("Masukkan pilihan :")) 
    kondisi(pilihan)


def kondisi(pilihan):
    if pilihan == 1:
        inputan = str(input("Masukkan List : "))
        todolist.append(inputan)
        print(todolist)

    elif pilihan == 2:
        print(todolist)
        mengurangi = str(input("Apa yang mau dihapus ? : "))
        todolist.remove(mengurangi)
        print(todolist)

    ulangi()


def ulangi():
    kembali = str(input("Apakah anda ingin kembali ? (y/n) : "))
    if kembali == "y":
        main()


if __name__ == '__main__':
    main()

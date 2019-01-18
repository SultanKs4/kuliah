class PersegiPanjang:
    def __init__(self, panjang, lebar):
        self.panjang = panjang
        self.lebar = lebar

    def hitungLuas(self):
        print("Luas : " + str(self.panjang * self.lebar))

    def hitungKeliling(self):
        print("Keliling : " + str((2 * self.panjang) + (2 * self.lebar)))


pp = PersegiPanjang(10, 2)
pp.hitungLuas()
pp.hitungKeliling()

pp2 = PersegiPanjang(5, 1)
pp2.hitungLuas()
pp2.hitungKeliling()

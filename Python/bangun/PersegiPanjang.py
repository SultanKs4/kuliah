class PersegiPanjang:
    def __init__(self, panjang, lebar):
        self.panjang = panjang
        self.lebar = lebar

    def hitungLuas(self):
        print("Luas : " + str(self.panjang * self.lebar))

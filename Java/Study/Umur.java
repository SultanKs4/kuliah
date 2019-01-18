import java.util.*;

public class Umur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	Calendar cal =	Calendar.getInstance();
        int tahun=cal.get(Calendar.YEAR), bulan=cal.get(Calendar.MONTH), hari=cal.get(Calendar.DAY_OF_MONTH);
        int hariUmur, bulanUmur, tahunUmur, hariLahir, bulanLahir, tahunLahir;
     
        System.out.print("Masukan Tanggal lahir anda\t:");
        hariLahir = sc.nextInt();
        System.out.print("Masukan Bulan lahir anda\t:");
        bulanLahir = sc.nextInt();
        System.out.print("Masukan Tahun lahir anda\t:");
        tahunLahir = sc.nextInt();
        
        if(hariLahir >= hari){
            hariUmur = -(hari) + hariLahir;
            if (bulanLahir >= bulan){
                bulanUmur = -(bulan) + bulanLahir;
            }
            else{
                bulanUmur = bulan - bulanLahir;
            }
            tahunUmur = tahun - tahunLahir;
        
        if(bulanLahir >= bulan){
            if(hariLahir >= hari){
            hariUmur = -(hari) + hariLahir;
            }
            else{
            hariUmur = hari-hariLahir;
            }
            tahunUmur = tahun - tahunLahir;
        }
        }
        else {
            hariUmur = hari - hariLahir;
            bulanUmur = bulan - bulanLahir;
            tahunUmur = tahun - tahunLahir;
        }
        
        System.out.print("Maka Umur anda sekarang adalah " + tahunUmur + " Tahun " + bulanUmur + " Bulan " + hariUmur + " Hari " );
    }
}


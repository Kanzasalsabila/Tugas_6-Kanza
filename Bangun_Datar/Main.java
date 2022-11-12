// Nama: Kanza Salsabila
// Kelas: TI21F
// NIM: 20200040094
package Bangun_Datar;

public class Main {
    public static void main(String[] args) {
        BangunDatar segitiga=new SegiTiga(12, 20);
        BangunDatar lingkaran=new Lingkaran(60);

        System.out.println("Luas dari bangun datar segitiga : "+segitiga.getLuas());
        System.out.println("Luas dari bangun datar luangkaran : "+lingkaran.getLuas());
    }
}

// Nama: Kanza Salsabila
// Kelas: TI21F
// NIM: 20200040094
package Bangun_Datar;

public abstract class BangunDatar {
    String warna;

    String getName(){
        return warna;
    }

    void setWarna(String warna){
        this.warna=warna;
    }
    
    abstract float getLuas();
}

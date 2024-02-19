package Pertemuan2;

/**
 * Buku18
 */
public class Buku18 {
    String judul, pengarang;
    int halaman, stok, harga, jmlTerjual;
    
    // baru
    int  hargaTotal;
    int hargaPascaDiskon, diskon;

    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa stok: "+stok);
        System.out.println("Harga: Rp"+harga);
        System.out.println("Jumlah terjual: "+ jmlTerjual);
        System.out.println("Harga total: "+hargaTotal);
        System.out.println("Diskon: "+diskon);
        System.out.println("Harga Akhir: "+hargaPascaDiskon);
    }
    // void terjual(int jml){
    //     stok-= jml;
    // }
    void terjual(int jml){
        jmlTerjual = jml;
        if (stok>0) {
            stok-=jml;
        }
    }
    void restock(int jml){
        stok+=jml;
    }
    void gantiHarga(int hrg){
        harga=hrg;
    }

    int hitungHargaTotal(){
        hargaTotal = jmlTerjual*harga;
        return hargaTotal;
        
    }
    int hitungDiskon(){
        if (hargaTotal>150000) {
            diskon = (int)(hargaTotal*0.12);
            // hargaPascaDiskon= hargaTotal-diskon;
        }else if (hargaTotal>75000) {
            diskon = (int)(hargaTotal*0.05);
            // hargaPascaDiskon= hargaTotal-diskon;
        }
        return diskon;
    }
    int hitungHargaBayar(){
        hargaPascaDiskon = hargaTotal-diskon;
        return hargaPascaDiskon;
    }

    // public Buku18(){

    // }
    // public Buku18(String jud, String pg, int hal, int stok, int har){
    //     judul = jud;
    //     pengarang = pg;
    //     halaman = hal;
    //     this.stok = stok;
    //     harga = har;
    // }


}
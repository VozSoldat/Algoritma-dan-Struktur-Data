package Pertemuan7;

public class Buku18 {
    int kodeBuku;
    String judulBukul;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku18(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judulBukul = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    void tampilDataBuku(){
        System.out.println("==================================");
        System.out.println("Kode buku: " + kodeBuku);
        System.out.println("Judul buku: " + judulBukul);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }

    
}

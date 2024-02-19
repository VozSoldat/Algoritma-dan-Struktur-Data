package Pertemuan2;

public class BukuMain18 {
    public static void main(String[] args) {
        Buku18 bk1 = new Buku18();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.jmlTerjual = 5;


        // bk1.tampilInformasi();
        bk1.terjual(40);
        bk1.gantiHarga(60000);

        bk1.hitungHargaTotal();
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();

        
        bk1.tampilInformasi();

        // Buku18 bk2 = new Buku18("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        // bk2.terjual(11);
        // bk2.tampilInformasi();


        // Buku18 bukuMuhErril = new Buku18("Buku Sakti Java Khatam Satu Minggu", "Erril", 900, 5, 99000);
        // bukuMuhErril.jmlTerjual = 10;
        // bukuMuhErril.tampilInformasi();

        
    }
}

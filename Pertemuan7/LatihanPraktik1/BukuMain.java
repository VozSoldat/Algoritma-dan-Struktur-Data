package Pertemuan7.LatihanPraktik1;



import java.util.Scanner;

public class BukuMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
    
        PencarianBuku18 data = new PencarianBuku18();
        int jumBuku = 5;

        System.out.println("-----------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------------");
            System.out.print("Kode buku \t: ");
            String kodeBuku = s1.nextLine();
            
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit= s.nextInt();
            
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            
            System.out.print("Stock \t : ");
            int stock = s.nextInt();

            Buku18 m = new Buku18(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("--------------------------------");
        System.out.println("Data keseluruhan Buku : ");

        data.tampil();

        System.out.println("_____________________________");
        System.out.println("____________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.println("Kode buku : ");
        String cari =s1.nextLine();

        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        data.tampilData(cari, posisi);

        System.out.println("=======================");
        System.out.println("menggunakan binary search");
        posisi = data.findBinarySearch(cari, 0, jumBuku-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}

package Pertemuan8;

import java.util.Scanner;

public class Utama18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang18 gudang = new Gudang18(kapasitas);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas.");
            System.out.println("5. Keluar");
            System.out.println("Pilih operasi");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan kategori: ");
                    String kategori = scanner.nextLine();
                    Barang18 barangBaru = new Barang18(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

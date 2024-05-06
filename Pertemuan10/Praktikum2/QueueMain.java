package Pertemuan10.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    static void menu(){
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3, Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitasa queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
    }
}

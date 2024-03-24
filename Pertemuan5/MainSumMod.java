package Pertemuan5;

import java.util.Locale;
import java.util.Scanner;

public class MainSumMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); // untuk memastikan program dapat menerima input desimal dengan tanda titik (.). sebelumnya, Scanner saya hanya menerima desimal dengan tanda koma (,).
        System.out.println("=================");

        System.out.print("Masukkan jumlah perusahaan: ");
        int banyakPerusahaan = sc.nextInt();
        int[] elm = new int[banyakPerusahaan];
        Sum[] sm = new Sum[banyakPerusahaan];


        for (int i = 0; i < banyakPerusahaan; i++) {
            System.out.println("=============================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
            System.out.println("Masukkan jumlah bulan : ");
            elm[i] = sc.nextInt();

            
            sm[i] = new Sum(elm[i]);
            System.out.println("=======================");
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-"+(j+1)+" = ");
                sm[i].keuntungan[j] = sc.nextDouble();
                
            }

            System.out.println("====================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama "+ sm[i].elemen+" bulan adalah = "+ sm[i].totalBF(sm[i].keuntungan));
            System.out.println("=====================================");
            System.out.println("Total keuntungan perusahaan selama "+ sm[i].elemen+" bulan adalah = "+ sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen-1));

            
        }
        sc.close();
    }
}

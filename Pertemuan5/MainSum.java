package Pertemuan5;

import java.util.Locale;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH); // untuk memastikan program dapat menerima input desimal dengan tanda titik (.). sebelumnya, Scanner saya hanya menerima desimal dengan tanda koma (,).
        System.out.println("=================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("=======================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-"+(i+1)+" = ");
            sm.keuntungan[i] = sc.nextDouble();
            
        }

        System.out.println("====================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen+" bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("=====================================");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen+" bulan adalah = "+ sm.totalDC(sm.keuntungan, 0, sm.elemen-1));

        sc.close();
    }
}

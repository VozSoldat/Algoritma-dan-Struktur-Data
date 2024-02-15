package Pertemuan1.Praktikum4;

import java.util.Locale;
import java.util.Scanner;

public class Fungsi {
    static Scanner sc = new Scanner(System.in);
    static String[] cabangToko = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"}; // baris

    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"}; // kolom
    static short[] hargaBunga = {75, 50, 60, 10};

    static short[][] stokBunga = {{10, 5, 15, 7}, 
                                    {6,11,9,12}, 
                                    {2,10,10,5}, 
                                    {5,7,12,9}};
    
    public static void main(String[] args) {
        System.out.println("Program Laporan Pendapatan PT Royal Garden, Tbk.\n==================");
        System.out.println("Pilih fitur:\n1 - Cek Pendapatan\n2 - Stok");
        char inputPilih = sc.next().charAt(0);
        if (inputPilih == '1') {
            pendapatan();
        } else if (inputPilih == '2') {
            stok();
        }
    }

    public static void pendapatan(){
        // hitung pendapatan
        int[][] pendapatanTiapBungaToko = new int[4][4];
        int[] pendapatanPerToko = {0, 0, 0, 0};

        for (int i = 0; i < pendapatanTiapBungaToko.length; i++) {
            for (int j = 0; j < pendapatanTiapBungaToko[i].length; j++) {
                pendapatanTiapBungaToko[i][j] = stokBunga[i][j] * hargaBunga[j] *1000;
            }
            for (int j = 0; j < pendapatanPerToko.length; j++) {
                pendapatanPerToko[i] += pendapatanTiapBungaToko[i][j]*1000;
            }
        }

        System.out.printf(Locale.ITALY,"| %-12s | %-12s | %-12s | %-12s | %-12s | %-12s |\n", " ",namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3], "Total" );
        for (int i = 0; i < pendapatanPerToko.length; i++) {
            System.out.printf("| %-12s | %-,12d | %-,12d | %-,12d | %-,12d | %-,12d |\n", cabangToko[i], pendapatanTiapBungaToko[i][0], pendapatanTiapBungaToko[i][1], pendapatanTiapBungaToko[i][2], pendapatanTiapBungaToko[i][3], pendapatanPerToko[i]);
        }

    }

    public static void stok(){
        short[] mati = {1, 2, 0, 5};
        int[] stokAkhir = {(stokBunga[3][0]-mati[0]), (stokBunga[3][1] - mati[1]), (stokBunga[3][2] - mati[2]), (stokBunga[3][3] - mati[3]) };
        System.out.println("Stok Bunga Royal Garden 4\n============================");
        System.out.printf("| %-12s | %-12s | %-12s | %-12s | %-12s |\n", " ",namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3]);
        System.out.printf("| %-12s | %-,12d | %-,12d | %-,12d | %-,12d |\n", "Awal", stokBunga[3][0], stokBunga[3][1], stokBunga[3][2], stokBunga[3][3]);
        System.out.printf("| %-12s | %-12s | %-12s | %-12s | %-12s |\n", "Akhir", stokAkhir[0]+ " (mati: "+mati[0]+")", stokAkhir[1]+ " (mati: "+mati[1]+")", stokAkhir[2]+ " (mati: "+mati[2]+")", stokAkhir[3]+ " (mati: "+mati[3]+")");

    }

    

}

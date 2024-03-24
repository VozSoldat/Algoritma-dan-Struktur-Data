package Pertemuan5;

import java.util.Scanner;

public class MainPangkatMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        
        System.out.println("Pilih metode penghitungan:\n1. Brute Force\n2. Divide-and-Conquer");
        short pilihan = sc.nextShort();

        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        PangkatMod[] png = new PangkatMod[elemen];
        int[] nilai = new int[elemen];
        int[] pangkat = new int[elemen];

        
        for (int i = 0; i < elemen; i++) {
            
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            nilai[i] = sc.nextInt();

            System.out.println("Masukkan nilai pemangkat:");
            pangkat[i]= sc.nextInt();

            png[i]= new PangkatMod(nilai[i], pangkat[i]);
        }

        switch (pilihan) {
            case 1:
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari "
                    + png[i].nilai+" pangkat "
                    + png[i].pangkat+ " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
                break;
        
            case 2:
            System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " 
                    + png[i].nilai + " pangkat "
                    + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
                break;
            default:
                break;
        }





        
    }
}
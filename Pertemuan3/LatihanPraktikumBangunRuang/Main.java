package Pertemuan3.LatihanPraktikumBangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Pilih bangun ruang.\n1. Kerucut\n2. Limas Segi Empat Sama Sisi\n3. Bola");
        // char pilih = sc.next().charAt(0);
        Kerucut kerucut = new Kerucut();
        LimasSESS limas = new LimasSESS();
        Bola bola = new Bola();

        for (int i = 0; i < 3; i++) {

            switch (i) {
                case 0:
                System.out.println("======\nKerucut");
                    break;
                case 1:
                System.out.println("======\nLimas Segi Empat Sama Sisi");
                    break;
                case 2:
                System.out.println("======\nBola");
                    break;
                default:
                    break;
            }
            if (i==0) {
                
                System.out.println("Masukkan Jari-jari: ");
                int a = sc.nextInt();
                System.out.println("Masukkan Sisi Miring: ");
                int b = sc.nextInt();

                kerucut = new Kerucut(a,b);
            }else if (i==1) {
                
                System.out.println("Masukkan sisi Alas:");
                int a = sc.nextInt();
                System.out.println("Masukkan tinggi:");
                int b = sc.nextInt();

                limas = new LimasSESS(a,b);
            }else if (i==2){
                System.out.println("Masukkan jari-jari");
                int a = sc.nextInt();
                bola = new Bola(a);
            }

        }
        double[] luas = new double[3];
        double[] volume = new double[3];

        luas[0]= kerucut.LuasPermukaan();
        luas[1]= limas.LuasPermukaan();
        luas[2]= bola.LuasPermukaan();

        volume[0]= kerucut.Volume();
        volume[1]= limas.Volume();
        volume[2]= bola.Volume();

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                System.out.println("======\nKerucut");
                    break;
                case 1:
                System.out.println("======\nLimas Segi Empat Sama Sisi");
                    break;
                case 2:
                System.out.println("======\nBola");
                    break;
                default:
                    break;
            }

            System.out.println("Luas: "+luas[i]);
            System.out.println("Volume: "+volume[i]);
        }
    }
}

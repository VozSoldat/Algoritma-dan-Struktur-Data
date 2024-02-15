package Pertemuan1.Tugas1;

import java.util.Scanner;

/**
 * NomorPolisi
 */
public class NomorPolisi {
static Scanner sc = new Scanner(System.in);
static String[] kotaString = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};
static char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
//char kota[][] = new char[10][12];

static char[][] kota = {kotaString[0].toCharArray(), kotaString[1].toCharArray(), kotaString[2].toCharArray(),kotaString[3].toCharArray(), kotaString[4].toCharArray(), kotaString[5].toCharArray(), kotaString[6].toCharArray(), kotaString[7].toCharArray(), kotaString[8].toCharArray(), kotaString[9].toCharArray()};
        
    public static void main(String[] args) {
        
        System.out.println("Masukkan kode wilayah nomor polisi.");
        String inputPilih = sc.next();

        if (inputPilih.equalsIgnoreCase("a")) {
            cetakKota(0);
        } else if (inputPilih.equalsIgnoreCase("b")) {
            cetakKota(1);
        } else if (inputPilih.equalsIgnoreCase("d")) {
            cetakKota(2);
        }

    }

    public static void cetakKota(int j){
        for (int i = 0; i < kota[j].length; i++) {
            System.out.print(kota[j][i]+" ");
        }
    }
}
package Pertemuan1.Praktikum1;

import java.util.Scanner;

/**
 * Pemilihan
 */
public class Pemilihan {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        short nTugas;
        short nQuiz;
        short nUTS;
        short nUAS;
        boolean isValid = true;
        
        System.out.println("Program Menghitung Nilai \n=========");

        do{
        
            if (isValid == false) {
                System.out.println("Input tidak valid. Masukkan kembali nilai.");
            }
        
        System.out.print("Masukkan Nilai Tugas : ");
        nTugas = sc.nextShort();

        System.out.print("Masukkan Nilai Quiz : ");
        nQuiz = sc.nextShort();

        System.out.print("Masukkan Nilai UTS : ");
        nUTS = sc.nextShort();

        System.out.print("Masukkan Nilai UAS : ");
        nUAS = sc.nextShort();

        if (nTugas > 100 || nQuiz > 100 || nUTS > 100 || nUAS > 100) {
            isValid = false;
        }
        } while (nTugas > 100 || nQuiz > 100 || nUTS > 100 || nUAS > 100);

        float rataRata = nTugas * 0.2F + nQuiz * 0.2F + nUTS * 0.3F + nUAS * 0.4F;

        // Nilai Huruf
        float a = rataRata;
        String huruf;
        if (a > 80) {
            huruf = "A";
        } else if(a >72) {
            huruf ="B+";
        } else if (a > 65) {
            huruf ="B";
        } else if (a > 60) {
            huruf = "C+";
        } else if(a > 50){
            huruf = "C";
        }else if (a >39) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        System.out.println("Nilai Akhir : " + rataRata);
        System.out.println("Nilai Huruf : " + huruf);

        if (rataRata > 50) {
            System.out.println("SELAMAT, ANDA LULUS!!");
        } else{
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}
package Pertemuan1.Praktikum3;

import java.util.Locale;
import java.util.Scanner;

public class Array {
    static Scanner sc = new Scanner(System.in);

    static String[] matkul= {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
    static float[] bobot = {3.5F, 4, 4, 4, 3.5F, 4, 4, 4};

    // Nilai Mahasiswa
        static short[] nilaiPersenInput = new short [8];
        static float[] nilaiPerempat = new float [8];
        static String[] nilaiHuruf = new String [8];
        static float[] nilaiMatkulxSKS = new float [8];
        static double indeksPrestasi;

    static float[] nilaiPerempatSample = {4, 3.5F, 3, 2.5F, 2, 1, 0 };
    public static void main(String[] args) {
        System.out.println("Program Menghitung IP Semester\n=================");
        for (int i = 0; i < nilaiPersenInput.length; i++) {
            System.out.print("Masukkan nilai angka untuk mata kuliah "+matkul[i] +" ");
            nilaiPersenInput[i] = sc.nextShort();

            short a = nilaiPersenInput[i];
            if (a > 80) {
                nilaiHuruf[i] = "A";
                nilaiPerempat[i] = nilaiPerempatSample[0];
            } else if(a >72) {
                nilaiHuruf[i] ="B+";
                nilaiPerempat[i] = nilaiPerempatSample[1];
            } else if (a > 65) {
                nilaiHuruf[i] ="B";
                nilaiPerempat[i] = nilaiPerempatSample[2];
            } else if (a > 60) {
                nilaiHuruf[i] = "C+";
                nilaiPerempat[i] = nilaiPerempatSample[3];
            } else if(a > 50){
                nilaiHuruf[i] = "C";
                nilaiPerempat[i] = nilaiPerempatSample[4];
            }else if (a >39) {
                nilaiHuruf[i] = "D";
                nilaiPerempat[i] = nilaiPerempatSample[5];
            } else {
                nilaiHuruf[i] = "E";
                nilaiPerempat[i] = nilaiPerempatSample[6];
            }



        }

        // nilaiperempat * sks
        double sigmaNilaixSKS = 0;
        double sigmaSKS = 0;
        for (int i = 0; i < nilaiMatkulxSKS.length; i++) {
            nilaiMatkulxSKS[i] = nilaiPerempat[i] * bobot[i];

            sigmaNilaixSKS += nilaiMatkulxSKS[i];

            sigmaSKS += bobot[i];
        }

        indeksPrestasi = sigmaNilaixSKS / sigmaSKS;

        

        // cetak nilai setiap matkul
        System.out.printf("| %-37s | %-13s | %-13s | %-13s | %-13s | %n", "MK", "Nilai Angka", "Nilai Huruf", "Nilai Setara", "Bobot");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("| %-37s | %-13s | %-13s | %-13s | %-13s | %n", matkul[i], nilaiPersenInput[i], nilaiHuruf[i], nilaiPerempat[i], bobot[i]);

        }
        System.out.printf(Locale.US, "IP : "+ "%1.2f%n", indeksPrestasi);
        System.out.println(indeksPrestasi);

    }
}

package Pertemuan3.LatihanPraktikumMahasiswa;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Mahasiswa[] mhs = new Mahasiswa[3];
    public static void main(String[] args) {
        
        
        for (int i = 0; i < 3; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama: ");
            mhs[i].nama = sc.next();
            System.out.print("Masukkan NIM: ");
            mhs[i].nim = sc.next();
            System.out.print("Masukkan jenis kelamin (L/P): ");
            mhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhs[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.println("Nama: "+mhs[i].nama);
            System.out.println("NIM: "+mhs[i].nim);
            System.out.println("Jenis kelamin: "+mhs[i].jenisKelamin);
            System.out.println("IPK: "+mhs[i].ipk);
        }

        System.out.println("Rata-rata IPK: "+HitungRataIpk());
        System.out.println("Mahasiswa dengan IPK tertinggi: "+mhs[SortMax()].nama);
        
    }
    static double HitungRataIpk(){
        double totalIpk=0;
        for (int i = 0; i < 3; i++) {
            totalIpk = totalIpk + mhs[i].ipk;
        }
        double rataIpk = totalIpk/3;
        return rataIpk;
    }

    static int SortMax(){
        double maxIpk=mhs[0].ipk;
        int mhsMax = 0;
        for (int i = 0; i < 3; i++) {
            if (maxIpk<mhs[i].ipk) {
                maxIpk = mhs[i].ipk;
                mhsMax = (i);
            }
        }
        return mhsMax;
    }
}

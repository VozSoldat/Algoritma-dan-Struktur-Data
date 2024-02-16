package Pertemuan1.Tugas2;

import java.util.Scanner;

public class Fisika {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI MESIN FISIKA\n============================");
        System.out.println("Pilih besaran yang ingin dicari.\n1 - Kecepatan\n2 - Jarak\n3 - Waktu");
        char pilihan = sc.next().charAt(0);
        String hasil = " ";

        if (pilihan == '1') {
            hasil = mesinKecepatan();
        }else if (pilihan == '2') {
            hasil = mesinJarak();
        }else if (pilihan == '3') {
            hasil = mesinWaktu();
        } else{
            System.out.println("Input tidak valid. Masukkan kembali.");
            main(args);
        }

        System.out.println(hasil);

    }

    public static String mesinKecepatan(){
        System.out.println("MESIN HITUNG KECEPATAN\n===========");
        System.out.print("Masukkan jarak (m) : ");
        double jarak = sc.nextDouble();

        System.out.print("Masukkan waktu (s) : ");
        double waktu = sc.nextDouble();

        double kecepatan = jarak/waktu;
        String hasil = kecepatan+" m/s";
        return hasil;
    }

    public static String mesinJarak(){
        System.out.println("MESIN HITUNG JARAK\n============");
        System.out.print("Masukkan waktu (s) : ");
        double waktu = sc.nextDouble();

        System.out.print("Masukkan kecepatan (m/s) : ");
        double kecepatan = sc.nextDouble();

        double jarak = waktu * kecepatan;
        String hasil = jarak+" m";
        return hasil;
    }

    public static String mesinWaktu(){
        System.out.println("MESIN HITUNG WAKTU\n============");
        System.out.print("Masukkan jarak (s) : ");
        double jarak = sc.nextDouble();

        System.out.print("Masukkan kecepatan (m/s) : ");
        double kecepatan = sc.nextDouble();

        double waktu = jarak / kecepatan;
        String hasil = waktu+" s";
        return hasil;
    }

}

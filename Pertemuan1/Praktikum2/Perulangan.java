package Pertemuan1.Praktikum2;

import java.util.Scanner;

/**
 * Perulangan
 */
public class Perulangan {
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char nim;
        System.out.print("Masukkan NIM : ");
        nim = sc.next().charAt(9);
        System.out.println("============");
        short angkaAkhir = (short) Character.getNumericValue(nim);
        if (angkaAkhir < 10) {
            angkaAkhir+=10;
        }

        for (int i = 1; i <= angkaAkhir; i++) {
            if ( i== 6 || i == 10) {
                continue;
            } else if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i+" ");
            }
        }
    }
}
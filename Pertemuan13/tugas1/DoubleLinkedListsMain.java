package Pertemuan13.tugas1;

import java.util.Scanner;

/**
 * DoubleLinkedListsMain
 */
public class DoubleLinkedListsMain {

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");

            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data penerima vaksin");
            System.out.println("3. Daftar oenerima vaksin");
            System.out.println("0. Keluar");
            System.out.println("++++++++++++++++++++++++++++");

            short pilih = sc.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("----------------------");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("----------------------");
                    System.out.print("Nomor antrian: ");
                    int tempNo = sc.nextInt();
                    System.out.print("Nama penerima: ");
                    String tempName = sc.next();
                    Pengantri tempData = new Pengantri(tempNo, tempName);
                    dll.addLast(tempData);
                    break;
                case 2:
                    System.out.println("+++++++++++++++++++++++++");
                    System.out.println(dll.head.data.nama+" telah divaksinasi.");
                    dll.removeFirst();
                    dll.print();
                    break;

                case 3:
                    dll.print();
                    break;
            
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
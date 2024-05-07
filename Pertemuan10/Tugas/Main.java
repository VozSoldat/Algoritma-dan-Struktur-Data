package Pertemuan10.Tugas;

import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Peek rear");
        System.out.println("6. Daftar pembeli");
        System.out.println("7. Peek position");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        Queue antri = new Queue(kapasitas);

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan no. HP: ");
                    int noHP = sc.nextInt();
                    sc.nextLine();
                    Pembeli pb = new Pembeli(nama, noHP);
                    antri.enqueue(pb);
                    break;

                case 2:
                    Pembeli data= antri.dequeue();
                    if (!"".equals(data.nama)  && data.noHP !=0) {
                        System.out.println("Antrian yang keluar: "+data.nama+" "+data.noHP);
                        break;
                    }

                case 3:
                    antri.peek();
                    break;

                case 4:
                    antri.print();
                    break;

                case 5:
                    antri.peekRear();
                    break;

                case 6:
                    antri.daftarPembeli();
                    break;

                case 7:
                System.out.print("Masukkan nama: ");
                String tempnama = sc.nextLine();
                    antri.peekPosition(tempnama);
                    break;
            
                default:
                    break;
            }
            
        } while (true);
    }
}

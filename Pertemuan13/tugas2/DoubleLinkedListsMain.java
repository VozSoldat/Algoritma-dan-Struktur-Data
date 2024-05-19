package Pertemuan13.tugas2;

import java.util.Scanner;

/**
 * DoubleLinkedListsMain
 */
public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        DoubleLinkedLists dll = new DoubleLinkedLists();

        while (true) {
            System.out.println("==============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("==============================");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data indeks tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data indeks tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID film");
            System.out.println("9. Urut data rating-DESC");
            System.out.println("0. Keluar");
            System.out.println("==============================");

            short pilih = sc.nextShort();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data film posisi awal");
                    System.out.println("ID Film: ");
                    int tempId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String tempJudul = sc.next();
                    System.out.println("Rating Film: ");
                    float tempRate = sc.nextFloat();
                    Film tempFilm = new Film(tempId, tempJudul, tempRate);
                    dll.addFirst(tempFilm);
                    break;

                case 2:
                    System.out.println("Masukkan data film posisi akhir");
                    System.out.println("ID Film: ");
                    int tempId2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String tempJudul2 = sc.next();
                    System.out.println("Rating Film: ");
                    float tempRate2 = sc.nextFloat();
                    Film tempFilm2 = new Film(tempId2, tempJudul2, tempRate2);
                    dll.addLast(tempFilm2);
                    break;

                case 3:
                    System.out.println("Masukkan data film urutan ke-");
                    int index = sc.nextInt();
                    System.out.println("ID Film: ");
                    int tempId3 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Judul Film: ");
                    String tempJudul3 = sc.next();
                    System.out.println("Rating Film: ");
                    float tempRate3 = sc.nextFloat();
                    Film tempFilm3 = new Film(tempId3, tempJudul3, tempRate3);
                    dll.add(tempFilm3, index);
                    break;

                case 4:
                    System.out.println("Hapus data pertama, yakni "+dll.head.data.judul);
                    dll.removeFirst();
                    break;

                case 5:
                    Node current = dll.head;
                    while (current.next.next != null) {
                        current = current.next;
                    }
                    System.out.println("Hapus data terakhir, yakni "+current.next.data.judul);
                    break;

                case 6:
                    System.out.println("Hapus data indeks ke-");
                    int index2 = sc.nextInt();
                    dll.remove(index2);
                    break;
                
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("Cari ID Film: ");
                    int tempId4 = sc.nextInt();
                    sc.nextLine();
                    dll.search(tempId4);
                    break;
                
                    case 9:
                        dll.sort();
                        dll.print();
                        break;


            
                
            }

        }

    }
}
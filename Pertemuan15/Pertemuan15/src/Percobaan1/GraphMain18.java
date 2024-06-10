package Percobaan1;
import java.util.Scanner;

public class GraphMain18 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph18 gedung = new Graph18(6);


        while (true) {
            
            System.out.println("Pilih menu:");
            System.out.println("1. Tambahkan edge");
            System.out.println("2. Hapus edge");
            System.out.println("3. degree");
            System.out.println("4. Print graph");
            System.out.println("5. cek edge");
            int pilih = sc.nextInt();
            
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                
                case 3:
                    System.out.println("Masukkan gedung: ");
                    asal = sc.nextInt();
                    gedung.degree(asal);
                    break;
                
                case 4:
                    gedung.printGraph();
                    break;
                
                case 5:
                    System.out.println("=====================");
                    System.out.println("Pengecekan edge");
                    System.out.println("=====================");
                    System.out.print("Masukkan gedung asal: ");
                     asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                     tujuan = sc.nextInt();
            
                    while (true) {
                        if (asal == tujuan) {
                            System.out.println("Gedung "+(char)('A'+asal)+" dan "+(char)('A'+tujuan)+" sama");
                            break;
                        }
                        if (gedung.cekEdge(asal, tujuan)) {
                            System.out.print("Gedung "+(char)('A'+asal)+" bertetangga dengan: "+(char)('A'+tujuan));
                            break;
                        }else{
                            System.out.println("Gedung "+(char)('A'+asal)+" tidak bertetangga dengan: "+(char)('A'+tujuan));
                            break;
                        }
                        // System.out.print("Gedung "+(char)('A'+asal)+" terhubung dengan: ");
                    }
                    break;
                    
                    case 6:
                    return;

                    case 10:
                    gedung.hitungEdge();
                    break;
                    
                    default:
                    // tes updateJarak
                    System.out.println("=====================");
                    System.out.println("Update jarak");
                    System.out.println("=====================");
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    System.out.print("Masukkan jarak: ");
                    jarak = sc.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
            }
        }

        // gedung.addEdge(0,1,50);
        // gedung.addEdge(0,2,100);
        // // gedung.addEdge(0,3,78);
        // gedung.addEdge(1,3,70);
        // gedung.addEdge(2,3,40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);

        
        

        // gedung.degree(0);
        // gedung.printGraph();
        
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();




    }
}

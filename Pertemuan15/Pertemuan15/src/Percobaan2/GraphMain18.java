package Percobaan2;

import java.util.Scanner;

public class GraphMain18 {
    public static void main(String[] args) {
        GraphMatriks18 gdg = new GraphMatriks18(4);
        
        Scanner sc = new Scanner(System.in);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil penghapusan edge");
        // gdg.removeEdge(2, 1);
        // gdg.printGraph();


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
                    gdg.makeEdge(asal, tujuan, jarak);
                    break;
                
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc.nextInt();
                    gdg.removeEdge(asal, tujuan);
                    break;
                
                case 3:
                    System.out.println("Masukkan gedung: ");
                    asal = sc.nextInt();
                    System.out.println("Degree: "+gdg.degree(asal));
                    System.out.println("InDegree: "+gdg.inDegree(asal));
                    System.out.println("OutDegree: "+gdg.outDegree(asal));
                    break;
                
                case 4:
                    gdg.printGraph();
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
                        if (gdg.cekEdge(asal, tujuan)) {
                            System.out.print("Gedung "+(char)('A'+asal)+" bertetangga dengan: "+(char)('A'+tujuan));
                        }else{
                            System.out.println("Gedung "+(char)('A'+asal)+" tidak bertetangga dengan: "+(char)('A'+tujuan));
                        }
                        // System.out.print("Gedung "+(char)('A'+asal)+" terhubung dengan: ");
                    }
                    break;
    
                case 6:
                    return;
            
                default:
                    break;
            }
            
        }


    //     System.out.println("==========================");
    //     System.out.println("Alat degree");
    //     System.out.println("==========================");
    //     Scanner sc = new Scanner(System.in);
    //     int pilih = sc.nextInt();
    //     System.out.println("InDegree: "+gdg.inDegree(pilih));
    //     System.out.println("OutDegree: "+gdg.outDegree(pilih));
    //     System.out.println("Degree: "+gdg.degree(pilih));
    }    
}

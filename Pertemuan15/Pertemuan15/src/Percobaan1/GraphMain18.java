package Percobaan1;
import java.util.Scanner;

public class GraphMain18 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph18 gedung = new Graph18(6);
        // gedung.addEdge(0,1,50);
        // gedung.addEdge(0,2,100);
        // // gedung.addEdge(0,3,78);
        // gedung.addEdge(1,3,70);
        // gedung.addEdge(2,3,40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);

        

        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.println("=====================");
        System.out.println("Pengecekan edge");
        System.out.println("=====================");
        System.out.print("Masukkan gedung asal: ");
        int asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc.nextInt();

        while (true) {
            if (asal == tujuan) {
                System.out.println("Gedung "+(char)('A'+asal)+" dan "+(char)('A'+tujuan)+" sama");
                break;
            }
            if (gedung.cekEdge(asal, tujuan)) {
                System.out.print("Gedung "+(char)('A'+asal)+" bertetangga dengan: "+(char)('A'+tujuan));
            }else{
                System.out.println("Gedung "+(char)('A'+asal)+" tidak bertetangga dengan: "+(char)('A'+tujuan));
            }
            // System.out.print("Gedung "+(char)('A'+asal)+" terhubung dengan: ");
        }

    }
}

package Percobaan2;

import java.util.Scanner;

public class GraphMain18 {
    public static void main(String[] args) {
        GraphMatriks18 gdg = new GraphMatriks18(4);
        
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();


        System.out.println("==========================");
        System.out.println("Alat degree");
        System.out.println("==========================");
        Scanner sc = new Scanner(System.in);
        int pilih = sc.nextInt();
        System.out.println("InDegree: "+gdg.inDegree(pilih));
        System.out.println("OutDegree: "+gdg.outDegree(pilih));
        System.out.println("Degree: "+gdg.degree(pilih));
    }    
}

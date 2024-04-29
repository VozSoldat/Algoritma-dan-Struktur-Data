package Pertemuan8;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infinix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        
        int total = Q.length();

        Postfix18 post = new Postfix18(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
   
}

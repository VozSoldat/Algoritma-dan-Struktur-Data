package Pertemuan10.Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------");

    }
    public static void main(String[] args) {
        System.out.println("Masukkan kapasitas Queue: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue(n);
        
    }
}

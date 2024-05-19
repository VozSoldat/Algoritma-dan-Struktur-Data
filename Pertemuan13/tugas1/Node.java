package Pertemuan13.tugas1;

public class Node {
    Pengantri data;
    Node prev, next;

    Node(Node prev, Pengantri data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

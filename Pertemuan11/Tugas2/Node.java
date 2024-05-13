package Pertemuan11.Tugas2;

/**
 * Node
 */
public class Node {

    Mahasiswa data;
    Node next;

    Node(Mahasiswa data, Node next) {
        this.data = data;
        this.next = next;
    }
}
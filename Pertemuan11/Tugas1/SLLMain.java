package Pertemuan11.Tugas1;


public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        Mahasiswa mhs1 = new Mahasiswa(111, "Aldo");
        Mahasiswa mhs2 = new Mahasiswa(112, "Budi");
        Mahasiswa mhs3 = new Mahasiswa(113, "Caca");
        Mahasiswa mhs4 = new Mahasiswa(114, "Dodi");
        Mahasiswa mhs5 = new Mahasiswa(115, "Eka");

        singLL.addFirst(mhs1);
        singLL.print();
        singLL.addLast(mhs3);
        singLL.print();
        singLL.insertAt(1, mhs2);
        singLL.print();
        singLL.addLast(mhs5);
        singLL.print();
        singLL.insertAfter(113, mhs4);
        singLL.print();

    }
}
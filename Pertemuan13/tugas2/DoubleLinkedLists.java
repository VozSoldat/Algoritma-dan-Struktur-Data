package Pertemuan13.tugas2;

public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(Film item){
        if (isEmpty()) {
            head = new Node (null, item, null);

        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(Film item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(Film item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        
        if (index == 0) {
            addFirst(item);
            return;
        } else if (index == size) {
            addLast(item);
            return;
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                if (current == null) {
                    throw new Exception("Unexpected null node at index " + i);
                }
                current = current.next;
                i++;
            }
            
            Node newNode = new Node(current.prev, item, current);
            
            if (current.prev != null) {
                current.prev.next = newNode;
            }
            current.prev = newNode;
            
            size++;
        }
    }
    
    
    
        public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print() {
        if(isEmpty()) {
            System.out.println("Linked lists kosong");
        } else {
            Node tmp = head;
            int i = 0;
            while(tmp != null) {
                System.out.print("ID: " + tmp.data.kode + "\n  Judul Film: " + tmp.data.judul + "\n  Rating: " + tmp.data.rating + "\n\n");
                tmp = tmp.next;
                i++;
            }
            System.out.println("Jumlah Data: " + i);
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0) {
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public Film getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        return head.data;
    }
    public Film getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public Film get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void search(int id) {
        int posisi = -1;
        Node current = head;
        int i = 1;
        while(current != null) {
            if(current.data.kode == id) {
                posisi = i;
                break;
            }
            current = current.next;
            i++;
        }

        if (posisi != -1) {
            System.out.println("Data Id Film: " + id + ", berada pada urutan ke-" + posisi);
            System.out.println("IDENTITAS");
            System.out.println("  ID Film: " + current.data.kode);
            System.out.println("  Judul Film: " + current.data.judul);
            System.out.println("  Rating Film: " + current.data.rating);
        } else {
            System.out.println("Data Id Film: " + id + ", tidak ditemukan");
        }
    }
    public void sort() {
        Node current;
        Node index;
        Film temp;
    
        if (!isEmpty()) {
            current = head;
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.rating < index.data.rating) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        } else {
            System.out.println("Linked list masih kosong, tidak dapat mengurutkan data!");
        }
    }

}

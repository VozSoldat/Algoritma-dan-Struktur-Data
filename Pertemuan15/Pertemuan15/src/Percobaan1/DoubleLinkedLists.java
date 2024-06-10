package Percobaan1;
public class DoubleLinkedLists {
    Node18 head;
    int size;

    public DoubleLinkedLists(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }


    public void addLast(int item, int jarak){
        if (isEmpty()) {
            addFirst(item,jarak);
        }else{
            Node18 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node18 newNode = new Node18(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node18(null, item, jarak, null);
        } else {
            Node18 newNode = new Node18(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("NIlai index di luar batas");
        }
        Node18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index){
       Node18 current = head;
       while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
       }
        size--;
    }

    public int size(){
        return size;
    }

    public int get(int index)throws Exception{
        if (index >= size) {
            throw new Exception("Nilai index diluar batas");
        }
        Node18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int getByData(int data) throws Exception{
        Node18 tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.data == data) {
                return i;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void updateData(int tujuan, int jarak){
        Node18 current = head;
        while (current != null) {
            if (current.data == tujuan) {
                break;
            }
            current.data = current.jarak;
            current = current.next;
        }

        current.jarak = jarak;

    }
}
package Pertemuan10.Tugas;

/**
 * Queue
 */
public class Queue {

    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        antrian= new Pembeli[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: "+antrian[front].nama + " "+antrian[front].noHP);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println(antrian[front].nama + " "+antrian[front].noHP);
                i = (i +1 )%max;
        }
        System.out.println(antrian[front].nama + " "+antrian[front].noHP);
        System.out.println("Jumlah elemen = "+size);}
    }
    // public void clear(){
    //     if(!isEmpty()){
    //         front = rear = -1;
    //         size = 0;
    //         System.out.println("Queue berhasail dikosongkan");
    //     }else{
    //         System.out.println("Queue masih kosong");
    //     }
    // }
    public void enqueue(Pembeli dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if (isEmpty()) {
                front = rear = 0;
            }else{
                if (rear==max-1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }
    public Pembeli dequeue(){
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else{
                if (front == max -1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Antrian terakhir: "+ antrian[rear].nama);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void  peekPosition(String nama){
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (antrian[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("Elemen di posisi ke-"+(i+1));
                }
                i = (i +1 )%max;
            }
            if (antrian[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Elemen di posisi ke-"+(i+1));
            }
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void daftarPembeli(){
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " "+antrian[i].noHP);
                i = (i +1 )%max;
            }
            System.out.println(antrian[i].nama + " "+antrian[i].noHP);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    
}
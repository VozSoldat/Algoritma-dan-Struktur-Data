import java.util.Scanner;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Standings: ");
            System.out.println("====================");
            System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", "Rank", "Tim", "Game", "Menang", "Kalah", "Poin");
            int i = 1;
            while(tmp != null){
                System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", i, tmp.data.namaCLub, tmp.data.jmlMatch, tmp.data.jmlMenang, tmp.data.jmlKalah, tmp.data.point);
                tmp = tmp.next;
                i++;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    void addFirst(Club input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }   
    }
    void addLast (Club input){
        Node ndInput = new Node(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        }else{
            head = ndInput;
            tail = ndInput;
        }
        sort();
    }
    // void insertAfter (int key, Club input){
    //     Node ndInput = new Node(input, null);
    //     Node temp = head;
    //     do{
    //         if (temp.data.` == key) {
    //             ndInput.next = temp.next;
    //             temp.next = ndInput;
    //             if (ndInput.next != null) {
    //                 tail = ndInput;
    //                 break;
    //             }
    //         }
    //         temp = temp.next;
    //     }while (temp == null);
    // }
    // void insertAt(int index, int input){
    //     Node ndInput = new Node(input, null);
    //     if (index==-1) {
    //         System.out.println("Salah");

    //     }else if (index == 0) {
    //         addFirst(input);
    //     }else{
    //         Node temp = head;
    //         for (int i = 0; i < index-1; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = new Node(input, temp.next);
    //         if (temp.next.next == null) {
    //             tail=temp.next;
    //         }
    //     }
    // }
    Club getData(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    // int indexOf(int Club){
    //     Node tmp =head;
    //     int index = 0;
    //     while (tmp != null && tmp.data != key) {
    //         tmp = tmp.next;
    //         index++;
    //     }
    //     if (tmp == null) {
    //         return 1;
    //     }else{
    //         return index;
    //     }
    // }
    void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masing kosong, tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
            
        }else{
            head = head.next;
        }
    }
    void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");

        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }
    void remove (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan rank club yang ingin di hapus: ");
        int rank = sc.nextInt();
        // System.out.println("Club " + clubDelete + " telah di hapus");
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");

        }else{
            Node temp = head;
            int i=1;
            while (temp !=null) {
                if (rank==1 && temp == head) {
                    System.out.println("Club " + temp.data.namaCLub + " telah di hapus");
                    removeFirst();
                    break;
                }else if (i+1==rank) {
                    System.out.println("Club " + temp.next.data.namaCLub + " telah di hapus");
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
                i++;
            }
        }
        sc.close();
    }
    // void remove (String namaClub){
    //     if (isEmpty()) {
    //         System.out.println("Linked list masih kosong, tidak dapat dihapus");

    //     }else{
    //         Node temp = head;
    //         while (temp !=null) {
    //             if (temp.data.namaCLub.equalsIgnoreCase(namaClub)==false && temp!=head) {
    //                 removeFirst();
    //                 break;
    //             }else if (temp.next.data.namaCLub.equalsIgnoreCase(namaClub)==true) {
    //                 temp.next = temp.next.next;
    //                 if (temp.next == null) {
    //                     tail = temp;
    //                 }
    //                 break;
    //             }
    //             temp = temp.next;
    //         }
    //     }
    // }
    // public void removeAt(int index){
    //     if (index == 0) {
    //         removeFirst();
    //     }else{
    //         Node temp = head;
    //         for (int i = 0; i < index-1; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = temp.next.next;
    //         if (temp.next == null) {
    //             tail = temp;
    //         }
    //     }
    // }
    public void search(String namaClub){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if (temp.data.namaCLub.equalsIgnoreCase(namaClub)) {
                System.out.printf("| %-12s | %-12s | %-12s | %-12s | %-12s | %-12s |\n", i, temp.data.namaCLub, temp.data.jmlMatch, temp.data.jmlMenang, temp.data.jmlKalah, temp.data.point);
                break;
            }
            temp = temp.next;
            i++;
        }
    }
    public void sort(){
        Node temp = head;
        while (temp != null) {
            Node temp2 = temp.next;
            while (temp2 != null) {
                if (temp.data.point < temp2.data.point) {
                    Club temp3 = temp.data;
                    temp.data = temp2.data;
                    temp2.data = temp3;
                }
                temp2 = temp2.next;
            }
            temp = temp.next;
        }
    }
    public void edit(){
        System.out.println("Masukkan rank club yang ingin di edit datanya: ");
        Scanner sc = new Scanner(System.in);
        int rank = sc.nextInt();
        
        Node temp = head;
        int i=1;
        while (temp !=null) {
            if (rank==1 && temp == head) {
                System.out.print("Masukkan data jumlah game: ");
                temp.data.jmlMatch = sc.nextInt();
                System.out.print("Masukkan data jumlah menang: ");
                temp.data.jmlMenang = sc.nextInt();
                System.out.print("Masukkan data jumlah kalah: ");
                temp.data.jmlKalah = sc.nextInt();
                System.out.print("Masukkan data akumulasi poin: ");
                temp.data.point = sc.nextInt();
                break;
            }else if (i+1==rank) {
                // System.out.println("Club " + temp.next.data.namaCLub + " telah di hapus");
                // temp.next = temp.next.next;
                System.out.print("Masukkan data jumlah game: ");
                temp.data.jmlMatch = sc.nextInt();
                System.out.print("Masukkan data jumlah menang: ");
                temp.data.jmlMenang = sc.nextInt();
                System.out.print("Masukkan data jumlah kalah: ");
                temp.data.jmlKalah = sc.nextInt();
                System.out.print("Masukkan data akumulasi poin: ");
                temp.data.point = sc.nextInt();
                break;
            }
            temp = temp.next;
            i++;
            
        }
        sort();
        sc.close();
    }
    
    
}


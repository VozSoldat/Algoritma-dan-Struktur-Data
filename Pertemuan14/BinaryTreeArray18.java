package Pertemuan14;

public class BinaryTreeArray18 {
    int[] data;
    int idxLast;

    public BinaryTreeArray18(){
        data= new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    public void add(int input) {
        data[idxLast] = input;
        idxLast++;
        
        int currentIndex = idxLast - 1;
        while (currentIndex > 0) {
            int parentIndex = (currentIndex - 1) / 2;
            if (data[currentIndex] < data[parentIndex]) {
                int temp = data[currentIndex];
                data[currentIndex] = data[parentIndex];
                data[parentIndex] = temp;
                currentIndex = parentIndex;
            } else {
                break;
            }
        }
    }
    public void traversePreorder() {
        traversePreorder(0);
    }
    public void traversePreorder(int index) {
        if (index < idxLast) {
            System.out.print(data[index]+" ");
            traversePreorder(index * 2 + 1);
            traversePreorder(index * 2 + 2);
        }
    }
    public void traversePostorder() {
        traversePostorder(0);
    }
    public void traversePostorder(int index) {
        if (index < idxLast) {
            traversePostorder(index * 2 + 1);
            traversePostorder(index * 2 + 2);
            System.out.print(data[index]+" ");
        }
    }
}

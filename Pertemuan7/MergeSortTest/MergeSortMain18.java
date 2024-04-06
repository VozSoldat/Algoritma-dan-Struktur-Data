package Pertemuan7.MergeSortTest;

public class MergeSortMain18 {
    public static void main(String[] args) {
        int[] data = {10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting18 mSort = new MergeSorting18();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.sort(data, 0, data.length-1);
        System.out.println("data setelah diurutkan");
        mSort.printArray(data);
    }
    
}

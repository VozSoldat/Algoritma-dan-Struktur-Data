package Pertemuan7.MergeSortTest;

/**
 * MergeSorting18
 */
public class MergeSorting18 {

    public void mergeSort(int[] data, int left, int middle, int right){
        int[] temp = new int[right - left + 1];
        for (int i = left; i <= right; i++) {
            temp[i - left] = data[i];
        }

        int a = 0;
        int b = middle - left + 1;
        int c = left;

        while (a <= middle - left && b <= right - left) {
            if (temp[a] <= temp[b]) {
                data[c]= temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - left - a;
        for (int i = 0; i <= s; i++) {
            data[c+i] = temp[a+i];
        }
    }
    
    public void sort(int data[], int left, int right){
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            mergeSort(data, left, middle, right);
        }
    }

    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

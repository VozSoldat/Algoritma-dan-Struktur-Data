package UTS;

import java.util.Scanner;

public class DataSaya {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SiData data = new SiData();
        System.out.println("length="+data.siData.length);
        System.out.println("==========================\nSebelum sorting\n==========================");
        data.cetak();
        System.out.println("\n");
        
        System.out.println("==========================\nSetelah sorting\n==========================");
        data.insertionSort();
        data.cetak();
        System.out.println("\n");

        System.out.println("==========================\nMencari isi data setelah sorted dengan binary search\n==========================");
        System.out.print("Masukkan data: ");
        int cari = sc.nextInt();
        if (data.binarySearch(cari, 0, data.siData.length-1)!=-1) {
            System.out.println("Data yang dicari berada pada indeks "+data.binarySearch(cari, 0, data.siData.length-1));
        }else{
            System.out.println("Data tidak ditemukan");
        }
        
        
        
        sc.close();
    }
    
    
}

class SiData{
    int[] siData = {38, 39, 16, 34, 20, 49, 4, 12, 41, 11, 29, 22, 33, 1, 34, 25, 8};

    void insertionSort(){
        for (int i = 1; i < siData.length; i++) {
            int temp = siData[i];
            int j = i;
            while (j > 0 && siData[j-1] > temp) {
                siData[j] = siData[j-1];
                j--;
            }
            siData[j] = temp;
        }
    }

    int binarySearch(int cari, int left, int right){
        int mid;
        if (left<= right) {
            mid = (left+right)/2;

            if (cari == siData[mid]) {
                return mid;
            }else if(siData[mid] > cari){
                return binarySearch(cari, left, mid-1);
            }else if(siData[mid] < cari){
                return binarySearch(cari, mid+1, right);

            }
        }
            return -1;
        
    }

    void cetak(){
        for (int i = 0; i < siData.length; i++) {
            System.out.print(siData[i]+"   ");
        }
    }
}

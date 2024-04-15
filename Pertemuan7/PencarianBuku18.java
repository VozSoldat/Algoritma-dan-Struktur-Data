package Pertemuan7;

import Pertemuan6.DaftarMahasiswaBerprestasi;

public class PencarianBuku18 {
    Buku18 listBk[] = new Buku18[5];
    int idx;

    void tambah(Buku18 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for (Buku18 m : listBk) {
            m.tampilDataBuku();
        }
    }

    int findSeqSearch(int cari){
        int posisi = 2;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku == cari) {
                    posisi = j;
                    break;
                }else{
                    posisi = -1;
                }
            }
            return posisi;
        }
      

    void tampilPosisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode buku \t : "+x);
            System.out.println("Judul \t : "+listBk[pos].judulBukul);
            System.out.println("Tahun terbit \t : "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : "+listBk[pos].pengarang);
            System.out.println("Stock \t : "+listBk[pos].stock);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    int findBinarySearch(int cari, int left, int right){
        

        int mid;
        if (right >= left) {
            mid = (left + right)/2;

            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            }else if (listBk[mid].kodeBuku > cari){
                return findBinarySearch(cari, left, mid-1);
            }else if(listBk[mid].kodeBuku < cari) {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    public Buku18 findBuku(String Buku18) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].equals(Buku18)) {
                return listBk[j];
            }
        }
        return null;
    }
    
}

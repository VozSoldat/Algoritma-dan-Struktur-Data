package Pertemuan7.LatihanPraktik2;



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

    int findSeqSearch(String cari){
        int posisi = 2;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku.equals(cari)) {
                    posisi = j;
                    break;
                }else{
                    posisi = -1;
                }
            }
            return posisi;
        }
      

    void tampilPosisi(String x, int pos){
        if (pos != -1) {
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }

    void tampilData(String x, int pos){
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

    int findBinarySearch(String cari, int left, int right){
        for (int i = 1; i < listBk.length; i++) { // insertion sort
            Buku18 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j-1].kodeBuku.compareTo(temp.kodeBuku) > 0) {
                listBk[j] = listBk[j-1];
                j--;
            }
            listBk[j] = temp;
        }

        int mid;
        if (right >= left) {
            mid = (left + right)/2;

            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            }else if (listBk[mid].kodeBuku.compareTo(cari) > 0){
                return findBinarySearch(cari, left, mid-1);
            }else if(listBk[mid].kodeBuku.compareTo(cari) < 0) {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}

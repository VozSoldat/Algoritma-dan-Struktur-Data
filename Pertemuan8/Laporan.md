# 7. Searching

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 2. Percobaan 1
### 2.1. Langkah-Langkah Percobaan
1. -

### 2.2. Verifikasi Hasil Percobaan
-

### 2.3. Pertanyaan
1. -

### Jawaban
1. 

## 3. Percobaan 2
### 3.1. Langkah-Langkah Percobaan
1. -
### 3.2. Verifikasi Hasil Percobaan
	-----------------------------
	Masukkan data Buku secara Urut dari KodeBuku Terkecil :
	------------------------
	Kode buku       : 111
	Judul buku       : Algoritma
	Tahun Terbit     : 2019
	Pengarang        : Wahyuni
	Stock    : 5
	------------------------
	Kode buku       : 123
	Judul buku       : Big Data
	Tahun Terbit     : 2020
	Pengarang        : Susilo
	Stock    : 3
	------------------------
	Kode buku       : 125
	Judul buku       : Desain UI
	Tahun Terbit     : 2021
	Pengarang        : Supriadi
	Stock    : 3
	------------------------
	Kode buku       : 126
	Judul buku       : Web Programming
	Tahun Terbit     : 2022
	Pengarang        : Pustaka Adi
	Stock    : 2
	------------------------
	Kode buku       : 127
	Judul buku       : Etika Mahasiswa
	Tahun Terbit     : 2023
	Pengarang        : Darmawan Adi
	Stock    : 2
	--------------------------------
	Data keseluruhan Buku :
	==================================
	Kode buku: 111
	Judul buku: Algoritma
	Tahun terbit: 2019
	Pengarang: Wahyuni
	Stock: 5
	==================================
	Kode buku: 123
	Judul buku: Big Data
	Tahun terbit: 2020
	Pengarang: Susilo
	Stock: 3
	==================================
	Kode buku: 125
	Judul buku: Desain UI
	Tahun terbit: 2021
	Pengarang: Supriadi
	Stock: 3
	==================================
	Kode buku: 126
	Judul buku: Web Programming
	Tahun terbit: 2022
	Pengarang: Pustaka Adi
	Stock: 2
	==================================
	Kode buku: 127
	Judul buku: Etika Mahasiswa
	Tahun terbit: 2023
	Pengarang: Darmawan Adi
	Stock: 2
	_____________________________
	____________________________
	Pencarian Data :
	Masukkan kode buku yang dicari:
	Kode buku :
	126
	Menggunakan sequential search
	data : 126 ditemukan pada indeks 3
	Kode buku        : 126
	Judul    : Web Programming
	Tahun terbit     : 2022
	Pengarang        : Pustaka Adi
	Stock    : 2
	=======================
	menggunakan binary search
	data : 126 ditemukan pada indeks 3
	Kode buku        : 126
	Judul    : Web Programming
	Tahun terbit     : 2022
	Pengarang        : Pustaka Adi
	Stock    : 2

### 3.3. Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan! 
2. Tunjukkan pada kode program yang mana proses conquer dijalankan! 
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? 
4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!
### Jawaban
1. Divide berangsung pada bagian pembagian array menjadi sisi kiri dan kanan. Kemudian program akan melihat apakah bilangan yang dicari ada di sebelah kiri atau kanan, dan kemudian proses berlangsung terus menerus hingga bilangan ditemukan.
```java
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
``` 

2. Proses conquer berlangsung dengan memeriksa apakah nilai pada variabel mid kurang dari nilai yang dicari atau lebih dari. Jika kurang dari, maka array kiri akan dicari mid-nya. Jika lebih dari, maka array kanan akan dicari mid-nya. Antara kedua proses akan berlanjut dengan array-nya masing-masing.
3. Program tidak dapat berjalan.
![](Pasted%20image%2020240415140251.png)
Hal tersebut karena cara kerja binary search yang membutuhkan urutan array yang terurut. Algoritma binary search membagi array menjadi bagian kanan dan kiri, kemudian antara kedua array akan dipilih mana yang akan dikerjakan berdasarkan perbandingan antara bilangan yang dicari dan bilangan variabel mid.

5. Algoritma yang asli berjalan dengan asumsi bahwa array telah diurutkan secara ascending. Kode program tidak bisa berjalan jika input kode buku berupa urutan array descending. Cara agar program dapat berjalan ialah dengan menambahkan sorting descending agar urutan array pasti descending.
```java
int findBinarySearch(int cari, int left, int right){
        // sorting descending
        for (int i = 1; i < listBk.length; i++) {
            Buku18 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j-1].kodeBuku > temp.kodeBuku) {
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
            }else if (listBk[mid].kodeBuku > cari){
                return findBinarySearch(cari, left, mid-1);
            }else if(listBk[mid].kodeBuku < cari) {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
```

## 4. Percobaan 3
### 4.1. Langkah-Langkah Percobaan
1. Buatlah Package baru didalam package P5 dengan nama MergeSortTest 
2. Tambahkan class MergeSortingNoAbsen pada package tersebut 
3. Pada class MergeSortingNoAbsen buatlah method mergeSort yang menerima parameter data array yang akan diurutkan 
4. Buatlah method merge untuk melakukan proses penggabungan data dari bagian kiri dan kanan.
5. Implementasikan proses merge sebagai berikut. 
6. Buatlah method sort 
7. Implementasikan kode berikut pada method sort 
8. Pada method mergeSort, panggil method sort dengan parameter data yang ingin diurutkan serta range data awal sampai dengan akhir. 
9. Tambahkan method printArray
10. Sebagai langkah terakhir, deklarasikan data yang akan diurutkan kemudian panggil proses sorting pada class MergeSortMainNoAbsen. Tambahkan fungsi main pada kelas tersebut, kemudian tuliskan kode berikut didalam fungsi main.
### 4.2. Verifikasi Hasil Percobaan
	sorting dengan merge sort
	data awal
	10 40 30 50 70 20 100 90 
	data setelah diurutkan
	10 20 30 40 50 70 90 100 

## 5. Latihan Praktikum

### Jawaban
1. Hasil lihat `Pertemuan7\LatihanPraktik1`
2. Hasil lihat `Pertemuan7\LatihanPraktik2`
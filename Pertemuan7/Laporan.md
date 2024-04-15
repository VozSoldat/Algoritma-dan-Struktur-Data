# 6. Searching

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 6.2. Percobaan 1
### 6.2.1. Langkah-Langkah Percobaan
1. Buatlah Project baru pada dengan nama TestSearching 
2. Kemuadian buat packages baru dengan nama P7 
3. Buat class BukuNoAbsen, kemudian deklarasikan atribut berikut ini: 
4. Buatlah konstruktor dengan nama Buku dengan parameter (String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) kemudian Isi konstruktor tersebut dengan kode berikut! Catatan : Perhatikan konstruktor diatas! Apakah sudah benar? Jika belum, maka perbaiki konstruktor diatas 
5. Buatlah method tampilDataBuku bertipe void.
6. Buat class baru dengan nama PencarianBukuNoAbsen seperti di bawah ini! 
7. Tambahkan method tambah() di dalam class tersebut! Method tambah() digunakan untuk menambahkan objek dari class Buku ke dalam atribut listBk. 
8. Tambahkan method tampil() di dalam class PencarianBukuNoAbsen Method tampil() digunakan untuk menampilkan semua data buku yang ada di dalam class tersebut! Perhatikan penggunaan sintaks for yang menggunakan konsep for-each. Syntax tersebut akan memberikan tanda error berupa garis merah, Perbaiki agar tidak ada error!
9. Tambahkan method FindSeqSearch bertipe integer dengan parameter cari bertipe int. Kemudian Deklarasikan isi method FindSeqSearch dengan algoritma pencarian data menggunakan teknik sequential searching.
10. Buatlah method Tampilpoisisi bertipe void dan Deklarasikan isi dari method Tampilpoisisi. 
11. Buatlah class baru dengan nama BukuMainNoAbsen tambahkan method main. buatlah sebuah objek PencarianMhs dan buatlah 5 objek buku kemudian tambahkan semua objek buku tersebut dengan memanggil fungsi tambah pada objek PencarianBuku. Note : perbaiki kode jika terdapat kesalahan.
12. Panggil method tampil() untuk melihat semua data yang telah dimasukan. 
13. Untuk melakukan pencarian berdasarkan kode buku. Buatlah variable cari yang dapat menampung masukan dari keyboard lalu panggil method FindSeqSearch dengan isi parameternya adalah variable cari. Untuk menampilkan index data yang dicari panggil method TampilPosisi Verifikasi hasil pencarian :
14. Panggil method tampil() untuk melihat semua data yang telah dimasukan. 
15. Untuk melakukan pencarian berdasarkan kode buku. Buatlah variable cari yang dapat menampung masukan dari keyboard lalu panggil method FindSeqSearch dengan isi parameternya adalah variable cari. Untuk menampilkan index data yang dicari panggil method TampilPosisi Verifikasi hasil pencarian :
16. Jalankan dan amati hasilnya.

### 6.2.2. Verifikasi Hasil Percobaan
#### Jika ditemukan
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
	111
	Menggunakan sequential search
	data : 111 ditemukan pada indeks 0
	Kode buku        : 111
	Judul    : Algoritma
	Tahun terbit     : 2019
	Pengarang        : Wahyuni
	Stock    : 5

#### Jika tidak ditemukan
	____________________________
	Pencarian Data :
	Masukkan kode buku yang dicari:
	Kode buku :
	124
	Menggunakan sequential search
	data 124 tidak ditemukan
	data 124 tidak ditemukan

### 6.2.3. Pertanyaan
1. Jelaskan fungsi break yang ada pada method `FindSeqSearch`! 
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil *screenshoot* untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? 
3. Buat method baru dengan nama `FindBuku` menggunakan konsep sequential search dengan tipe method dari `FindBuku` adalah `BukuNoAbsen`. Sehingga Anda bisa memanggil method tersebut pada class `BukuMain` seperti gambar berikut :

### Jawaban
1. `break` berfungsi untuk mengakhiri perulangan pada saat itu juga.
2. Program dapat berjalan dengan benar. Hal tersebut terjadi karena cara kerja algoritma sequential search yang memeriksa data dari kiri ke kanan, tanpa memedulikan besar nilai data yang dicari. 
#
	-----------------------------
	Masukkan data Buku secara Urut dari KodeBuku Terkecil : 
	------------------------
	Kode buku       : 5
	Judul buku       : Q
	Tahun Terbit     : 2
	Pengarang        : W
	Stock    : 2
	------------------------
	Kode buku       : 1
	Judul buku       : D
	Tahun Terbit     : 2
	Pengarang        : E
	Stock    : 2
	------------------------
	Kode buku       : 3
	Judul buku       : R
	Tahun Terbit     : 3
	Pengarang        : R
	Stock    : 3
	------------------------
	Kode buku       : 4
	Judul buku       : R
	Tahun Terbit     : 3
	Pengarang        : R
	Stock    : 3
	------------------------
	Kode buku       : 2
	Judul buku       : E
	Tahun Terbit     : 4
	Pengarang        : E
	Stock    : 4
	--------------------------------
	Data keseluruhan Buku :
	==================================
	Kode buku: 5
	Judul buku: Q
	Tahun terbit: 2
	Pengarang: W
	Stock: 2
	==================================
	Kode buku: 1
	Judul buku: D
	Tahun terbit: 2
	Pengarang: E
	Stock: 2
	==================================
	Kode buku: 3
	Judul buku: R
	Tahun terbit: 3
	Pengarang: R
	Stock: 3
	==================================
	Kode buku: 4
	Judul buku: R
	Tahun terbit: 3
	Pengarang: R
	Stock: 3
	==================================
	Kode buku: 2
	Judul buku: E
	Tahun terbit: 4
	Pengarang: E
	Stock: 4
	_____________________________
	____________________________
	Pencarian Data :
	Masukkan kode buku yang dicari:
	Kode buku :
	4
	Menggunakan sequential search
	data : 4 ditemukan pada indeks 3
	Kode buku        : 4
	Judul    : R
	Tahun terbit     : 3
	Pengarang        : R
	Stock    : 3
	=======================

3. Jawaban
```java
 public Buku18 findBuku(String Buku18) {

        for (int j = 0; j < listBk.length; j++) {

            if (listBk[j].equals(Buku18)) {

                return listBk[j];

            }

        }

        return null;

    }
```
```java
System.out.println("=======================");

        Buku18 dataBuku18 = data.findBuku(Integer.toString(cari));

        dataBuku18.tampilDataBuku();
```

## 6.3. Percobaan 2
### 6.3.1. Langkah-Langkah Percobaan
1. Pada percobaan 6.2.1 (sequential search) tambahkan method FindBinarySearch bertipe integer pada class PencarianBukuNoAbsen. Kemudian Deklarasikan isi method FindBinarySearch dengan algoritma pencarian data menggunakan teknik binary searching. 
2. Panggil method FindBinarySearch di kelas BukuMainNoAbsen. Kemudia panggil method tampilposisi dan tampilData
3. Jalankan dan amati hasilnya.
### 6.3.2. Verifikasi Hasil Percobaan
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

### 6.3.3. Pertanyaan
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

## 6.4. Percobaan 3
### 6.4.1. Langkah-Langkah Percobaan
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
### 6.4.2. Verifikasi Hasil Percobaan
	sorting dengan merge sort
	data awal
	10 40 30 50 70 20 100 90 
	data setelah diurutkan
	10 20 30 40 50 70 90 100 

## 6.5. Latihan Praktikum

### Jawaban
1. Hasil lihat `Pertemuan7\LatihanPraktik1`
2. Hasil lihat `Pertemuan7\LatihanPraktik2`
# 5. Sorting (Bubble, Selection, dan Insertion Sort)

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 5.2. Percobaan 1
### 5.2.1. Langkah-Langkah Percobaan
1. Buat project baru dengan nama “bubble-selection-insertion”, kemudian buat package dengan nama “jobsheet6”. 
2. Buatlah sebuah class dengan nama Mahasiswa 
3. Sesuaikan class Mahasiswa dengan melihat class diagram di atas dengan menambahkan attribute, konstruktor, dan fungsi atau method. Untuk lebih jelasnya class tersebut dapat dilihat pada potongan kode di bawah ini
4. Buat class DaftarMahasiswaBerprestasi seperti di bawah ini!
5. Tambahkan method tambah() di dalam class tersebut! Method tambah() digunakan untuk menambahkan objek dari class Mahasiswa ke dalam atribut listMhs.
6. Tambahkan method tampil() di dalam class tersebut! Method tampil() digunakan untuk menampilkan semua data mahasiswa-mahasiswa yang ada di dalam class tersebut! Perhatikan penggunaan sintaks for yang agak berbeda dengan for yang telah dipelajari sebelumnya, meskipun secara konsep sebenarnya mirip. 
7. Tambahkan method bubbleSort() di dalam class tersebut! 8. Buat class Main dan didalamnya buat method main() seperti di bawah ini! 
8. Buat class Main dan didalamnya buat method main() seperti di bawah ini!
9. Di dalam method main(), buatlah sebuah objek DaftarMahasiswaBerprestasi dan buatlah 5 objek mahasiswa kemudian tambahkan semua objek mahasiswa tersebut dengan memanggil fungsi tambah pada objek DaftarMahasiswaBerprestasi. Silakan dipanggil fungsi tampil() untuk melihat semua data yang telah dimasukan, urutkan data tersebut dengan memanggil fungsi bubbleSort() dan yang terakhir panggil fungsi tampil kembali.
### 5.2.2. Verifikasi Hasil Percobaan
	Data mahasiswa sebelum sorting = 
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Data mahasiswa setelah sorting desc berdasarkan ipk
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75

### 5.2.3. Pertanyaan
1. Terdapat di method apakah proses bubble sort? 
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini: Untuk apakah proses tersebut? 
	```java
	if(listMhs[j].ipk > listMhs[j-1].ipk) {
	//di bawah ini proses swap atau penukaran
	Mahasiswa tmp = listMhs[j];
	listMhs[j] = listMhs[j-1];
	listMhs[j-1] = tmp;
	}
	```

3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
	```java
	for(int i=0; i<listMhs.length-1; i++) {
		for(int j=1; j<listMhs.length-i; j++){
	```
	1. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
	2. Mengapa syarat dari perulangan i adalah `i<listMhs.length-1`?
	3. Mengapa syarat dari perulangan j adalah `j<listMhs.length-i`
	4. Jika banyak data di dalam `listMhs` adalah 50, maka berapa kali perulangan `i` akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
### Jawaban
1. Proses bubble sort terdapat pada method `bubbleSort()`.
2. Kode tersebut berfungsi untuk memeriksa apakah nilai elemen `n` lebih besar dari elemen sebelumnya. Jika iya, program membuat object `tmp` (temporary) untuk menyimpan `listMhs[j]` sementara. Kemudian `listMhs[j]` itu sendiri diisi dengan `listMhs[j-1]` dan `listMhs[j-1]` diisi dengan isi `tmp`.
3. nomor 3
	1. Kegunaan loop j adalah untuk mengecek elemen dalam array. Kegunaan loop i adalah untuk mengulangi pengecekan elemen array pada tahap selanjutnya. Hal tersebut karena algoritma bubble sort memerlukan pengecekan array berulang. 
	2. Perulangan loop luar dengan `i<listMhs.length-1` yaitu untuk mencegah IndexOutOfBound.
	3. Kegunaan `j<listMhs.length-i` adalah untuk mengurangi batas kanan array yang akan dicek. Hal ini karena array yang ada di sebelah kanan (akhir), pada setiap iterasi, telah terisi dengan nilai terkecil, sehingga tidak perlu dicek lagi.
	4. Akan ada iterasi sebanyak 49 kali.

## 5.3. Percobaan 2
### 5.3.1. Langkah-Langkah Percobaan
1. Lihat kembali class DaftarMahasiswaBerprestasi, dan tambahkan method selectionSort() di dalamnya! Method ini juga akan melakukan proses sorting secara ascending, tetapi menggunakan pendekatan selection sort.
2. Setelah itu, buka kembali class Main, dan di dalam method main() tambahkan baris program untuk memanggil method selectionSort() tersebut! 
3. Coba jalankan kembali class Main, dan amati hasilnya! Apakah kini data mahasiswa telah tampil urut menaik berdasar ipk?
### 5.3.2. Verifikasi Hasil Percobaan
	Data mahasiswa sebelum sorting = 
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Data mahasiswa setelah sorting asc berdasarkan ipk  
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0

### 5.3.3. Pertanyaan
1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
	```java
	int idxMin = i;
	for(int j=i+1; j<listMhs.length; j++){
		if(listMhs[j].ipk < listMhs[idxMin].ipk) {
		idxMin = j;
	}
	```
	Untuk apakah proses tersebut, jelaskan!
### Jawaban
1. Proses tersebut adalah untuk mencari index array yang memiliki nilai lebih besar dari index `j`. Ketika indeks tersebut telah ditemukan, `idxMin = j` digunakan untuk meng-swap indeks.
 
## 5.4. Percobaan 3
### 5.4.1. Langkah-Langkah Percobaan
1. Lihat kembali class DaftarMahasiswaBerprestasi, dan tambahkan method insertionSort() di dalamnya. Method ini juga akan melakukan proses sorting secara ascending, tetapi menggunakan pendekatan Insertion Sort.
2. Setelah itu, buka kembali class Main, dan di dalam method main() tambahkan baris program untuk memanggil method insertionSort() tersebut! 
3. Coba jalankan kembali class Main, dan amati hasilnya! Apakah kini data mahasiswa telah tampil urut menaik berdasar ipk?
### 5.4.2. Verifikasi Hasil Percobaan
	Data mahasiswa setelah sorting asc berdasarkan ipk
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________

### 5.4.3. Pertanyaan
1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.
### Jawaban
1. Jawaban lihat `Pertemuan6\DaftarMahasiswaBerprestasi.java` method `insertionSortDescending();`.
```java
    void insertionSortDescending(){

        for (int i = 1; i < listMhs.length; i++) {

            Mahasiswa temp = listMhs[i];

            int j = i;

            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {

                listMhs[j] = listMhs[j-1];

                j--;

            }

            listMhs[j] = temp;

        }

    }
```

## 5.5. Latihan Praktikum

### Jawaban
1. Hasil lihat `Pertemuan6\latihan_praktikum`
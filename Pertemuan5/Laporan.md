# 4. Laporan Brute Force dan Divide and Conquer


#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 4.2. Percobaan 1
### 4.2.1. Langkah-Langkah Percobaan
1. Buat Project baru, dengan nama “BruteForceDivideConquer”. Buat package dengan nama minggu5. 
2. Buatlah class baru dengan nama Faktorial 
3. Lengkapi class Faktorial dengan atribut dan method yang telah digambarkan di dalam diagram class di atas, sebagai berikut: 
	1. Tambahkan atribut `nilai`
	2. Tambahkan method `faktorialBF()` nilai 
	3. Tambahkan method `faktorialDC() `nilai
4. Coba jalankan (Run) class `Faktorial` dengan membuat class baru `MainFaktorial`.
	1. Di dalam fungsi main sediakan komunikasi dengan user untuk menginputkan jumlah angka yang akan dicari nilai faktorialnya
	2. Buat Array of Objek pada fungsi main, kemudian inputkan beberapa nilai yang akan dihitung faktorialnya
	3. Tampilkan hasil pemanggilan method `faktorialDC()` dan `faktorialBF()`
	4. Pastikan program sudah berjalan dengan baik!
### 3.2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240318095906.png)
### 3.2.3. Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else! 
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for? Buktikan! 
3. Jelaskan perbedaan antara `fakto *= i;` dan `int fakto = n * faktorialDC(n-1);` !
### Jawaban
1. Untuk bagian **IF**, method akan membuat kembalian bernilai 1, juga berperan sebagai *base case*. Untuk bagian **ELSE**, method memanggil dirinya sendiri untuk memulai kerja recursive. Pada parameter `n`, pada setiap recursion, nilainya akan berkurang 1 (decrement). Ketika nilai `n` menyentuh nilai 1, maka bagian **IF** akan dijalankan dan method mengembalikan nilai 1, mengakhiri proses recursion. 
2. Perulangan pada method dapat diganti dengan while dan do-while.
	- #### While
	```java
	int faktorialBF(int n){
	    int fakto = 1;
	    int i = 1;
	    while (i <= n) {
	        fakto = fakto * i;
	        i++;
	    }
	    return fakto;
	}
	```
	- #### Do-While
	```java
	int faktorialBF(int n){
	    int fakto = 1;
	    int i = 1;
	    do {
	        fakto = fakto * i;
	        i++;
	    } while (i <= n);
	    return fakto;
	}
	```
3.  `fakto *= i;` menggunakan perkalian berulang variabel `fakto = 1` dengan variabel `i = 1`, dengan `i` increment pada tiap iterasi. Penghitungan berulang hingga `i <= n`. n adalah bilangan yang di-faktorial-kan. Jadi variabel faktorial akan dikalikan terus-menerus dengan variabel `i` yang nilainya terus increment pada tiap iterasi 
$$
fakto = i \times (i+1) \times (i+2) \times (i+3) \times ... \times n
$$
`int fakto = n * faktorialDC(n-1);` menggunakan fungsi rekursif dengan memanggil method dirinya sendiri. Variabel `n` adalah bilangan yang di-faktorial-kan. Nilai variabel `fakto` didapatkan dari
$$
fakto = n \times (n-1) \times (n-2) \times (n-3) \times ...
$$
## 4.3. Percobaan 2
### 4.3.1. Langkah-Langkah Percobaan
1. . Di dalam paket `minggu5`, buatlah class baru dengan nama `Pangkat`. Dan di dalam class `Pangkat` tersebut, buat atribut angka yang akan dipangkatkan sekaligus dengan angka pemangkatnya
2. Pada class Pangkat tersebut, tambahkan method `PangkatBF() `
3. Pada class Pangkat juga tambahkan method `PangkatDC()`
4. Perhatikan apakah sudah tidak ada kesalahan yang muncul dalam pembuatan class `Pangkat` 
5. Selanjutnya buat class baru yang di dalamnya terdapat method `main`. Class tersebut dapat dinamakan `MainPangkat`. Tambahkan kode pada class `main` untuk menginputkan jumlah nilai yang akan dihitung pangkatnya. 
6. Nilai pada tahap 5 selanjutnya digunakan untuk instansiasi array of objek. Di dalam Kode berikut ditambahkan proses pengisian beberapa nilai yang akan dipangkatkan sekaligus dengan pemangkatnya. 
7. Kemudian, panggil hasilnya dengan mengeluarkan return value dari method `PangkatBF()` dan
### 4.3.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240318105321.png)

### 4.3.3. Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu `PangkatBF()` dan `PangkatDC()`! 
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor. 
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!
### Jawaban
1. `PangkatBF()` mendapatkan hasil eksponen dengan cara menghitung variabel `a` sebanyak variabel `n` kali. Hal ini didapatkan dengan cara looping perkalian variabel `hasil` dan `a` dengan batas pengulangan `i < n`.
$$
a \times a \times a \times ...n
$$
`PangkatDC()` mendapatkan hasil eksponen dengan membagi penghitungan dengan kondisi `n == 0`, `n modulus 2 == 1` (bilangan eksponen ganjil), dan bilangan eksponen genap. 
$$
a^{n/2} \times a^{n/2} \times a
$$
Di atas adalah penghitungan untuk kondisi bilangan eksponen adalah ganjil.
$$
a^{n/2} \times a^{n/2}
$$
Di atas adalah kondisi ketika eksponen adalah bilangan genap.
Ketika nilai `n` menyentuh nilai 0, method akan mengembalikan bilangan 1 sebagai base case method.

2. Sudah ada. Tahap *combine* terjadi ketika semua recursion telah berhenti ketika nilai n == 0 (memenuhi kondisi base case). Semua proses recursion kemudian dikalikan.
 
## 4.4. Percobaan 3
### 4.4.1. Langkah-Langkah Percobaan
1. Pada paket `minggu5`. Buat class baru yaitu class `Sum`. DI salam class tersebut terdapat beberapa atribut jumlah elemen array, array, dan juga total. Tambahkan pula konstruktor pada class `Sum`. 
2. Tambahkan method` TotalBF()` yang akan menghitung total nilai array dengan cara iterative.
3. Tambahkan pula method `TotalDC()` untuk implementasi perhitungan nilai total array menggunakan algoritma Divide and Conquer 
4. Buat class baru yaitu` MainSum`. Di dalam kelas ini terdapat method main. Pada method ini user dapat menuliskan berapa bulan keuntungan yang akan dihitung. Dalam kelas ini sekaligus dibuat instansiasi objek untuk memanggil atribut ataupun fungsi pada class Sum
5. Karena yang akan dihitung adalah total nilai keuntungan, maka ditambahkan pula pada method main mana array yang akan dihitung. Array tersebut merupakan atribut yang terdapat di class `Sum`, maka dari itu dibutuhkan pembuatan objek `Sum` terlebih dahulu. 
6. Tampilkan hasil perhitungan melalui objek yang telah dibuat untuk kedua cara yang ada (Brute Force dan Divide and Conquer)
### 4.4.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240319220648.png)
### 4.4.3. Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!
2. Kenapa dibutuhkan variable mid pada method TotalDC()? 
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!
### Jawaban
1. -
## 4.5. Latihan Praktikum

### Jawaban
1. -
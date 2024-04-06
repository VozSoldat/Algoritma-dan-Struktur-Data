# 6. Searching

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 6.2. Percobaan 1
### 6.2.1. Langkah-Langkah Percobaan
1. -

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
1. -

## 6.3. Percobaan 2
### 6.3.1. Langkah-Langkah Percobaan
1. -
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
1. -
 
## 6.4. Percobaan 3
### 6.4.1. Langkah-Langkah Percobaan
1. -
### 6.4.2. Verifikasi Hasil Percobaan
	-
### 6.4.3. Pertanyaan
1.-
### Jawaban
1. -

## 6.5. Latihan Praktikum

### Jawaban
1. -`
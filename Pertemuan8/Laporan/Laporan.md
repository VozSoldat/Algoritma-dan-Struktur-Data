# 7. Searching

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 2. Percobaan 1
### 2.1. Langkah-Langkah Percobaan
1. -

### 2.2. Verifikasi Hasil Percobaan
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Keluar
	Pilih operasi
	1
	Masukkan kode barang: 
	21
	Masukkan nama barang: 
	Majalah
	Masukkan kategori:
	Buku
	Barang Majalah berhasil ditambahkan ken Gudang.     
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Keluar
	Pilih operasi
	1
	Masukkan kode barang:
	26
	Masukkan nama barang:
	Jaket
	Masukkan kategori:
	Pakaian
	Barang Jaket berhasil ditambahkan ken Gudang.       
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Keluar
	Pilih operasi
	2
	Barang Jaket diambil dari Gudang.
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Keluar
	Pilih operasi
	1
	Masukkan kode barang:
	33
	Masukkan nama barang:
	Pizza
	Masukkan kategori:
	Makanan
	Barang Pizza berhasil ditambahkan ken Gudang.       
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Keluar
	Pilih operasi
	3
	Rincian tumpukan barang di Gudang:
	Kode 33: Pizza (Kategori Makanan)
	Kode 21: Majalah (Kategori Buku)

### 2.3. Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana saja yang perlu diperbaiki? 
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya! 
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi tersebut dihapus, apa dampaknya?
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
5. Commit dan push kode program ke Github

### Jawaban
1. Perbaikan perlu dilakukan pada bagian loop pada method `tampilkanBarang()`.
2. Kapasitas maksimum stack ini ialah sebagaimana kode di bawah.
```java
 public Gudang18(int kapasitas){

        size = kapasitas;

        tumpukan = new Barang18[size];

        top=-1;
        }
```
Kapasitas tumpukan adalah 7, diketahui dari kode program di bawah.
```java
public static void main(String[] args) {

        Gudang18 gudang = new Gudang18(7);

        Scanner scanner = new Scanner(System.in);
```
3. `!cekKosong()` digunakan agar method `tampilkanBarang()` dapat menampilkan pesan "tumpukan kosong". Jika `!cekKosong()` dihilangkan, maka tidak terjadi apa-apa.
#
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Keluar
	Pilih operasi
	3
	Rincian tumpukan barang di Gudang:
	

4. Kapasitas:
```java
System.out.print("Masukkan kapasitas gudang: ");

        int kapasitas = scanner.nextInt();

        Gudang18 gudang = new Gudang18(kapasitas);
```

Lihat barang teratas:
```java
            switch (pilihan) {

                case 1:

                    System.out.println("Masukkan kode barang: ");

                    int kode = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Masukkan nama barang: ");

                    String nama = scanner.nextLine();

                    System.out.println("Masukkan kategori: ");

                    String kategori = scanner.nextLine();

                    Barang18 barangBaru = new Barang18(kode, nama, kategori);

                    gudang.tambahBarang(barangBaru);

                    break;

                case 2:

                    gudang.ambilBarang();

                    break;

                case 3:

                    gudang.tampilkanBarang();

                    break;

                case 4:

                    gudang.lihatBarangTeratas();

                    break;

                case 5:

                    break;

                default:

                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");

            }
```

## 3. Percobaan 2
### 3.1. Langkah-Langkah Percobaan
1. -
### 3.2. Verifikasi Hasil Percobaan
	Masukkan kapasitas gudang: 7
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Lihat barang teratas.
	5. Keluar
	Pilih operasi
	1
	Masukkan kode barang: 
	13
	Masukkan nama barang:
	Setrika
	Masukkan kategori:
	Elektronik
	Barang Setrika berhasil ditambahkan ken Gudang.    
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Lihat barang teratas.
	5. Keluar
	Pilih operasi
	2
	Barang Setrika diambil dari Gudang.
	Kode unik dalam biner: 1101
	
	Menu:
	1. Tambah barang
	2. Ambil barang
	3. Tampilkan tumpukan barang
	4. Lihat barang teratas.
	5. Keluar
	Pilih operasi

### 3.3. Pertanyaan
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
2. Jelaskan alur kerja dari method konversiDesimalKeBiner!
### Jawaban
1.  Program masih dapat berjalan karena nilai dari kode barang yang dihapus seharusnya bernilai negatif. Jadi jika memakai kode > 0,  output dari kode uniknya null, dan jika memakai kode kode != 0, maka output dari kode uniknya bernilai negatif.
2. Konversi dilakukan dengan cara membagi kode dengan 2 dan memasukkan sisa pembagian ke dalam stack. 13 dibagi 2 = 6 sisa 1. 6 dibagi 2 = 3 sisa 0. 3 dibagi 2 = 1 sisa 1. 1 dibagi 2 = 0 sisa 1. Terdapat di dalam stack {1, 1, 0, 1}. Kemudian semua elemen dalam stack dimasukkan ke dalam String biner.

## 4. Percobaan 3
### 4.1. Langkah-Langkah Percobaan
1. -
### 4.2. Verifikasi Hasil Percobaan
	-

### 4.3. Soal
1. Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi? 
2. Jelaskan alur kerja method konversi! 
3. Pada method konversi, apa fungsi dari potongan kode berikut?!
[](Pasted%20image%2020240429110228.png)

### Jawaban
1. Beberapa return value bernilai sama karena beberapa operasi memiliki derajat yang sama. Eksponen (pangkat) adalah yang tertinggi (jika mengabaikan parentheses (kurung)), di bawahnya ada modulus, perkalian, dan pembagian, di bawahnya ada penjumlahan dan pengurangan. Jika return valuenya diubah menjadi nilai berbeda-beda, kedudukan dari setiap operator akan berbeda-beda yang dimana akan menimbulkan error dalam konversi postfixnya.
2. Proses iterasi dilakukan melalui setiap karakter dalam ekspresi `Q`. Jika `c` adalah operand (bilangan), maka `karakter` tersebut ditambahkan ke string `P`. Jika `c` adalah tanda kurung buka `(`, maka tanda kurung tersebut dimasukkan ke dalam stack. Jika `c` adalah tanda kurung tutup `)`, maka dilakukan proses untuk mengeluarkan operator-operator dari stack dan menambahkannya ke dalam string `P` sampai ditemukan tanda kurung buka yang sesuai. Jika `c` adalah operator, maka dilakukan proses untuk memeriksa tingkat derajat operator pada puncak stack. Jika tingkat derajat operator pada stack lebih besar atau sama dengan operator saat ini, maka operator pada stack tersebut dikeluarkan dan ditambahkan ke dalam string `P`, kemudian operator saat ini dimasukkan ke dalam stack. Setelah iterasi selesai, jika masih ada operator tersisa di stack, mereka dikeluarkan dan ditambahkan ke dalam string `P`. Hasilnya disimpan ke dalam String P.
3. Potongan kode tersebut maksudnya adalah `c` sama dengan karakter pada String Q indeks ke-i. Itu adalah cara pengecekan karakter pada setiap iterasi pada String Q. String Q adalah ekspresi matematika yang belum dikonversi.

## 5. Latihan Praktikum

### Jawaban
1. Hasil lihat `Pertemuan7\LatihanPraktik1`
2. Hasil lihat `Pertemuan7\LatihanPraktik2`
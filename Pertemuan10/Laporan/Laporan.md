# 8. Queue

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 2. Percobaan 1
### 2.1. Langkah-Langkah Percobaan
1. -

### 2.2. Verifikasi Hasil Percobaan
	Masukkan kapasitas Queue: 4
	Masukkan operasi yang diinginkan:
	1. Enqueue
	2. Dequeue
	3. Print
	4. Peek
	5. Clear
	-------------
	1
	Masukkan data baru: 15
	Masukkan operasi yang diinginkan:
	1. Enqueue
	2. Dequeue
	3. Print
	4. Peek
	5. Clear
	-------------
	1
	Masukkan data baru: 31
	Masukkan operasi yang diinginkan:
	1. Enqueue
	2. Dequeue
	3. Print
	4. Peek
	5. Clear
	-------------
	4
	Elemen terdepan: 15
	Masukkan operasi yang diinginkan:
	1. Enqueue
	2. Dequeue
	3. Print
	4. Peek
	5. Clear
	-------------

![](Pasted%20image%2020240506084504.png)

### 2.3. Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0? 
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! ![](Pasted%20image%2020240506084600.png)

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! ![](Pasted%20image%2020240506084704.png)
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front? 
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! ![](Pasted%20image%2020240506084728.png)
6. Tunjukkan potongan kode program yang merupakan queue overflow! 
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

### Jawaban
1. Nilai awal front dan rear bernilai -1 karena peran front dan rear sebagai indeks. Untuk membuat indeks tidak menunjuk posisi manapun, maka ditulis bilangan -1 atau bilangan negatif lainnya. Hal tersebut karena 0 termasuk indeks. Attribute size bernilai 0 karena `size` akan dibandingkan dengan `max`, yang mana digunakan untuk menginstansiasi ukuran array. Ukuran array paling kecil adalah 1, sedangkan ukuran array = 0 berarti array tersebut tidak memiliki tempat elemen sama sekali. 
2. Kegunaannya agar saat data paling belakang dari queue berada di indeks terakhir array lalu dimasukkan data baru, maka data tersebut akan menempati posisi indeks ke-0.
3. Kegunaannya agar saat data paling depan dari queue berada di indeks terakhir array lalu dilakukan proses dequeue, maka data yang terambil adalah data pada index terakhir. Kemudian front akan bergesar pada index ke-0.
4. Karena elemen pertama dari queue bukan lagi terletak pada indeks 0, tetapi pada attribute front. 
5. Kode tersebut digunakan untuk kembali ke awal queue ketika method print sampai di akhir queue. Operasi ini akan mengembalikan i kembali ke awal antrian dengan cara menghitung modulus `i + 1` dengan `max`.
6. Kode program:
```java
    if (isFull()) {
        System.out.println("Queue sudah penuh");
    }
```

7. 

## 3. Percobaan 2
### 3.1. Langkah-Langkah Percobaan
1. -
### 3.2. Verifikasi Hasil Percobaan
-

### 3.3. Pertanyaan
1. -
### Jawaban
1. -
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
1. Method telah diimplementasikan.
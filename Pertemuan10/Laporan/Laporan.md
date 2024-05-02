# 8. Queue

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
1. -

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
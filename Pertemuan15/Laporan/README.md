# 12. Laporan Graph

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 1. Percobaan 1
### 1.1. Langkah-Langkah Percobaan
1. Buka text editor. Buat class Node.java dan class DoubleLinkedList.java sesuai dengan praktikum Double Linked List. 
	1. Class Node Kode program yang terdapat pada class Node belum dapat mengakomodasi kebutuhan pembuatan graf berbobot, sehingga diperlukan sedikit modifikasi. Setelah Anda menyalin kode program dari class Node pada praktikum Double Linked List, tambahkan atribut jarak bertipe int untuk menyimpan bobot graf
### 2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240603135350.png)

### 1.3. Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Pada class Graph, terdapat atribut `list[]` bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut! 
3. Jelaskan alur kerja dari method removeEdge! 
4. Apakah alasan pemanggilan method `addFirst()` untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph? 
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). ![](Pasted%20image%2020240603135931.png)

### Jawaban
1. Sudah.
2. Variabel tersebut dibuat untuk menyimpan informasi dari setiap verteks. Setiap verteks diwakili dengan elemen dalam array tersebut. Tipe data array tersebut., yakni `DoubleLinkedList`, berfungsi untuk menyimpan informasi tetangga-tetangga verteks menggunakan `Node`-nya.
3. Ketika suatu edge dihapus, maka program perlu mengetahui edge antara verteks apa yang hendak dihapus (asal dan tujuan). Setelah mengetahui kedua hal tersebut, method `remove` milik `DoubleLinkedList` menghapus node yang mengandung informasi **tujuan**. Jadi, array asal, di dalam node DoubleLinkedList-nya, tidak menyimpan informasi **tujuan** lagi. 
4. 

## 2. Percobaan 2
### 2.1. Langkah-Langkah Percobaan
-

### 2.2. Verifikasi Hasil Percobaan


### 2.3. Pertanyaan
1. -

### Jawaban
1. -

## 3. Latihan Praktikum
1. -
`
### Jawaban
1. -
2. 
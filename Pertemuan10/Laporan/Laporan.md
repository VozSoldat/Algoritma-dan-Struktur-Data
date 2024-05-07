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

7. Buat attribute baru isOverFlow dan isUnderFlow masing-masing pada bagian `enqueu()` dan `dequeue()`.
```java
    if (isFull()) {
        System.out.println("Queue sudah penuh");
        isOverflow = true;
    }
    ...
    if(isEmpty()) {
        System.out.println("Queue masih kosong");
        isUnderflow = true;
    }
```

Kemudian tulis break dengan kondisi isOverFlow dan isUnderFlow true pada bagian main.
```java
    if (Q.isOverflow == true || Q.isUnderflow == true) {
        break;
    }
```

#### Hasil
- Queue UnderFlow ![](Pasted%20image%2020240506135550.png)
- Queue OverFlow 
#
	Masukkan kapasitas Queue: 1
	Masukkan operasi yang diinginkan:
	1. Enqueue
	2. Dequeue
	3. Print
	4. Peek
	5. Clear
	-------------
	1
	Masukkan data baru: 33
	Masukkan operasi yang diinginkan:
	1. Enqueue
	2. Dequeue
	3. Print
	4. Peek
	5. Clear
	-------------
	1
	Masukkan data baru: 55
	Queue sudah penuh

## 3. Percobaan 2
### 3.1. Langkah-Langkah Percobaan
1. -
### 3.2. Verifikasi Hasil Percobaan
	Masukkan kapasitasa queue: 8
	Pilih menu:
	1. Antrian baru
	2. Antrian keluar
	3, Cek antrian terdepan
	4. Cek semua antrian
	---------------------
	1
	No. Rekening: 12345
	Nama: Dewi
	Alamat: Malang 
	Umur: 23
	Saldo: 1300000
	Pilih menu:
	1. Antrian baru
	2. Antrian keluar
	3, Cek antrian terdepan
	4. Cek semua antrian
	---------------------
	1
	No. Rekening: 32940
	Nama: Susan
	Alamat: Surabaya
	Umur: 39
	Saldo: 42000000
	Pilih menu:
	1. Antrian baru
	2. Antrian keluar
	3, Cek antrian terdepan
	4. Cek semua antrian
	---------------------
	4
	12345 Dewi Malang 23 1300000.0
	32940 Susan Surabaya 39 4.2E7
	Jumlah elemen = 2
	Pilih menu:
	1. Antrian baru
	2. Antrian keluar
	3, Cek antrian terdepan
	4. Cek semua antrian
	---------------------


### 3.3. Pertanyaan
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut ![](Pasted%20image%2020240506134230.png)

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!

### Jawaban
1. Kode tersebut digunakan untuk memastikan bahwa input tidak kosong, 0, atau null.
2. Kode program `peakRear()`:
```java
public void peekRear(){

        if (!isEmpty()) {

            System.out.println("Antrian terakhir: "+ data[rear].norek);

        }else{

            System.out.println("Antrian masih kosong");

        }

    }
```

Modifikasi menu:
```java
case 5:
                    antri.peekRear();
                    break;
```

## 4. Latihan Praktikum

### Jawaban
Hasil kode lihat di `Pertemuan10\Tugas`.
Hasil:
```
Masukkan kapasitas queue: 10
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Peek rear
6. Daftar pembeli
7. Peek position
-------------------
1
Masukkan nama: John
Masukkan no. HP: 011
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Peek rear
6. Daftar pembeli
7. Peek position
-------------------
1
Masukkan nama: Arhtur
Masukkan no. HP: 033
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Peek rear
6. Daftar pembeli
7. Peek position
-------------------
1
Masukkan nama: Kirby 
Masukkan no. HP: 098
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Peek rear
6. Daftar pembeli
7. Peek position
-------------------
6
John 11
Arhtur 33
Kirby 98
1. Enqueue
2. Dequeue
3. Peek
4. Print
5. Peek rear
6. Daftar pembeli
7. Peek position
-------------------
7
Masukkan nama: kirby
Elemen di posisi ke-3
```
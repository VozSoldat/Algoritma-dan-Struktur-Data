# 10. Double Linked List

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 1. Percobaan 1
### 1.1. Langkah-Langkah Percobaan
1. -

### 2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240513112242.png)

### 1.3. Pertanyaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists! 
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut tersebut? 
3. Perhatikan konstruktor pada class `DoubleLinkedLists`. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini? ![](Pasted%20image%2020240513112357.png)
4. Pada method `addFirst()`, kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null? `Node newNode = new Node(null, item, head);`
5. Perhatikan pada method `addFirst()`. Apakah arti statement` head.prev = newNode` ? 
6. Perhatikan isi method` addLast()`, apa arti dari pembuatan object Node dengan mengisikan parameter `prev` dengan `current`, dan `next` dengan `null`? `Node newNode = new Node(current, item, null); `
7. Pada method` add()`, terdapat potongan kode program sebagai berikut: ![](Pasted%20image%2020240513112606.png) jelaskan maksud dari bagian yang ditandai dengan kotak kuning.

### Jawaban
1. Single-linked list hanya memiliki satu pointer yang menunjukkan ke node selanjutnya, sedangkan double-linked lists memiliki dua pointer yang menunjuk ke node sebelum dan setelahnya.
2. Attribute `next` digunakan untuk menunjuk node selanjutnya, sedangkan `prev` digunakan untuk menunjuk node sebelumnya.
3. Kedua attribute tersebut memiliki fungsi berikut. `head` menyimpan `null` untuk menunjukkan bahwa DLL ini baru saja dibuat dan belum terdapat satupun node pada head. `size` menyimpan nilai 0 karena DLL yang baru dibuat pasti tidak memiliki node apapun, sehingga `size == 0`.
4. Parameter `prev` berisi *null* karena method `addFirst` digunakan untuk menambahkan node baru di bagian depan DLL, sehingga tidak terdapat node apapun pada bagian-sebelum node yang hendak ditambahkan.
5. Statement tersebut berarti bahwa attribut `prev` milik `head`(yakni node terdepan yang lama) diganti menjadi node `newNode`(yakni node yang baru dibuat).
6. Pada potongan kode sebelumnya, `current` digunakan untuk menyimpan pencarian node paling belakang. Jadi, meletakkan `current` pada parameter `prev` berarti mendefinisikan `current`(yakni node yang paling belakang) sebagai node `prev` milik node yang baru ditambahkan.
7. Potongan kode tersebut berfungsi untuk mengecek apakah node `current` merupakan node `head`. Jika benar, maka node yang baru akan menjadi `prev` milik `head` yang lama dan `newNode` menjadi `head` yang baru.

## 2. Percobaan 2
### 2.1. Langkah-Langkah Percobaan
1. -
### 2.2. Verifikasi Hasil Percobaan
	Linked List Kosong
	Size 0
	===============================
	7       3       4
	berhasil diisi
	Size : 3
	=====================================
	7       40      3       4
	berhasil diisi
	Size : 4
	=====================================
	Linked List Kosong
	Size : 0
	50      40      10      20
	berhasil diisi
	Size : 4
	=====================================
	40      10      20
	berhasil diisi
	Size : 3
	=====================================
	40      10
	berhasil diisi
	Size : 2
	=====================================
	40
	berhasil diisi
	Size : 1

### 2.3. Pertanyaan
1. Apakah maksud statement berikut pada method `removeFirst()`? 
	`head = head.next; `
	`head.prev = null;`
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method `removeLast()`? 
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah `remove`! ![](Pasted%20image%2020240513121429.png)
4. . Jelaskan fungsi kode program berikut ini pada fungsi `remove`! ![](Pasted%20image%2020240513121519.png)

### Jawaban
1. Kode program mengubah node selanjutnya menjadi head. Kemudian `head` yang lama diubah menjadi null.
2. Terdapat dua pendeteksi untuk dua kasus yang berbeda.
	1. Pendeteksi yang pertama digunakan untuk mengecek apakah node tepat setelah head adalah null. Program mendeteksi apakah node selanjutnya dari `head` sama dengan null. Jika iya, maka node yang telah diketahui merupakan node terakhir diubah menjadi null dan size dikurangi 1. 
	2. Pendeteksi yang kedua mengecek dengan penggeseran current dari node satu ke node lain di sebelah kanan dengan ekspresi `while`. Iterasi terus berjalan hingga diketahui bahwa `current.next.next` bernilai null. Kemudian `current.next` diubah menjadi null dan size dikurangi 1.
3. Alasan mengapa potongan kode tersebut tidak cocok untuk perintah remove adalah 
4. Kegunaan kode program tersebut adalah untuk mengganti pointer next dari `current.prev` menjadi `current.next` dan pointer prev dari `current.next` menjadi `current.prev`.

## 3. Latihan Praktikum

### Jawaban
1. !
2. !

# 10. Laporan Double Linked List

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 1. Percobaan 1
### 1.1. Langkah-Langkah Percobaan
Pada percobaan 1 ini akan dibuat class Node dan class DoubleLinkedLists yang didalamnya terdapat operasi-operasi untuk menambahkan data dengan beberapa cara (dari bagian depan linked list, belakang ataupun indeks tertentu pada linked list).
1. Perhatikan diagram class Node dan class DoublelinkedLists di bawah ini! Diagram class ini yang selanjutnya akan dibuat sebagai acuan dalam membuat kode program DoubleLinkedLists.

| Node                                  |
| ------------------------------------- |
| data: int                             |
| prev: Node                            |
| next: Node                            |
|-----|
| Node(prev: Node, data:int, next:Node) |

| DoubleLinkedLists                     |
|-----|
| head: Node                            |
| size : int                            |
|-------|
| DoubleLinkedLists()                   |
| isEmpty(): boolean                    |
| addFirst (): void                     |
|addLast(): void|
|add(item: int, index:int): void|
|size(): int|
|clear(): void|
|print(): void|

2. Buat paket baru dengan nama **doublelinkedlists**
3. Buat class di dalam paket tersebut dengan nama **Node** 
![](Pasted%20image%2020240519084009.png)
4.  Di dalam class tersebut, deklarasikan atribut sesuai dengan diagram class di atas. 
	![](Pasted%20image%2020240519084104.png)
5. Selanjutnya tambahkan konstruktor default pada class Node sesuai diagram di atas. ![](Pasted%20image%2020240519084136.png)
6. Buatlah sebuah class baru bernama DoubleLinkedLists pada package yang sama dengan node seperti gambar berikut: ![](Pasted%20image%2020240519084212.png)
7. Pada class DoubleLinkedLists tersebut, deklarasikan atribut sesuai dengan diagram class di atas. ![](Pasted%20image%2020240519084224.png)
8. Selajutnya, buat konstruktor pada class DoubleLinkedLists sesuai gambar berikut. ![](Pasted%20image%2020240519084249.png)
9. Buat method **isEmpty()**. Method ini digunakan untuk memastikan kondisi linked list kosong. ![](Pasted%20image%2020240519084849.png)
10. Kemudian, buat method **addFirst().** Method ini akan menjalankan penambahan data di bagian depan linked list. ![](Pasted%20image%2020240519084406.png)
11. Selain itu pembuatan method **addLast()** akan menambahkan data pada bagian belakang linked list. ![](Pasted%20image%2020240519084452.png)
12.  Untuk menambahkan data pada posisi yang telah ditentukan dengan indeks, dapat dibuat dengan method **add(int item, int index)** ![](Pasted%20image%2020240519084641.png)
13.  Jumlah data yang ada di dalam linked lists akan diperbarui secara otomatis, sehingga dapat dibuat method **size()** untuk mendapatkan nilai dari size. ![](Pasted%20image%2020240519084942.png)
14. Selanjutnya dibuat method **clear()** untuk menghapus semua isi linked lists, sehingga linked lists dalam kondisi kosong. ![](Pasted%20image%2020240519085022.png)
15. Untuk mencetak isi dari linked lists dibuat method **print().** Method ini akan mencetak isi linked lists berapapun size-nya. Jika kosong akan dimunculkan suatu pemberitahuan bahwa linked lists dalam kondisi kosong. ![](Pasted%20image%2020240519085032.png)
16. Selanjutya dibuat class Main DoubleLinkedListsMain untuk mengeksekusi semua method yang ada pada class DoubleLinkedLists. ![](Pasted%20image%2020240519085042.png)
17. Pada main class pada langkah 16 di atas buatlah object dari class DoubleLinkedLists kemudian eksekusi potongan program berikut ini. ![](Pasted%20image%2020240519085052.png)

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
Pada praktikum 2 ini akan dibuat beberapa method untuk menghapus isi LinkedLists pada class DoubleLinkedLists. Penghapusan dilakukan dalam tiga cara di bagian paling depan, paling belakang, dan sesuai indeks yang ditentukan pada linkedLists. Method tambahan tersebut akan ditambahkan sesuai pada diagram class berikut ini. 

|DoubleLinkedLists |
|-----|
|head: Node |
|size : int|
|-----|
|DoubleLinkedLists()|
|isEmpty(): boolean|
|addFirst (): void|
|addLast(): void|
|add(item: int, index:int): void|
|size(): int|
|clear(): void|
|print(): void|
|**removeFirst(): void**|
|**removeLast(): void**|
|**remove(index:int):void**|

1. Buatlah method **removeFirst()** di dalam class **DoubleLinkedLists.** ![](Pasted%20image%2020240519085921.png)
2. Tambahkan method **removeLast()** di dalam class **DoubleLinkedLists.** ![](Pasted%20image%2020240519085930.png)
3. Tambahkan pula method **remove(int index)** pada class **DoubleLinkedLists** dan amati hasilnya. ![](Pasted%20image%2020240519085950.png)
4. Untuk mengeksekusi method yang baru saja dibuat, tambahkan potongan kode program berikut pada **main class.** ![](Pasted%20image%2020240519090002.png)

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
3. Alasan mengapa potongan kode tersebut tidak cocok untuk perintah remove adalah karena ada kemungkinan `tmo.next` adalah null. Jika `tmp.next` adalah `null` (misalnya, `tmp` adalah node terakhir), maka `tmp.next.prev` akan menyebabkan NullPointerException karena mencoba mengakses `prev` dari `null`.
4. Kegunaan kode program tersebut adalah untuk mengganti pointer next dari `current.prev` menjadi `current.next` dan pointer prev dari `current.next` menjadi `current.prev`.

## 3. Percobaan 3
### 3.1. Langkah-Langkah Percobaan
Pada praktikum 3 ini dilakukan uji coba untuk mengambil data pada linked list dalam 3 kondisi, yaitu mengambil data paling awal, paling akhir dan data pada indeks tertentu dalam linked list. Method mengambil data dinamakan dengan **get**. Ada 3 method get yang dibuat pada praktikum ini sesuai dengan diagram class DoubleLinkedLists. 

| DoubleLinkedLists |
| ---- |
|head: Node|
|size : int|
|----------|
|DoubleLinkedLists()|
|isEmpty(): boolean|
|addFirst (): void|
|addLast(): void|
|add(item: int, index:int): void|
|size(): int|
|clear(): void|
|print(): void|
|removeFirst(): void|
|removeLast(): void|
|remove(index:int):void|
|**getFirst(): int**|
|**getLast() : int**|
|**get(index:int): int**|

1. Buatlah method **getFirst()** di dalam class DoubleLinkedLists untuk mendapatkan data pada awal linked lists. ![](Pasted%20image%2020240519090335.png)
2. Selanjutnya, buatlah method **getLast()** untuk mendapat data pada akhir linked lists. ![](Pasted%20image%2020240519090344.png)
3. Method **get(int index)** dibuat untuk mendapatkan data pada indeks tertentu ![](Pasted%20image%2020240519090411.png)
4. Pada main class tambahkan potongan program berikut dan amati hasilnya! ![](Pasted%20image%2020240519090414.png)

### 3.2. Verifikasi Hasil Percobaan
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
	40
	berhasil diisi
	Size : 1
	=====================================
	7       3       40      4
	berhasil diisi
	Size : 4
	=====================================
	7       40      3       40      4
	berhasil diisi
	Size : 5
	=====================================
	Data pada awal linked lists adalah: 7
	Data akhir pada linked lists adalah: 4
	Data indeks ke-1 pada linjed lists adalah: 40

### 3.3. Pertanyaan
1. Jelaskan method `size()` pada class `DoubleLinkedLists`! 
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke-1! 
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini! ![](Pasted%20image%2020240513132338.png)

### Jawaban
1. Method tersebut digunakan untuk mengambil size dari DDL.
2. Ubah nilai 
```java
for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
...
```
3. Fungsi add pada single-linked list memiliki attribute tail yang digunakan untuk menunjukkan ujung belakang dari linked list, sedangkan double-linked list tidak memiliki attribute tail. Selain itu, fungsi add milik DLL perlu mengatur perubahan attributer `prev` karena sifat DLL yang memiliki dua pointer—yakni depan dan belakang, sedangkan single-linked list tidak memerlukan perubahan `prev` karena tidak punya.
4. Pada potongan kode (a), objek DLL memiliki attribute size yang ditambah atau dikurangi oleh method-method-nya dengan `size++` atau `size--`, sehingga pengecekan `isEmpty()` dapat dilakukan dengan memeriksa attribute `size`. Pada potongan kode (b), objek SLL tidak menghitung ukuran `size`. Method memeriksa `isEmpty()` dengan cara memeriksa apakah `head` adalah `null` atau tidak.

## 3. Latihan Praktikum
1. Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi dan menu di bawah ini! **(counter jumlah antrian tersisa di menu cetak(3) dan data orang yang** **telah divaksinasi di menu Hapus Data(2) harus ada)**
	- **Contoh Ilustrasi Program**
		- _Menu_ _Awal dan Penambahan Data_
			- ![](Pasted%20image%2020240519090551.png)
			- ![](Pasted%20image%2020240519090556.png)
		- _Cetak Data (**Komponen di area merah harus ada**)_
			- ![](Pasted%20image%2020240519090639.png)
		- _Hapus Data (**Komponen di area merah harus ada**)_
			- ![](Pasted%20image%2020240519090700.png)
2. Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara descending. Class Film wajib diimplementasikan dalam soal ini.
	**Contoh Ilustrasi Program**
	- _Menu_ _Awal dan Penambahan Data_
		- ![](Pasted%20image%2020240519090820.png)
		- ![](Pasted%20image%2020240519090826.png)
		- ![](Pasted%20image%2020240519090836.png)
		- ![](Pasted%20image%2020240519090841.png)
	- _Cetak Data_
		- ![](Pasted%20image%2020240519090926.png)
	- _Pencarian Data_
		- ![](Pasted%20image%2020240519091014.png)

### Jawaban
1. -
	1. Kode program
			![a]()
1. !

# 9. Linked List

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 1. Percobaan 1
### 1.1. Langkah-Langkah Percobaan
1. -

### 2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240506102814.png)

### 1.3. Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? 
2. Jelaskan kegunaan variable temp secara umum pada setiap method! 
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut ![](Pasted%20image%2020240506102913.png)

### Jawaban
1. Karena method `print()` ditulis di awal fungsi `main` sebelum method-method yang berfungsi menambahkan node.
2. Kegunaan variabel temp adalah untuk sementara menyimpan node, kemudian dengan `temp = temp.next;` temp berganti nilai menjadi node setelahnya. Hal itu dapat dilakukan berkali-kali sebagai cara untuk berpindah node terpilih ke node berikutnya.
3. Kode tersebut berfungsi untuk menentukan node tail atau node paling akhir. Jika `temp.next.next = null`, maka `temp.next` adalah `tail`.

## 2. Percobaan 2
### 2.1. Langkah-Langkah Percobaan
1. -
### 2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240506125849.png)

### 2.3. Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! 
2. Jelaskan kegunaan kode dibawah pada method remove ![](Pasted%20image%2020240506124901.png)

### Jawaban
1. Break berfungsi untuk mengakhiri perulangan `while` begitu kondisi `if` maupun `else` terpenuhi. Hal tersebut agar program tidak terus menghapus node di sepanjang Linked List.
2. Kegunaan kode tersebut adalah untuk menghapus node setelah node temp. Cara kerjanya ialah dengan meng-assign `temp.next.next` ke `temp.next`. Adapun kondisi penghapusan ialah jika data dari `temp.next` sama dengan `key`.

## 3. Latihan Praktikum

### Jawaban
1. ![](Pasted%20image%2020240513080802.png)
2. ![](Pasted%20image%2020240513080846.png)
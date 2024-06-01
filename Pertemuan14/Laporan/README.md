# 11. Laporan Binary Tree

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 1. Percobaan 1
### 1.1. Langkah-Langkah Percobaan
-
### 2.2. Verifikasi Hasil Percobaan

![](Pasted%20image%2020240527132918.png)
```
PreOrder Traversal:  6 4 3 5 8 7 9 10 15
inOrder Traversal:  3 4 5 6 7 8 9 10 15
PostOrder Traversal:  3 5 4 7 15 10 9 8 6
Find Node: true
Delete Node 8
Tree is empty!

PreOrder Traversal:  6 4 3 5 8 7 9 10 15
```
### 1.3. Pertanyaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
3. ...
	1. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
	2. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
	```java
	if(data<current.data){
		if(current.left!=null){
			current = current.left;
		}else{
			current.left = new Node(data);
			break;
		}
	}
	```

### Jawaban
1. Karena binary tree memiliki aturan pembuatan khusus, yakni mewajibkan child sebelah kiri lebih kecil dari pada child sebelah kanan.
2. Kedua atribut tersebut menyatakan node child-child (children) dari node tersebut, yakni child kiri dan child kanan.
3. ...
	1. Atribut `root` digunakan untuk menyimpan pointer node paling pertama dari suatu *tree*. 
	2. Nilai root ketika pertama kali dibuat adalah null. 
		```java
		public class BinaryTree18 {
			Node18 root;
			public BinaryTree18(){
				root = null;
			}
		```
4. Ketika tree yang kosong hendak ditambahkan node baru, maka node tersebut sekalian akan dijadikan root.
	```java
	    void add(int data){
	        if (!isEmpty()) {//tree is empty
	            root = new Node18(data);
        }
	```
5. Pertama, program mengecek apakah data yang baru lebih kecil dari pada data yang lama. Jika terpenuhi, pengecekan selanjutnya adalah apakah child kiri ada atau tidak. Jika iya, maka data baru akan ditimpakan pada data lama. Jika tidak, program akan meng-instance node baru, child sebelah kiri. 

## 2. Percobaan 2
### 2.1. Langkah-Langkah Percobaan
-

### 2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240527140239.png)

### 2.3. Pertanyaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? 
2. Apakah kegunaan dari method `populateData()`? 
3. Apakah kegunaan dari method `traverseInOrder()`? 
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing? 
5. Apa kegunaan statement int `idxLast` = 6 pada praktikum 2 percobaan nomor 4?

### Jawaban
1. Atribut data digunakan untuk menyimpan data dari tree tersebut. Sedangkan `idxLast` digunakan untuk menyimpan array tempat data terakhir berada.
2. Method tersebut berfungsi menerapkan nilai populasi (data-data) dan `idxLast` pada array milik tree.
3. Untuk menampilkan node-node dengan urutan *in order*, yakni dengan urutan node kiri, root, dan node kanan.
4. Dua child dari node pada indeks 2 berada pada indeks 5 dan 6.
5. Kegunaan atribut tersebut adalah untuk membatasi rekursi traverse. Data yang ada setelah indeks 6 tidak akan dibaca.

## 3. Latihan Praktikum
1. Buat method di dalam class `BinaryTree` yang akan menambahkan node dengan cara rekursif. 
2. Buat method di dalam class `BinaryTree` untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree. 
3. Buat method di dalam class `BinaryTree` untuk menampilkan data yang ada di leaf. 
4. Buat method di dalam class `BinaryTree` untuk menampilkan berapa jumlah leaf yang ada di dalam tree. 
5. Modifikasi class `BinaryTreeArray`, dan tambahkan : 
	 - method `add(int data)` untuk memasukkan data ke dalam tree 
	 - method `traversePreOrder()` dan `traversePostOrder()
`
### Jawaban
1. [BinaryTree18.java](https://github.com/VozSoldat/Algoritma-dan-Struktur-Data/blob/main/Pertemuan14/BinaryTree18.java) ln: 162
2. [BinaryTree18.java](https://github.com/VozSoldat/Algoritma-dan-Struktur-Data/blob/main/Pertemuan14/BinaryTree18.java) ln: 184
3. [BinaryTree18.java](https://github.com/VozSoldat/Algoritma-dan-Struktur-Data/blob/main/Pertemuan14/BinaryTree18.java) ln: 206
4. [BinaryTree18.java](https://github.com/VozSoldat/Algoritma-dan-Struktur-Data/blob/main/Pertemuan14/BinaryTree18.java) ln: 215
5. ...
	1. [BinaryTreeArray.java](https://github.com/VozSoldat/Algoritma-dan-Struktur-Data/blob/main/Pertemuan14/BinaryTreeArray18.java) 
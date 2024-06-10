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
4. Apakah alasan pemanggilan method `addFirst()` untuk menambahkan data, bukan method add jenis lain saat digunakan pada method `addEdge` pada class Graph? 
5. Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). ![](Pasted%20image%2020240603135931.png)

### Jawaban
1. -
2. Variabel tersebut dibuat untuk menyimpan informasi dari setiap verteks. Setiap verteks diwakili dengan elemen dalam array tersebut. Tipe data array tersebut., yakni `DoubleLinkedList`, berfungsi untuk menyimpan informasi tetangga-tetangga verteks menggunakan `Node`-nya.
3. Ketika suatu edge dihapus, maka program perlu mengetahui edge antara verteks apa yang hendak dihapus (asal dan tujuan). Setelah mengetahui kedua hal tersebut, method `remove` milik `DoubleLinkedList` menghapus node yang mengandung informasi **tujuan**. Jadi, array asal, di dalam node DoubleLinkedList-nya, tidak menyimpan informasi **tujuan** lagi. 
4. Mengubah `addFirst` menjadi `addLast` hanya mengubah urutan traversal, terutama ketika melakukan print. Ketika `addFirst digunakan`, maka ketika method print dijalankan, edge yang paling baru ditambahkan akan tampil lebih dulu. Hal tersebut berlaku pula sebaliknya untuk `addLast`. 
5. Hasil: 
	- ![](Pasted%20image%2020240603191039.png)
	- ![](Pasted%20image%2020240603191108.png)
	- Kode program
		- main
			```java
			...
			Scanner sc = new Scanner(System.in);
			System.out.println("=====================");
			System.out.println("Pengecekan edge");
			System.out.println("=====================");
			System.out.print("Masukkan gedung asal: ");
			int asal = sc.nextInt();
			System.out.print("Masukkan gedung tujuan: ");
			int tujuan = sc.nextInt();
			
			if (gedung.cekEdge(asal, tujuan)) {
				System.out.print("Gedung "+(char)('A'+asal)+" bertetangga dengan: "+(char)('A'+tujuan));
			}else{
				System.out.println("Gedung "+(char)('A'+asal)+" tidak bertetangga dengan: "+(char)('A'+tujuan));
			
			}
			```
		- Graph
			```java
			public boolean cekEdge(int asal, int tujuan) throws Exception{
				if (list[asal].getByData(tujuan) !=-1) {
					return true;
				}else{
					return false;
				}
			}
			```
		- DLL
			```java
			public int getByData(int data) throws Exception{
				Node18 tmp = head;
				for (int i = 0; i < size; i++) {
					if (tmp.data == data) {
						return i;
					}
					tmp = tmp.next;
				}
				return -1;
			}
			```

## 2. Percobaan 2
### 2.1. Langkah-Langkah Percobaan
-

### 2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240603193409.png)

### 2.3. Pertanyaan
1. Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
2. Apa jenis graph yang digunakan pada Percobaan 2? 
3. Apa maksud dari dua baris kode berikut? ![](Pasted%20image%2020240603193451.png)
4. Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree!

### Jawaban
1. -
2. Jenis graph tersebut adalah graph matriks.
3. Baris kode pertama berfungsi untuk menyimpan informasi hubungan (edge) antara verteks 1 dan 2 dengan panjang 70 dalam elemen array indeks (1,2). Baris kode kedua berfungsi untuk menyimpan edge antara verteks 2 dan 1.
4. Hasil run: ![](Pasted%20image%2020240609182210.png)
	```java
	public int inDegree(int asal){
		int total=0;
		for (int i = 0; i < matriks.length; i++) {
			if (matriks[asal][i] != 0) {
				total++;
			}
			i++;
		}
		return total;
	}
	
	public int outDegree(int asal){
		int total=0;
		for (int i = 0; i < matriks.length; i++) {
			if (matriks[i][asal] != 0) {
				total++;
			}
			i++;
		}
		return total;
	}
	public int degree(int asal){
		
		return inDegree(asal) + outDegree(asal);
	}
	```

## 3. Latihan Praktikum
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat dinamis, setidaknya terdiri dari: 
	1. Add Edge
	2. Remove Edge 
	3. Degree 
	4. Print Graph 
	5. Cek Edge
	Pengguna dapat memilih menu program melalui input Scanner
2. Tambahkan method `updateJarak` pada Percobaan 1 yang digunakan untuk mengubah jarak antara dua node asal dan tujuan! 
3. Tambahkan method `hitungEdge` untuk menghitung banyaknya edge yang terdapat di dalam graf!
`
### Jawaban
1. Kode Percobaan 1
	```java
	while (true) {
		
		System.out.println("Pilih menu:");
		System.out.println("1. Tambahkan edge");
		System.out.println("2. Hapus edge");
		System.out.println("3. degree");
		System.out.println("4. Print graph");
		System.out.println("5. cek edge");
		int pilih = sc.nextInt();
		
		switch (pilih) {
			case 1:
				System.out.print("Masukkan gedung asal: ");
				int asal = sc.nextInt();
				System.out.print("Masukkan gedung tujuan: ");
				int tujuan = sc.nextInt();
				System.out.print("Masukkan jarak: ");
				int jarak = sc.nextInt();
				gedung.addEdge(asal, tujuan, jarak);
				break;
			
			case 2:
				System.out.print("Masukkan gedung asal: ");
				asal = sc.nextInt();
				System.out.print("Masukkan gedung tujuan: ");
				tujuan = sc.nextInt();
				gedung.removeEdge(asal, tujuan);
				break;
			
			case 3:
				System.out.println("Masukkan gedung: ");
				asal = sc.nextInt();
				gedung.degree(asal);
				break;
			
			case 4:
				gedung.printGraph();
				break;
			
			case 5:
				System.out.println("=====================");
				System.out.println("Pengecekan edge");
				System.out.println("=====================");
				System.out.print("Masukkan gedung asal: ");
				 asal = sc.nextInt();
				System.out.print("Masukkan gedung tujuan: ");
				 tujuan = sc.nextInt();
		
				while (true) {
					if (asal == tujuan) {
						System.out.println("Gedung "+(char)('A'+asal)+" dan "+(char)('A'+tujuan)+" sama");
						break;
					}
					if (gedung.cekEdge(asal, tujuan)) {
						System.out.print("Gedung "+(char)('A'+asal)+" bertetangga dengan: "+(char)('A'+tujuan));
						break;
					}else{
						System.out.println("Gedung "+(char)('A'+asal)+" tidak bertetangga dengan: "+(char)('A'+tujuan));
						break;
					}
					// System.out.print("Gedung "+(char)('A'+asal)+" terhubung dengan: ");
				}
				break;
	
			case 6:
				return;
		
			default:
				break;
		}
	}
	```
	Kode percobaan 2
	```java
	while (true) {
		System.out.println("Pilih menu:");
		System.out.println("1. Tambahkan edge");
		System.out.println("2. Hapus edge");
		System.out.println("3. degree");
		System.out.println("4. Print graph");
		System.out.println("5. cek edge");
		int pilih = sc.nextInt();
		
		switch (pilih) {
			case 1:
				System.out.print("Masukkan gedung asal: ");
				int asal = sc.nextInt();
				System.out.print("Masukkan gedung tujuan: ");
				int tujuan = sc.nextInt();
				System.out.print("Masukkan jarak: ");
				int jarak = sc.nextInt();
				gdg.makeEdge(asal, tujuan, jarak);
				break;
			
			case 2:
				System.out.print("Masukkan gedung asal: ");
				asal = sc.nextInt();
				System.out.print("Masukkan gedung tujuan: ");
				tujuan = sc.nextInt();
				gdg.removeEdge(asal, tujuan);
				break;
			
			case 3:
				System.out.println("Masukkan gedung: ");
				asal = sc.nextInt();
				System.out.println("Degree: "+gdg.degree(asal));
				System.out.println("InDegree: "+gdg.inDegree(asal));
				System.out.println("OutDegree: "+gdg.outDegree(asal));
				break;
			
			case 4:
				gdg.printGraph();
				break;
			
			case 5:
				System.out.println("=====================");
				System.out.println("Pengecekan edge");
				System.out.println("=====================");
				System.out.print("Masukkan gedung asal: ");
				 asal = sc.nextInt();
				System.out.print("Masukkan gedung tujuan: ");
				 tujuan = sc.nextInt();
		
				while (true) {
					if (asal == tujuan) {
						System.out.println("Gedung "+(char)('A'+asal)+" dan "+(char)('A'+tujuan)+" sama");
						break;
					}
					if (gdg.cekEdge(asal, tujuan)) {
						System.out.print("Gedung "+(char)('A'+asal)+" bertetangga dengan: "+(char)('A'+tujuan));
					}else{
						System.out.println("Gedung "+(char)('A'+asal)+" tidak bertetangga dengan: "+(char)('A'+tujuan));
					}
					// System.out.print("Gedung "+(char)('A'+asal)+" terhubung dengan: ");
				}
				break;
	
			case 6:
				return;
		
			default:
				break;
		}
		
	}
	```

2. 
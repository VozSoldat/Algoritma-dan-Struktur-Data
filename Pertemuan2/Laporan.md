# Laporan Hasil Praktikum Pemilihan
#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

- ## 2.1. Percobaan 1: Deklarasi Class, Atribute, dan Method
	- ### 2.1.1. Langkah-Langkah Percobaan
		- Buat class bernama `Buku18.java`.
	- ### 2.1.2. Verifikasi Hasil Percobaan
		- ![](Screenshot%202024-02-19%20101939.png)
	- ### 2.1.3. Pertanyaan
		1. Sebutkan dua karakteristik class atau object!
		2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!
		3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
		4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!
		5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?
		6. Commit dan push kode program ke GitHub.
		- #### Jawaban
			1. Karakteristik objek yaitu adanya atribut dan method.
			2. Terdapat 5 atribut pada Class tersebut, yaitu judul:String, pengarang:String, halaman:int, stok:int, dan harga:int.
			3. Terdapat 4 method pada class tersebut, yaitu tampilInformasi(): void, terjual(jml: int): void, restock(n: int): void, dan gantiHarga(hrg: int): int.
			4. Kode program modifikasi:
				```java
				void terjual(int jml){
					if (stok>0) {
						stok-=jml;
					}
				}
				```
			5. Parameter pada method restock() berupa int karena parameter tersebut digunakan untuk menyimpan jumlah barang baru-datang atau restock.
- ## 2.2. Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
	- ### 2.2.1. Langkah-Langkah Percobaan
	- ### 2.2.2. Verifikasi Hasil Percobaan
		- ![](Screenshot%202024-02-19%20103927.png)
	- ### 2.2.3. Pertanyaan
		1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
		2. Bagaimana cara mengakses atribut dan method dari suatu objek?
		3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
		- #### Jawaban
			1. Proses instansiasi:
				```java
				Buku18 bk1 = new Buku18();
				```
				Nama objek yang dihasilkan yaitu **bk1**.
			2. Untuk mengakses atribut dan method suatu objek, kita perlu membuat class lain untuk meng-instansiasi objek tadi. Pertama, instansiasi objek, yaitu pada bagian `Buku bk1 = new Buku();`. Kemudian tulis atribut dan method milik objek dengan format \<nama objek>.\<nama atribut> atau \<nama objek>.\<nama method()>.
			3. Karena urutan method milik objek yang ditulis pada program BukuMain. `tampilInformasi()` yang pertama menunjukkan nilai-nilai atribut yang diinisialisasi di awal. Kemudian tertulis `method bk1.terjual(5);` dan `bk1.gantiHarga(60000);` yang mengubah nilai dalam atribut objek. Nilai akhir ditampilkan kembali ketik method `tampilInformasi()` ditulis lagi.
- ## 2.3. Percobaan 3: Membuat Constructure
	- ### 2.3.1. Langkah-Langkah Percobaan
	- ### 2.3.2. Verifikasi Hasil Percobaan
		- ![](Screenshot%202024-02-19%20105707.png)
	- ### 2.3.3. Pertanyaan
		1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
		2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?![](Pasted%20image%2020240219105932.png)
		3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
		4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses secara berurutan? Jelaskan alasannya!
		5. Buat object baru dengan nama buku menggunakan konstruktor berparameter dari class Buku!
		6. Commit dan push kode program ke Github
			- #### Jawaban
				1. Kode program:
					```java
					public Buku18(String jud, String pg, int hal, int stok, int har){
						judul = jud;
						pengarang = pg;
						halaman = hal;
						this.stok = stok;
						harga = har;
					}
					```
				2. Baris program tersebut mengirim parameter kepada konstruktor pada class Buku yang akhirnya mengubah nilai-nilai atribut objek tersebut. Jadi pengguna tidak perlu menulis nilai atribut objek satu persatu dengan cara \<nama objek>.\<nama atribut>.
				3. Hasilnya adalah error. Hal ini karena instansiasi pada class BukuMain tidak memiliki definisi dari konstruktornya, yaitu `Buku();`.
				4. Tidak. Method dalam class Buku dapat dipanggil bagaimanapun urutannya pada BukuMain sesuai keinginan pemrogram.
				5. Objek baru:
					```java
					Buku18 bukuMuhErril = new Buku18("Buku Sakti Java Khatam Satu Minggu", "Erril", 900, 5, 99000);
					```
- ## 2.4. Latihan Praktikum
	1. 
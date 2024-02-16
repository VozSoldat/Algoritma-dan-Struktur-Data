# Laporan Hasil Praktikum Pemilihan
#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

- ## Praktikum 1: Pemilihan
	- Deklarasi variabel nilai yang akan diinputkan.
		```java
		short nTugas;
		short nQuiz;
		short nUTS;
		short nUAS;
		boolean isValid = true;
		```
  
	- Buat scanner input nilai tugas, quiz, UTS, dan UAS. Algoritma ini dimasukkan ke dalam perulangan *do-while* untuk membuat algoritma diulang jika terdapat input yang tidak valid. Gunakan boolean `isValid` untuk menentukan kondisi kemunculan pesan "Input tidak valid. Masukkan kembali."
		```java
		do{
		            if (isValid == false) {
		                System.out.println("Input tidak valid. Masukkan kembali nilai.");
		            }
		        System.out.print("Masukkan Nilai Tugas : ");
		        nTugas = sc.nextShort();
		  
		        System.out.print("Masukkan Nilai Quiz : ");
		        nQuiz = sc.nextShort();
		  
		        System.out.print("Masukkan Nilai UTS : ");
		        nUTS = sc.nextShort();
		  
		        System.out.print("Masukkan Nilai UAS : ");
		        nUAS = sc.nextShort();
		  
		        if (nTugas > 100 || nQuiz > 100 || nUTS > 100 || nUAS > 100) {
		            isValid = false;
		        }
		        } while (nTugas > 100 || nQuiz > 100 || nUTS > 100 || nUAS > 100);
		```

	- Buat mesin konversi nilai angka ke nilai huruf dengan algoritma pemilihan.
		```java
		float a = rataRata;
		String huruf;
		if (a > 80) {
			huruf = "A";
		} else if(a >72) {
			huruf ="B+";
		} else if (a > 65) {
			huruf ="B";
		} else if (a > 60) {
			huruf = "C+";
		} else if(a > 50){
			huruf = "C";
		}else if (a >39) {
			huruf = "D";
		} else {
			huruf = "E";
		}
		```

	- Cetak hasil nilai rata-rata dan nilai huruf. Gunakan algoritma pemilihan untuk menunjuk status lulus atau tidak lulus mahasiswa.
		```java
		System.out.println("Nilai Akhir : " + rataRata);
		
		System.out.println("Nilai Huruf : " + huruf);
		
		
		
		if (rataRata > 50) {
		
			System.out.println("SELAMAT, ANDA LULUS!!");
		
		} else{
		
			System.out.println("ANDA TIDAK LULUS");
		
		}
		```
	- Tampilan console:
		- ![[Pasted image 20240216084730.png]]
		- ![](Pasted%20image%2020240216095436.png)
	
- ## Praktikum 2: Perulangan
	- Deklarasi dan inisialisasi variabel NIM dengan tipe data char. Hal tersebut agar program dapat mendapatkan karakter ke-10 (index:9).
		```java
		char nim;
		System.out.print("Masukkan NIM : ");
		nim = sc.next().charAt(9);
		System.out.println("============");
		```
	\
	- Gunakan method Character.getNumericValue untuk mengambil karakter pada index:9 sebagai angka. Kemudian casting menjadi short untuk menyamakan dengan tipe data variabel `angkaAkhir`.
		```java
		short angkaAkhir = (short) Character.getNumericValue(nim);
		```
	
	- Gunakan algoritma pemilihan untuk menambah 10 jika angka akhir NIM kurang dari 10.
		```java
		if (angkaAkhir < 10) {
			angkaAkhir+=10;
		}
		```
	
	- Buat algoritma pemilihan di dalam perulangan **for**. 
		1. Kondisi pertama menggunakan `continue` jika nilai **i** == 6 atau 10. Hal tersebut agar program melewatkan atau tidak mencetak kedua angka tersebut.
		2. Kondisi kedua menggunakan `i % 2 == 1` untuk mendeteksi bilangan ganjil. Jika terpenuhi, program akan mencetak `"* "`.\
		3. Kondisi else untuk mencetak nilai **i**.
		```java
		for (int i = 1; i <= angkaAkhir; i++) {
			if ( i== 6 || i == 10) {
				continue;
			} else if (i % 2 == 1) {
				System.out.print("* ");
			} else {
				System.out.print(i+" ");
			}
		
		}
		```
	- Tampilan console:
		- ![[Pasted image 20240216091546.png]]

- ## Praktikum 3: Array
	- Buat variabel-variabel untuk menyimpan nilai baik tunggal maupun larik (array).
		```java
		static short[] nilaiPersenInput = new short [8];
		static float[] nilaiPerempat = new float [8];
		static String[] nilaiHuruf = new String [8];
		static float[] nilaiMatkulxSKS = new float [8];
		static double indeksPrestasi;
		```
	
	- Buat variabel array untuk menyimpan nama-nama mata kuliah dan bobot masing-masing. Urutan pada isi kedua array sama agar elemen mata kuliah dan bobot dapat dipanggil dengan mudah.
		```java
		static String[] matkul= {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
		static float[] bobot = {3.5F, 4, 4, 4, 3.5F, 4, 4, 4};
		```
	
	- Buat sebuah array sampel nilai angka untuk menyimpan nilai-nilai angka ekuivalen nilai-nilai huruf.
		```java
		static float[] nilaiPerempatSample = {4, 3.5F, 3, 2.5F, 2, 1, 0 };
		```

	- Ambil input pengguna. Satu elemen dalam array `nilaiPersenInput[]` menyimpan nilai satu mata kuliah. Kemudian, nilai dilewatkan ke algoritma pemilihan untuk mendapatkan nilai huruf dan nilai setara hurufnya (`nilaiPerempat[]`). Program akan berulang sebanyak jumlah mata kuliah.
		```java
		System.out.println("Program Menghitung IP Semester\n=================");
		for (int i = 0; i < nilaiPersenInput.length; i++) {
			System.out.print("Masukkan nilai angka untuk mata kuliah "+matkul[i] +" ");
			nilaiPersenInput[i] = sc.nextShort();
		
			short a = nilaiPersenInput[i];
			if (a > 80) {
				nilaiHuruf[i] = "A";
				nilaiPerempat[i] = nilaiPerempatSample[0];
			} else if(a >72) {
				nilaiHuruf[i] ="B+";
				nilaiPerempat[i] = nilaiPerempatSample[1];
			} else if (a > 65) {
				nilaiHuruf[i] ="B";
				nilaiPerempat[i] = nilaiPerempatSample[2];
			} else if (a > 60) {
				nilaiHuruf[i] = "C+";
				nilaiPerempat[i] = nilaiPerempatSample[3];
			} else if(a > 50){
				nilaiHuruf[i] = "C";
				nilaiPerempat[i] = nilaiPerempatSample[4];
			}else if (a >39) {
				nilaiHuruf[i] = "D";
				nilaiPerempat[i] = nilaiPerempatSample[5];
			} else {
				nilaiHuruf[i] = "E";
				nilaiPerempat[i] = nilaiPerempatSample[6];
			}
		}
		```
	
	- Inisialisasi variabel untuk menyimpan hasil hitung $\Sigma Nilai \times SKS$ . Inisialisasi pula variabel untuk menyimpan jumlah semua bobot mata kuliah. Selanjutnya gunakan algoritma perulangan untuk menjumlah dan mengalikan semua elemen dalam array `nilaiMatkulxSKS`, `sigmaNilaixSKS`, dan `sigmaSKS`. Terakhir, hitung $Indeks Prestasi = \frac{\Sigma Nilai SKS}{\Sigma SKS}$ .
		```java
		// nilaiperempat * sks
		double sigmaNilaixSKS = 0;
		double sigmaSKS = 0;
		for (int i = 0; i < nilaiMatkulxSKS.length; i++) {
			nilaiMatkulxSKS[i] = nilaiPerempat[i] * bobot[i];
		
			sigmaNilaixSKS += nilaiMatkulxSKS[i];
		
			sigmaSKS += bobot[i];
		}
		
		indeksPrestasi = sigmaNilaixSKS / sigmaSKS;
		```
	
	- Cetak semua hasil dengan menggunakan `System.out.printf()` untuk mendapatkan format seperti tabel. Gunakan perulangan untuk mencetak semua elemen array dengan format tadi. Terakhir, cetak Indeks Prestasi.
		```java
		// cetak nilai setiap matkul
		System.out.printf("| %-37s | %-13s | %-13s | %-13s | %-13s | %n", "MK", "Nilai Angka", "Nilai Huruf", "Nilai Setara", "Bobot");
		for (int i = 0; i < matkul.length; i++) {
			System.out.printf("| %-37s | %-13s | %-13s | %-13s | %-13s | %n", matkul[i], nilaiPersenInput[i], nilaiHuruf[i], nilaiPerempat[i], bobot[i]);
		
		}
		System.out.printf(Locale.US, "IP : "+ "%1.2f%n", indeksPrestasi);
		```

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
		- <img src="https://github.com/VozSoldat/Algoritma-dan-Struktur-Data/blob/main/Pasted%20image%2020240216084730.png">
	
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
	- Gambar tampilan
		- ![](Pasted%20image%2020240218104304.png)

- ## Praktikum 4: Fungsi
	- Inisialisasi variabel-variabel untuk menyimpan informasi yang diketahui.
		```java
		static Scanner sc = new Scanner(System.in);
	    static String[] cabangToko = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"}; // baris
	
	    static String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"}; // kolom
	    static short[] hargaBunga = {75, 50, 60, 10};
	
	    static short[][] stokBunga = {{10, 5, 15, 7}, 
	                                    {6,11,9,12}, 
	                                    {2,10,10,5}, 
	                                    {5,7,12,9}};
		```
	
	- Buat menu pada fungsi `main`.
		```java
		System.out.println("Program Laporan Pendapatan PT Royal Garden, Tbk.\n==================");
        System.out.println("Pilih fitur:\n1 - Cek Pendapatan\n2 - Stok");
        char inputPilih = sc.next().charAt(0);
        if (inputPilih == '1') {
            pendapatan();
        } else if (inputPilih == '2') {
            stok();
        }
		```
	
	- Buat fungsi penghitung dan pencetak pendapatan. Deklarasikan array untuk menyimpan pendapatan tiap jenis bunga pada setiap toko. Kemudian buat array untuk menyimpan pendapatan masing-masing cabang. Gunakan algoritma perulangan untuk menjumlahkan pendapatan setiap jenis bunga dan pendapatan setiap cabang. Cetak hasilnya dengan menggunakan `printf()`–agar berbentuk seperti tabel–dan perulangan.
		```java
		public static void pendapatan(){
	        // hitung pendapatan
	        int[][] pendapatanTiapBungaToko = new int[4][4];
	        int[] pendapatanPerToko = {0, 0, 0, 0};
	        for (int i = 0; i < pendapatanTiapBungaToko.length; i++) {
	            for (int j = 0; j < pendapatanTiapBungaToko[i].length; j++) {
	                pendapatanTiapBungaToko[i][j] = stokBunga[i][j] * hargaBunga[j] *1000;
	            }
	            for (int j = 0; j < pendapatanPerToko.length; j++) {
	                pendapatanPerToko[i] += pendapatanTiapBungaToko[i][j]*1000;
	            }
	        }
	        System.out.printf(Locale.ITALY,"| %-12s | %-12s | %-12s | %-12s | %-12s | %-12s |\n", " ",namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3], "Total" );
	        for (int i = 0; i < pendapatanPerToko.length; i++) {
	            System.out.printf("| %-12s | %-,12d | %-,12d | %-,12d | %-,12d | %-,12d |\n", cabangToko[i], pendapatanTiapBungaToko[i][0], pendapatanTiapBungaToko[i][1], pendapatanTiapBungaToko[i][2], pendapatanTiapBungaToko[i][3], pendapatanPerToko[i]);
	        }

	    }
		```
	
	- Buat fungsi untuk menghitung dan menampilkan stok Royal Garden 4. Inisialisasi array bunga-bunga yang mati dan inisialisasi stok akhir bunga setelah dikurangi dengan yang mati. Cetak hasilnya dengan `printf()` untuk membentuk tabel. 
		```java
		public static void stok(){
	        short[] mati = {1, 2, 0, 5};
	        int[] stokAkhir = {(stokBunga[3][0]-mati[0]), (stokBunga[3][1] - mati[1]), (stokBunga[3][2] - mati[2]), (stokBunga[3][3] - mati[3]) };
	        System.out.println("Stok Bunga Royal Garden 4\n============================");
	        System.out.printf("| %-12s | %-12s | %-12s | %-12s | %-12s |\n", " ",namaBunga[0], namaBunga[1], namaBunga[2], namaBunga[3]);
	        System.out.printf("| %-12s | %-,12d | %-,12d | %-,12d | %-,12d |\n", "Awal", stokBunga[3][0], stokBunga[3][1], stokBunga[3][2], stokBunga[3][3]);
	        System.out.printf("| %-12s | %-12s | %-12s | %-12s | %-12s |\n", "Akhir", stokAkhir[0]+ " (mati: "+mati[0]+")", stokAkhir[1]+ " (mati: "+mati[1]+")", stokAkhir[2]+ " (mati: "+mati[2]+")", stokAkhir[3]+ " (mati: "+mati[3]+")");
	
	    }
		```
	
	- Gambar tampilan 
		- ![](Pasted%20image%2020240218104148.png)
		- ![](Pasted%20image%2020240218104156.png)

- ## Tugas
	- ### Kode Wilayah Nomor Polisi
		- Inisialisasi array yang berisi kode wilayah. Inisialisasi pula array tipe data `String` untuk menyimpan nama wilayah.
			```java
			static String[] kotaString = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"};
			static char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
			```
		
		- Inisialisasi array tipe data char. Gunakan method `toCharArray` pada array `kotaString` untuk mengubah sebuah String menjadi sebuah array karakter.
			```java
			static char[][] kota = {kotaString[0].toCharArray(), kotaString[1].toCharArray(), kotaString[2].toCharArray(),kotaString[3].toCharArray(), kotaString[4].toCharArray(), kotaString[5].toCharArray(), kotaString[6].toCharArray(), kotaString[7].toCharArray(), kotaString[8].toCharArray(), kotaString[9].toCharArray()};
			```
		
		- Buat fungsi untuk mencetak karakter dari nama wilayah yang dipilih pengguna. Fungsi ini memiliki parameter `int j` yang didapatkan dari pemilihan pada fungsi `main`. 
			```java
			public static void cetakKota(int j){
			        for (int i = 0; i < kota[j].length; i++) {
			            System.out.print(kota[j][i]+" ");
			        }
			    }
			```
		
		- Buat scanner input pengguna. Gunakan algoritma pemilihan untuk memilih nomor index dari array `cetakKota`. 
			```java
			System.out.println("Masukkan kode wilayah nomor polisi.");
	        String inputPilih = sc.next();
	
	        if (inputPilih.equalsIgnoreCase("a")) {
	            cetakKota(0);
	        } else if (inputPilih.equalsIgnoreCase("b")) {
	            cetakKota(1);
	        } else if (inputPilih.equalsIgnoreCase("d")) {
	            cetakKota(2);
	        } else if (inputPilih.equalsIgnoreCase("e")) {
	            cetakKota(3);
	        }else if (inputPilih.equalsIgnoreCase("f")) {
	            cetakKota(4);
	        }else if (inputPilih.equalsIgnoreCase("g")) {
	            cetakKota(5);
	        }else if (inputPilih.equalsIgnoreCase("h")) {
	            cetakKota(6);
	        }else if (inputPilih.equalsIgnoreCase("l")) {
	            cetakKota(7);
	        }else if (inputPilih.equalsIgnoreCase("n")) {
	            cetakKota(8);
	        }else if (inputPilih.equalsIgnoreCase("t")) {
	            cetakKota(9);
	        }
			```
		- Gambar tampilan
			- ![](Pasted%20image%2020240218102734.png)
	
	- ### Fisika
		- Buat fungsi penghitung kecepatan. Persamaan kecepatan yakni $v=\frac{s}{t}$ . Fungsi kecepatan, jara, dan waktu mengembalikan nilai String.
			```java
			public static String mesinKecepatan(){
				System.out.println("MESIN HITUNG KECEPATAN\n===========");
				System.out.print("Masukkan jarak (m) : ");
				double jarak = sc.nextDouble();
				
				System.out.print("Masukkan waktu (s) : ");
				double waktu = sc.nextDouble();
				
				double kecepatan = jarak/waktu;
				String hasil = kecepatan+" m/s";
				return hasil;
			}
			```
		
		- Buat fungsi penghitung jarak. Jarak dapat dicari nilainya menggunakan persamaan kecepatan $s=t\times v$ .
			```java
			public static String mesinJarak(){
				System.out.println("MESIN HITUNG JARAK\n============");
				System.out.print("Masukkan waktu (s) : ");
				double waktu = sc.nextDouble();
		
				System.out.print("Masukkan kecepatan (m/s) : ");
				double kecepatan = sc.nextDouble();
		
				double jarak = waktu * kecepatan;
				String hasil = jarak+" m";
				return hasil;
			}
			```
		
		- Buat fungsi penghitung waktu. Waktu dapat dicari menggunakan persamaan kecepatan $t=\frac{s}{v}$ .
			```java
			public static String mesinWaktu(){
		        System.out.println("MESIN HITUNG WAKTU\n============");
		        System.out.print("Masukkan jarak (s) : ");
		        double jarak = sc.nextDouble();
		
		        System.out.print("Masukkan kecepatan (m/s) : ");
		        double kecepatan = sc.nextDouble();
		
		        double waktu = jarak / kecepatan;
		        String hasil = waktu+" s";
		        return hasil;
		    }
			```
		
		- Buat scanner input pengguna pada fungsi `main`. Cetak hasil olahan dari fungsi-fungsi penghitung.
			```java
			System.out.println("SELAMAT DATANG DI MESIN FISIKA\n============================");
	        System.out.println("Pilih besaran yang ingin dicari.\n1 - Kecepatan\n2 - Jarak\n3 - Waktu");
	        char pilihan = sc.next().charAt(0);
	        String hasil = " ";
	
	        if (pilihan == '1') {
	            hasil = mesinKecepatan();
	        }else if (pilihan == '2') {
	            hasil = mesinJarak();
	        }else if (pilihan == '3') {
	            hasil = mesinWaktu();
	        } else{
	            System.out.println("Input tidak valid. Masukkan kembali.");
	            main(args);
	        }
	        System.out.println(hasil);
			```
		- Gambar tampilan
			- ![](Pasted%20image%2020240218102648.png)

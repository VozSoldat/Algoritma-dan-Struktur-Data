# Laporan Hasil Praktikum Pemilihan
#### Muhammad Erril Putra Pratidina
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
	 // Nilai Huruf

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
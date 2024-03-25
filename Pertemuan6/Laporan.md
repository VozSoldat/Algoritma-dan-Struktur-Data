# 5. Sorting (Bubble, Selection, dan Insertion Sort)

#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 5.2. Percobaan 1
### 5.2.1. Langkah-Langkah Percobaan
1. -
### 5.2.2. Verifikasi Hasil Percobaan
	Data mahasiswa sebelum sorting = 
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Data mahasiswa setelah sorting desc berdasarkan ipk
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75

### 5.2.3. Pertanyaan
1. Terdapat di method apakah proses bubble sort? 
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini: Untuk apakah proses tersebut? 
	```java
	if(listMhs[j].ipk > listMhs[j-1].ipk) {
	//di bawah ini proses swap atau penukaran
	Mahasiswa tmp = listMhs[j];
	listMhs[j] = listMhs[j-1];
	listMhs[j-1] = tmp;
	}
	```
	

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
	```java
	for(int i=0; i<listMhs.length-1; i++) {
		for(int j=1; j<listMhs.length-i; j++){
	```
	1. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
	2. Mengapa syarat dari perulangan i adalah `i<listMhs.length-1`?
	3. Mengapa syarat dari perulangan j adalah j
	4. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
### Jawaban
1. -

## 5.3. Percobaan 2
### 5.3.1. Langkah-Langkah Percobaan
1. -
### 5.3.2. Verifikasi Hasil Percobaan
	Data mahasiswa sebelum sorting = 
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Data mahasiswa setelah sorting asc berdasarkan ipk  
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0

### 5.3.3. Pertanyaan
1. -
### Jawaban
1. -
 
## 5.4. Percobaan 3
### 5.4.1. Langkah-Langkah Percobaan
1. -
### 5.4.2. Verifikasi Hasil Percobaan
	Data mahasiswa setelah sorting asc berdasarkan ipk
	Nama = Abdul
	Tahun masuk = 2017
	Umur = 23
	IPK = 2.0
	___________________________
	Nama = Nusa
	Tahun masuk = 2017
	Umur = 25
	IPK = 3.0
	___________________________
	Nama = Dompu
	Tahun masuk = 2018
	Umur = 19
	IPK = 3.5
	___________________________
	Nama = Ummi
	Tahun masuk = 2019
	Umur = 21
	IPK = 3.75
	___________________________
	Nama = Rara
	Tahun masuk = 2012
	Umur = 19
	IPK = 4.0
	___________________________

### 5.4.3. Pertanyaan
1. -
### Jawaban
1. -
## 5.5. Latihan Praktikum

### Jawaban
1. -
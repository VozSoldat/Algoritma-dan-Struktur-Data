# 3. Laporan Hasil Praktikum Objek
#### Muhammad Erril Putra Pratidina
##### Kelas TI-1H
##### NIM: 2341720183

## 3.2. Percobaan 1
### 3.2.1. Langkah-Langkah Percobaan
### 3.2.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240226095131.png)
### 3.2.3. Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!
2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut : ![](Pasted%20image%2020240226093818.png)
3. Apa yang dimaksud dengan kode berikut ini: ![](Pasted%20image%2020240226093846.png)
4. Apa yang dimaksud dengan kode berikut ini: ![](Pasted%20image%2020240226093902.png)
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
### Jawaban
1. f
2. Class PersegiPanjang tidak memiliki konstruktor. Pemanggilan konstruktor pada bagian instansiasi object `ppArray[1] = new PersegiPanjang():` adalah langkah yang harus ada dalam instansiasi objek, baik class memiliki konstruktor ataupun tidak.
3. Kode tersebut berarti sebuah instansiasi array of object dengan panjang array = 3.
4. Kode tersebut, pada baris pertama, merupakan instansiasi sebuah object dalam array `ppArray[1]` indeks 1. Pada baris kedua, program berarti mengisi nilai attribute `ppArray[1].panjang` dengan 80. Sama dengan baris kedua, baris ketiga mengisi nilai attribute lebar milik `ppArray[1]` dengan 40.
5. Class main adalah tempat meng-instansiasi suatu class menjadi object. 
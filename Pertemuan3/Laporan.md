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
2. Apakah class PersegiPanjang memiliki konstruktor? Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
![](Pasted%20image%2020240226093818.png)
4. Apa yang dimaksud dengan kode berikut ini: ![](Pasted%20image%2020240226093846.png)
5. Apa yang dimaksud dengan kode berikut ini: ![](Pasted%20image%2020240226093902.png)
6. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
### Jawaban
1. Untuk dibuat ke dalam array of object, class tidak perlu memiliki attribute ataupun method. Akan tetapi, class yang tidak memiliki salah satu dari keduanya tidak dapat digunakan untuk melakukan apapun.
2. Class PersegiPanjang tidak memiliki konstruktor. Pemanggilan konstruktor pada bagian instansiasi object `ppArray[1] = new PersegiPanjang():` adalah langkah yang harus ada dalam instansiasi objek, baik class memiliki konstruktor ataupun tidak.
3. Kode tersebut berarti sebuah instansiasi array of object dengan panjang array = 3.
4. Kode tersebut, pada baris pertama, merupakan instansiasi sebuah object dalam array `ppArray[1]` indeks 1. Pada baris kedua, program berarti mengisi nilai attribute `ppArray[1].panjang` dengan 80. Sama dengan baris kedua, baris ketiga mengisi nilai attribute lebar milik `ppArray[1]` dengan 40.
5. Class main adalah tempat meng-instansiasi suatu class menjadi object. Class main tidak wajib dipisahkan dari class yang menjadi konsep. Memisahkan class menjadi main dan class konsep dapat membuat kode program menjadi lebih rapi.
## 3.3. Percobaan 2
### 3.3.1. Langkah-Langkah Percobaan
### 3.3.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240226095931.png)

### 3.3.3. Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode di bawah ini akan memunculkan error saat dijalankan. Mengapa? ![](Pasted%20image%2020240226100111.png)
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada `ppArray[i]` sekaligus `ppArray[0]`?Jelaskan!
### Jawaban
1. Array of object dapat diimplementasikan pada array dua dimensi.
2. Contohnya: 
```java
public class ContohArray2D {
    int panjang;
    int lebar;
    public static void main(String[] args) {
        ContohArray2D[][] array = new ContohArray2D[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new ContohArray2D();
                array[i][j].panjang = 10;
                array[i][j].lebar = 2;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Panjang: " +array[i][j].panjang);
                System.out.println("Lebar: "+ array[i][j].lebar);
            }
        }
    }
}
```
3. Array `pgArray[5]` belum diinstansiasi, sehingga  attribute sisi tidak dapat diberi nilai.
4. Kode program:
```java
System.out.print("Masukkan panjang array: ");

        int panjangArray = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];
```
![](Pasted%20image%2020240226101425.png)

5. Boleh. Setelah dilakukan eksperimen, adanya baris kode instansiasi yang ganda tidak membuat program error.
```java
PersegiPanjang[] ppArray = new PersegiPanjang[panjangArray];
        ppArray[0] = new PersegiPanjang();
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
```
## 3.4. Percobaan 3
### 3.4.1. Langkah-Langkah Percobaan
### 3.4.2. Verifikasi Hasil Percobaan
![](Pasted%20image%2020240226102313.png)
### 3.4.3. Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
2. Jika diketahui terdapat class Segitiga seperti berikut ini: ![](Pasted%20image%2020240226102409.png)
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan library Math pada Java untuk mengkalkulasi sisi miring)
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4 
sgArray ke-1 alas: 20, tinggi: 10 
sgArray ke-2 alas: 15, tinggi: 6 
sgArray ke-3 alas: 25, tinggi: 10
6. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method `hitungLuas()` dan `hitungKeliling()`.
### Jawaban
1. Bisa. Kode program tidak mengalami error ketika dituliskan baris kode di bawah. Nilai yang ditulis dalam parameter pada class main akan disimpan pada attribute dalam kedua konstruktor.
```java
public Balok(int p, int l, int t){
	panjang = p;
	lebar = l;
	tinggi = t;

}
public Balok(int p){
	panjang = p;
}
```
2. Hasil kode program soal nomor 2 sampai 5:
```java
package Pertemuan3.ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    int hitungLuas(){
        return alas * tinggi;
    }
    double hitungKeliling(){
        return alas+tinggi+Math.hypot(tinggi, alas);
    }

    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20,10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas segitiga ke-"+i+" yaitu "+sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga yaitu "+ sgArray[i].hitungKeliling());
        }
    }
}
```
## 3.5. Latihan Praktikum
### 3.2.1. Langkah-Langkah Percobaan
### 3.2.2. Verifikasi Hasil Percobaan

### 3.2.3. Pertanyaan

### Jawaban

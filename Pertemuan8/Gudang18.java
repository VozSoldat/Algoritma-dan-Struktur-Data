package Pertemuan8;

public class Gudang18 {
    Barang18[] tumpukan;
    int size;
    int top;

    public Gudang18(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang18[size];
        top=-1;
    }
    boolean cekKosong(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    boolean cekPenuh(){
        if (top==size-1) {
            return true;
        }else{
            return false;
        }
    }
    void tambahBarang(Barang18 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama +" berhasil ditambahkan ken Gudang." );
        }else{
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh.");
        }
    }
    public Barang18 ambilBarang(){
        if (!cekKosong()) {
            Barang18 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama +" diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: "+konversiDesimalKeBiner(delete.kode));
            return delete;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public Barang18 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang18 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+barangTeratas.nama);
            return barangTeratas;
        }else{
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang:");
            // for (int i = top; i >= 0; i--)
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else{
            System.out.println("Tumpukan barang kosong.");
        }
    }
    public String konversiDesimalKeBiner(int kode){
        StackKonversi stack = new StackKonversi();
        while (kode>0) {
            int sisa = kode %2;
            stack.push(sisa);
            kode = kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

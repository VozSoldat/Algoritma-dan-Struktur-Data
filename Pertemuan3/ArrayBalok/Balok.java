package Pertemuan3.ArrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;
    
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;

    }
    public Balok(int p){
        panjang = p;
    }
    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}

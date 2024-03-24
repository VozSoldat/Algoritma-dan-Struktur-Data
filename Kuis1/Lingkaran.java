package Kuis1;

public class Lingkaran {
    double luas;

    Lingkaran(int jariJari){
        this.luas = jariJari * jariJari * Math.PI;
    }

    public static void main(String[] args) {
        Lingkaran array[] = new Lingkaran[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Lingkaran(5);
        }
    }
}

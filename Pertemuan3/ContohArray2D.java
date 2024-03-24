package Pertemuan3;

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

class Coba {
    public static void main(String[] args) {
        ContohArray2D[][] array = new ContohArray2D[3][3];
        array[0][0] = new ContohArray2D();
        array[2][2] = new ContohArray2D();
    }
}

package Pertemuan5;

public class LatihanPraktikum {
    // static String[] merk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen"};
    // static String[] model = {"M2 Coupe", "Fiesta ST"," 370Z", "BRZ", "Impreza WRX STI"," AE86 Trueno"," 86/GT86", "Golf GTI"};
    // static double[] accel = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
    // static double[] power = {728,   575, 657,  609,  703,  553,  609,  631};
    public static void main(String[] args) {
        String[] merk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", "Toyota", "Toyota", "Volkswagen"};
        String[] model = {"M2 Coupe", "Fiesta ST"," 370Z", "BRZ", "Impreza WRX STI"," AE86 Trueno"," 86/GT86", "Golf GTI"};
        double[] accel = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
        double[] power = {728,   575, 657,  609,  703,  553,  609,  631};

        System.out.println("======================");
        System.out.println("max top acceleration");
        System.out.println(merk[topAccelDC(accel, 0, (accel.length-1))]+", "+ model[topAccelDC(accel, 0, (accel.length-1))]+", "+ accel[topAccelDC(accel, 0, (accel.length-1))]);

        System.out.println("=======================");
        System.out.println("min top acceleration");
        System.out.println(merk[minAccelDC(accel, 0, (accel.length-1))]+", "+ model[minAccelDC(accel, 0, (accel.length-1))]+", "+ accel[minAccelDC(accel, 0, (accel.length-1))]);

        System.out.println("=========================");
        System.out.println("rata-rata power");
        System.out.println(meanTopPower(power));
    }
    
    static int topAccelDC(double arr[], int l, int r){
        if (l == r) {
            return l;
        } else {
            int mid = (l + r) / 2;
            int lmax = topAccelDC(arr, l, mid);
            int rmax = topAccelDC(arr, mid + 1, r);
            if (arr[lmax] > arr[rmax]) {
                return lmax;
            } else {
                return rmax;
            }
        }
    }

    static int minAccelDC(double arr[], int l, int r){
        if (l == r) {
            return l;
        } else {
            int mid = (l + r) / 2;
            int lmin = minAccelDC(arr, l, mid);
            int rmin = minAccelDC(arr, mid + 1, r);
            if (arr[lmin] < arr[rmin]) {
                return lmin;
            } else {
                return rmin;
            }
        }
    }

    static double meanTopPower(double arr[]){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }
}
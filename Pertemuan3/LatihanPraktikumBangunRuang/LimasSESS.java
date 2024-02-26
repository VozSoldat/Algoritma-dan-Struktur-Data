package Pertemuan3.LatihanPraktikumBangunRuang;

import java.util.Scanner;

public class LimasSESS {
    int sisiAlas;
    int tinggiLimas;

    double LuasPermukaan(){
        double luas = Math.pow(sisiAlas, 2)+(4 * (1/2 * sisiAlas * Math.hypot(tinggiLimas, sisiAlas)));
        return luas;
    }
    double Volume(){
        return Math.pow(sisiAlas, 2) * tinggiLimas/3;
    }

    void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("M");
    }

    LimasSESS(int sisiAlas, int tinggiLimas){
        this.sisiAlas = sisiAlas;
        this.tinggiLimas = tinggiLimas;
        // LuasPermukaan();
        // Volume();
    }
    LimasSESS(){

    }
}

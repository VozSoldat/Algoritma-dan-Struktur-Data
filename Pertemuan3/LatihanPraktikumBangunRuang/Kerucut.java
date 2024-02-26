package Pertemuan3.LatihanPraktikumBangunRuang;

import java.util.Scanner;

public class Kerucut {
    int radius;
    int hypot;

    Kerucut(int radius, int hypot){
        this.radius = radius;
        this.hypot = hypot;

        // LuasPermukaan();
        // Volume();
    }

    double LuasPermukaan(){
        double luas = (Math.PI*radius*hypot)+(Math.PI*Math.pow(radius, 2));
        return luas;
    }
    double Volume(){
        double volume = Math.PI * Math.pow(radius, 2) * (Math.sqrt(Math.pow(hypot, 2)-Math.pow(radius, 2)))/3;
        return volume;
    }

    void Input(){

    }
    Kerucut(){

    }
}

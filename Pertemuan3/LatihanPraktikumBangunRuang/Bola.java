package Pertemuan3.LatihanPraktikumBangunRuang;



public class Bola {
    int radius;

    double LuasPermukaan(){
        double luas = 4 * Math.PI * Math.pow(radius, 2);
        return luas;
    }
    double Volume(){
        return 4/3 * Math.PI * Math.pow(radius, 3);
    }

    
    Bola(int radius){
        this.radius = radius;
        // LuasPermukaan();
        // Volume();
    }
    Bola(){

    }
}

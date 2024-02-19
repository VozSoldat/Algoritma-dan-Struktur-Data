package Pertemuan2;

public class Naga {
    int x, y, width, height;

    void moveLeft(){
        x--;
    }
    void moveRight(){
        x++;
    }
    void moveUp(){
        y++;
    }
    void moveDown(){
        y--;
    }
    void printPosition(){
        System.out.println(x+","+y);
    }
    void detectCollision(int x, int y){
        if (x > height || x<0 || y>width || y<0) {
            System.out.println("Game Over!!!!!!");
        }
    }
}

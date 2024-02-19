package Pertemuan2;

public class NagaMain {

    public static void main(String[] args) {
        Naga game = new Naga();
        game.width = 10;
        game.height = 10;
        game.x = 5;
        game.y = 5;

        for (int i = 0; i < 20; i++) {
            game.printPosition();
            game.detectCollision(game.x, game.y);
            game.moveDown();
        }

    }
}

package game.points;

public class Main {

    public static void main(String[] args) {

        Display display = new Display("GamePoints");
        Gameplay gameplay = new Gameplay();
        GameEngine engine = new GameEngine(display, gameplay);

        engine.start();


    }
}
package game.points;
import java.awt.*;

public class Gameplay {

    public void tick() {
    }

    public void render(Graphics g) {
        //linie poziome
       /* g.drawLine((int) (Display.getWidth() * 0.333)-165, 100, 350, 100);
        g.drawLine(100 , 150, 350, 150);
        g.drawLine(100 , 200, 350, 200);
        g.drawLine(100 , 250, 350, 250);
        g.drawLine(100 , 300, 350, 300);
        g.drawLine(100 , 350, 350, 350);

        // linie pionowe
        g.drawLine(100 , 100, 100, 350);
        g.drawLine(150 , 100, 150, 350);
        g.drawLine(200 , 100, 200, 350);
        g.drawLine(250 , 100, 250, 350);
        g.drawLine(300 , 100, 300, 350);
        g.drawLine(350 , 100, 350, 350);*/

        int boardSize = 5;
        int rectSize = 50;
        int pointSize = 9;
        int startingPoint = (int) (Display.getWidth() * 0.333);

        for (int x = 0; x < boardSize; x++) {
            for (int y = 0; y < boardSize; y++) {
                g.drawRect(((x*rectSize) + startingPoint), ((y * rectSize) + startingPoint), rectSize, rectSize);
            }
        }
        // to organize players turns in a method (to pass: player color, player move - console/frame in a display?)
        g.setColor(Color.blue);
        g.fillRect(startingPoint-2, startingPoint-2, pointSize, pointSize); // -2 to place a point at the crosscut

        // method to pick a place: A - F, 1 - 6, switch/loop

    }

    public void play(){

    }
}



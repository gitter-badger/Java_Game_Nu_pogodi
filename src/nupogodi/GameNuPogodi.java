package nupogodi;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameNuPogodi extends JFrame{

    private Egg egg;
    private Back bkgnd;
    private Wolf wolf;
    private Field field;
    private EggsArray eggsArray;
    private Image imgBackground;

    private static GameNuPogodi m = new GameNuPogodi();

    public static void main(String[] args) { m.initial(); }
    private void initial()
    {
        try { imgBackground = ImageIO.read(GameNuPogodi.class.getResourceAsStream("Original_game_HD.png"));
        } catch (IOException e) {System.out.println("Didn't find background");}

        field = new Field();
        egg = new Egg();
        wolf = new Wolf();
        bkgnd = new Back();
        eggsArray = new EggsArray();

        bkgnd.img = imgBackground;
        field.setBackgroundImage(bkgnd);

        m.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        m.setSize(640, 390);
        m.setLocation(50, 50);
        m.setResizable(false);
        m.add(field);
        m.setVisible(true);

        System.out.println("Initialize here");
        //System.out.println(egg.weight);

        gameCycle();
    }

    private void gameCycle()
    {
        while(true)
        {
            //TODO main cycle here. i expect, that all calculations should be here

            field.updateEggsList(eggsArray);
            field.repaint();        // renew the game screen
        }
    }

}

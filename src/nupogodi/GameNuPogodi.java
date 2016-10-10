package nupogodi;

import javax.swing.*;

public class GameNuPogodi extends JFrame{

    private Egg egg;
    private Back background;
    private Wolf wolf;
    private Field field;
    private EggsArray eggsArray;

    private static GameNuPogodi m = new GameNuPogodi();

    public static void main(String[] args) { m.initial(); }
    private void initial()
    {
        egg = new Egg();
        wolf = new Wolf();
        field = new Field();
        background = new Back();
        eggsArray = new EggsArray();

        System.out.println(egg.size);
        //System.out.println(egg.weight);

        gameCycle();
    }

    private void gameCycle()
    {
        while(true)
        {
            //main cycle here. i expect, that all calculations should be here

            field.repaint();        // renew the game screen
        }
    }
}

package nupogodi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Field extends JPanel {

    private Wolf wolf;
    private Back back;
    private ArrayList<Egg> eggsList;

    //TODO create setters that will fill private instances and draw them


    @Override
    public void paintComponent(Graphics g) {
        super.paint(g);
        extraGraphics(g);

    }
    private void extraGraphics(Graphics g)
    {
        // TODO i think that we can draw everything here


    }
}

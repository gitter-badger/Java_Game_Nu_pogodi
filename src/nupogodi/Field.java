package nupogodi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Field extends JPanel {

    private Wolf wolf;
    private Back back;
    private ArrayList<Egg> eggsList;

    //TODO create setters that will fill private instances and draw them
    void setBackgroundImage (Back b) { back = b; }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        extraGraphics(g);

    }
    private void extraGraphics(Graphics g)
    {
        // i think that we can draw everything here
        back.drawSelf(g);

    }
}

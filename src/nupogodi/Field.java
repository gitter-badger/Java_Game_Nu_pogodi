package nupogodi;

import javax.swing.*;
import java.awt.*;

public class Field extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paint(g);
        extraGraphics(g);
    }
    private void extraGraphics(Graphics g)
    {
        // i expect that we can draw background here

    }
}

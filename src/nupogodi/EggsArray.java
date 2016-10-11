package nupogodi;

import java.awt.*;
import java.util.ArrayList;

class EggsArray {
    ArrayList<Egg> eList = new ArrayList<>();

    void addEgg(Egg e){ eList.add(e); }

    void removeEgg(int index) { eList.remove(index); }

    void drawSelf(Graphics g)
    {
        for (Egg e : eList) {
            e.drawSelf(g);
        }
    }
}

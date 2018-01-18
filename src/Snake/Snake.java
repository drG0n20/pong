package Snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {

    List<Point> snakePoints;
    int xDir, yDir;

    public Snake() {
        snakePoints = new ArrayList<Point>();
        xDir = 0;
        yDir = 0;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        for (Point p : snakePoints) {
            g.fillRect(p.getX(), p.getY(), 4, 4);
        }
    }
}

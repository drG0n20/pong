package Snake;

import java.awt.*;

public class Apple {

    private int x, y, score;
    private Snake snake;

    public Apple(Snake s) {
        x = (int) (Math.random() * 390);
        y = (int) (Math.random() * 390);
        snake = s;
    }

    public void changePosition() {
        x = (int) (Math.random() * 390);
        y = (int) (Math.random() * 390);
    }

    public int getScore() {
        return score;
    }

    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, 10, 10);
    }

    public boolean snakeCollision() {
        int snakeX = snake.getX() + 5;
        int snakeY = snake.getY() + 5;
        if (snakeX >= x - 1 && snakeX <= (x + 10))
            if (snakeY >= y - 1 && snakeY <= (y + 10)) {
                changePosition();
                score++;
                snake.setElongate(true);
                return true;
            }
        return false;
    }
}

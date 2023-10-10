import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {

    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed;
    public Ball(int x, int y, int width, int height) {
        //creating a ball
        super(x, y, width, height);

        initialSpeed = 2;
        random = new Random();

        //random roll for x and y
        //int rollDirection;

        //setting the x direction for where the ball will go
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0) {
            randomXDirection--;
        }
        setXDirection(randomXDirection * initialSpeed);

        //setting the y direction for where the ball will go
        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0) {
            randomYDirection--;
        }
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int randomXDirection) {
        //
        xVelocity = randomXDirection;
    }

    public void setYDirection(int randomYDirection) {
        //
        yVelocity = randomYDirection;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, height, width);
    }


}

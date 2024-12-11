import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

    // Instance variables
    private int x, y;
    private int width, height;
    private int velocity;

    // Constructor
    public Paddle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocity = 0;
    }

    // Getter and Setter methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getVelocity() {
        return velocity;
    }

    // Method to add velocity to the paddle's movement
    public void addVelocity(int vel) {
        velocity = vel;
    }
	
public void setVelocity(int velocity) {
    this.velocity = velocity;
}


    // Method to move the paddle
    public void move() {
        x += velocity;

        // Prevent the paddle from moving out of bounds
        if (x < 0) {
            x = 0;
        }
        if (x > 692 - width) {
            x = 692 - width;
        }
    }

    // Pre-condition: Graphics g is not null
    // Post-condition: Draws the paddle on the screen
    public void draw(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, width, height);
    }
}

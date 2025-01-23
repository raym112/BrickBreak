//  Ray 
//  Date created:  1/22/2025
//  General description: This class represents the ball in the Brick Break game, responsible for its movement, collision detection, and drawing.

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

    // Instance variables
    private int xpos, ypos;
    private int xVelocity, yVelocity;
    private int size;

    // Constructor
    public Ball(int x, int y, int size) {
        this.xpos = x;
        this.ypos = y;
        this.size = size;
        this.xVelocity = 1;
        this.yVelocity = -2;
    }

    // Getter and Setter methods
    public int getXpos() {
        return xpos;
    }

    public void setX(int x) {
        this.xpos = x;
    }

    public int getYpos() {
        return ypos;
    }

    public void setY(int y) {
        this.ypos = y;
    }

    public int getSize() {
        return size;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    // Method to reverse the direction of the ball on the X axis
    public void reverseX() {
        xVelocity = -xVelocity;
    }

    // Method to reverse the direction of the ball on the Y axis
    public void reverseY() {
        yVelocity = -yVelocity;
    }

    // Method to move the ball
    public void move() {
        xpos += xVelocity;
        ypos += yVelocity;
    }

    // Pre-condition: Graphics g is not null
    // Post-condition: Draws the ball on the screen
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(xpos, ypos, size, size);
    }
}

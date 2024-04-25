package org.example;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Entity extends Coordinates {
    int x, y;


    protected int width;
    protected int height;
    protected BufferedImage image;
    protected boolean leftPunching;
    protected boolean rightPunching;
    protected boolean leftKicking;
    protected boolean rightKicking;
    protected boolean blocking;

    public Entity(int x, int y, String url) {
        super(x, y);
        this.leftPunching = false;
        this.rightPunching = false;
        this.leftKicking = false;
        this.rightKicking = false;
        this.blocking = false;
        this.x = x;
        this.y = y;
    }
    public void update(){

    }
    public void draw(Graphics g){
        if(image != null){
            g.drawImage(image, x, y, null);
        }

    }

    public void move(int steps, Direction direction) {
        if (direction == Direction.LEFT) {
            this.x -= steps;
        } else if (direction == Direction.RIGHT) {
            this.x += steps;
        }
    }


    public boolean isLeftPunching() {
        return leftPunching;
    }

    public void setLeftPunching(boolean leftPunching) {
        this.leftPunching = leftPunching;
    }

    public boolean isRightPunching() {
        return rightPunching;
    }

    public void setRightPunching(boolean rightPunching) {
        this.rightPunching = rightPunching;
    }

    public boolean isLeftKicking() {
        return leftKicking;
    }

    public void setLeftKicking(boolean leftKicking) {
        this.leftKicking = leftKicking;
    }

    public boolean isRightKicking() {
        return rightKicking;
    }

    public void setRightKicking(boolean rightKicking) {
        this.rightKicking = rightKicking;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
package org.example;
import java.awt.*;
public class Enemy extends Entity {
    private int damage;

    public Enemy(int x, int y , String url, int damage) {
        super(x, y, url);
        this.damage = damage;
    }

    public Rectangle getBoundingBox() {
        return getBoundingBox();
    }

    public Image getImage() {
        return getImage();
    }
}

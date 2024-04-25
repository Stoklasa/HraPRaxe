package org.example;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Player extends Entity {


    private boolean leftFistPunching;
    private boolean rightFistPunching;
    private boolean leftLegKicking;
    private boolean rightLegKicking;
    private boolean blocking;
    private BufferedImage playerImage;

    public Player(String image) throws IOException {
        super(10, 10, image);
        playerImage = ImageIO.read(new File("src/main/resources/" + image));
        leftFistPunching = false;
        rightFistPunching = false;
        leftLegKicking = false;
        rightLegKicking = false;
        blocking = false;
    }

    public void performAction(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_A:
                leftFistPunching = true;
                break;
            case KeyEvent.VK_S:
                rightFistPunching = true;
                break;
            case KeyEvent.VK_D:
                leftLegKicking = true;
                break;
            case KeyEvent.VK_F:
                rightLegKicking = true;
                break;
            case KeyEvent.VK_SPACE:
                blocking = true;
                break;
        }
    }

    public void stopAction(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_A:
                leftFistPunching = false;
                break;
            case KeyEvent.VK_S:
                rightFistPunching = false;
                break;
            case KeyEvent.VK_D:
                leftLegKicking = false;
                break;
            case KeyEvent.VK_F:
                rightLegKicking = false;
                break;
            case KeyEvent.VK_SPACE:
                blocking = false;
                break;
        }
    }

    // Getters for actions
    public boolean isLeftFistPunching() {
        return leftFistPunching;
    }

    public boolean isRightFistPunching() {
        return rightFistPunching;
    }

    public boolean isLeftLegKicking() {
        return leftLegKicking;
    }

    public boolean isRightLegKicking() {
        return rightLegKicking;
    }

    public boolean isBlocking() {
        return blocking;
    }
    public void update(){

    }

    // Reset actions
    public void resetActions() {
        leftFistPunching = false;
        rightFistPunching = false;
        leftLegKicking = false;
        rightLegKicking = false;
        blocking = false;
    }

    public Image getImage() {
        return playerImage;
    }
    }

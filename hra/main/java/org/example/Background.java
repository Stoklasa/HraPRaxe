package org.example;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Background extends JPanel {
    private BufferedImage backgroundImage;

    public Background(String imagePath) throws IOException {
        backgroundImage = ImageIO.read(new File("src/main/resources/" + imagePath));
    }

    public void render() {
        repaint();
    }

    public void setBackgroundImage(BufferedImage backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public BufferedImage getBackgroundImage() {
        return backgroundImage;
    }
}
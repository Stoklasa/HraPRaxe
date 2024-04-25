package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGraphics extends JFrame {


    private Timer mainTimer;
    private Player player;

    
    public GameGraphics(int playerWidth, int playerHeight, GameLogic logic) throws HeadlessException {
        this.draw = new Draw();
        this.logic = logic;
        Dimension d = new Dimension(1080, 720);

        setTitle("Game");
        setSize(d);
        setMinimumSize(d);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(draw);
        draw.repaint();
        mainTimer = new Timer(1000, new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                logic.update();
                draw.repaint();
            }
        });
        mainTimer.start();
    }

    public class Draw extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(logic.background.getBackgroundImage(), 0, 0, 1065, 715, this);
            int playerWidth;
            playerWidth = 100;
            int playerHeight = 500;
            g.drawImage(logic.getPlayer().getImage(), 70, 610, this );

        }
    }

    Draw draw;
    GameLogic logic;

    public void render(GameLogic logic) {
        this.logic = logic;
        repaint();
    }
}

package org.example;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class Game {
    private GameLogic logic;
    private GameGraphics graphics;
    private Player player;
    private static float MULTIPLIER = 2.5f;
    private int frames = 0;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Game();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    public Game() throws IOException {
        logic = new GameLogic();
        int playerWidth = 0;
        int playerHeight =0;
        graphics = new GameGraphics(playerWidth, playerHeight, logic);
        Background background = new Background("pozadi.png");

        background.render();

        background.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        controlledMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        controlledMove(Direction.RIGHT);
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        Timer timer = new Timer(16, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                logic.update();
                graphics.render(logic);
                background.render();

                frames++;
                if (frames >= 10){
                    System.out.println(frames);
                    frames = 0;
                }
            }
        });

        timer.start();
        background.requestFocus();
    }

    private void controlledMove(Direction direction) {
        logic.movePlayer(direction);
    }

    }



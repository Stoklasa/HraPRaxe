package org.example;
import java.io.IOException;
public class GameLogic {
    private Player player;
    private Enemy enemy;
    private final int ENEMY_STEPS = 5;
    Background background;

    public GameLogic() throws IOException {
        this.enemy = null;
        this.background = new Background("pozadi.png");
        initialize();
    }

    public void initialize() throws IOException {
        player = new Player("panakcek.png");
        enemy = new Enemy(50, 300,"", 100);

    }

    private void playerDied() {
        System.out.println("Player died!");
    }

    private void moveEnemyTowardsPlayer() {
        int playerX = player.getX();
        int enemyX = enemy.getX();

        if (playerX < enemyX) {
            enemy.move(-ENEMY_STEPS, Direction.LEFT);
        } else if (playerX > enemyX) {
            enemy.move(ENEMY_STEPS, Direction.RIGHT);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void update() {
        moveEnemyTowardsPlayer();

        int playerX = player.getX();
        int playerY = player.getY();
        int enemyX = enemy.getX();
        int enemyY = enemy.getY();

        int distanceX = Math.abs(playerX - enemyX);
        int distanceY = Math.abs(playerY - enemyY);


        }


    public void movePlayer(Direction direction) {
        int steps = 5;
        switch (direction) {
            case LEFT:
                player.move(-steps, Direction.LEFT);
                break;
            case RIGHT:
                player.move(steps, Direction.RIGHT);
                break;
        }
    }


}

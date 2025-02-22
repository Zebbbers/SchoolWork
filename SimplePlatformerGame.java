import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimplePlatformerGame extends JFrame implements KeyListener, ActionListener {
    private int playerX = 50;
    private int playerY = 220;
    private double playerVelocityY = 0;
    private double playerVelocityX = 0;
    private double playerAcceleration = 0.2;
    private int playerSpeed = 2;
    private boolean isJumping = false;
    private boolean isInGap = false; // Flag to indicate if the player is in the gap

    private int circleX = 350;
    private int circleY = 200;
    private int circleRadius = 15;
    private boolean circleVisible = true;
    private int score = 0;

    private int enemyX = 750;
    private int enemyY = 220;
    private int enemySpeed = 1;
    private boolean gameEnded = false;

    private int floor1Y = 250; // Y position of the original floor
    private int floor2Y = 400; // Y position of the second floor
    private int gapStartX = 400; // X position where the gap in the first floor starts
    private int gapWidth = 50; // Width of the gap

    public SimplePlatformerGame() {
        setTitle("Simple Platformer Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);

        Timer timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        // Draw the original floor with a gap
        g.setColor(new Color(139, 69, 19));
        g.fillRect(0, floor1Y, gapStartX, 50); // Left side of the floor
        g.fillRect(gapStartX + gapWidth, floor1Y, getWidth() - (gapStartX + gapWidth), 50); // Right side of the floor

        // Draw the second floor
        g.setColor(new Color(139, 69, 19));
        g.fillRect(0, floor2Y, getWidth(), 50);

        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, 30, 30);

        if (circleVisible) {
            g.setColor(Color.YELLOW);
            g.fillOval(circleX - circleRadius, circleY - circleRadius, 2 * circleRadius, 2 * circleRadius);
        }

        g.setColor(Color.GREEN);
        g.fillRect(enemyX, enemyY, 30, 30);

        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);

        if (gameEnded) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over", 350, 300);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameEnded) {
            if (isJumping) {
                playerVelocityY += 0.2;
                playerY += playerVelocityY;

                if (playerY >= 220) {
                    playerY = 220;
                    playerVelocityY = 0;
                    isJumping = false;
                }
            }

            if (isInGap) {
                playerVelocityY += 0.2;
                playerY += playerVelocityY;

                if (playerY >= floor2Y - 30) {
                    playerY = floor2Y - 30;
                    playerVelocityY = 0;
                    isInGap = false;
                }
            }

            playerX += playerVelocityX;

            if (circleVisible && playerX + 30 >= circleX - circleRadius
                    && playerX <= circleX + circleRadius
                    && playerY + 30 >= circleY - circleRadius
                    && playerY <= circleY + circleRadius) {
                circleVisible = false;
                score += 100;
            }

            if (enemyX > playerX) {
                enemyX -= enemySpeed;
            } else {
                enemyX += enemySpeed;
            }

            if (playerX + 30 >= enemyX && playerX <= enemyX + 30
                    && playerY + 30 >= enemyY && playerY <= enemyY + 30) {
                gameEnded = true;
            }

            // Check if the player is in the gap
            if (playerY + 30 >= floor1Y && playerX + 30 >= gapStartX && playerX <= gapStartX + gapWidth) {
                isInGap = true;
            }
        }

        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_SPACE && !isJumping) {
            isJumping = true;
            playerVelocityY = -6;
        }
        if (key == KeyEvent.VK_A) {
            playerVelocityX -= playerAcceleration * 2;
        }
        if (key == KeyEvent.VK_D) {
            playerVelocityX += playerAcceleration * 2;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();   
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_D) {
            playerVelocityX = 0;
        }
    }

    public static void main(String[] args) {
        SimplePlatformerGame game = new SimplePlatformerGame();
        game.setVisible(true);
    }
}



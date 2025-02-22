import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DVDBounce3DUserControl {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DVD 3D Bounce (User Control)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        DVDBouncingBox3DUserControl dvd = new DVDBouncingBox3DUserControl(frame);
        frame.add(dvd);
        dvd.startAnimation();
        dvd.requestFocus(); // Make the panel focusable for keyboard input
    }
}

class DVDBouncingBox3DUserControl extends JPanel implements ActionListener {
    private int boxWidth = 100;
    private int boxHeight = 120;
    private int x = 0;
    private int y = 0;
    private int xVelocity = 0;
    private int yVelocity = 0;
    private final JFrame frame;

    public DVDBouncingBox3DUserControl(JFrame frame) {
        this.frame = frame;
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                handleKeyPress(e);
            }
        });
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void startAnimation() {
        Timer timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Create a gradient color for the box
        Color boxColor = new Color(0, 0, 255);

        // Set the box color
        g2d.setColor(boxColor);

        // Draw a 3D-like box with changing size
        g2d.fillRect(x, y, boxWidth, boxHeight);

        // Add a border
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, boxWidth, boxHeight);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move the box based on velocity
        x += xVelocity;
        y += yVelocity;

        // Check for collisions with the frame boundaries
        if (x <= 0 || x + boxWidth >= frame.getWidth()) {
            xVelocity = -xVelocity;
        }
        if (y <= 0 || y + boxHeight >= frame.getHeight()) {
            yVelocity = -yVelocity;
        }

        repaint();
    }

    private void handleKeyPress(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_W:
                yVelocity = -5;
                xVelocity = 0;
                break;
            case KeyEvent.VK_A:
                xVelocity = -5;
                yVelocity = 0;
                break;
            case KeyEvent.VK_S:
                yVelocity = 5;
                xVelocity = 0;
                break;
            case KeyEvent.VK_D:
                xVelocity = 5;
                yVelocity = 0;
                break;
        }
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DVDBounce3DSizeChange {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DVD 3D Bounce");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        DVDBouncingBox3DSizeChange dvd = new DVDBouncingBox3DSizeChange(frame);
        frame.add(dvd);
        dvd.startAnimation();
    }
}

class DVDBouncingBox3DSizeChange extends JPanel implements ActionListener {
    private int boxWidth = 100;
    private int boxHeight = 50;
    private int x = 0;
    private int y = 0;
    private int xVelocity = 5;
    private int yVelocity = 5;
    private final JFrame frame;

    public DVDBouncingBox3DSizeChange(JFrame frame) {
        this.frame = frame;
    }

    public void startAnimation() {
        Timer timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Calculate shading for a 3D effect
        int shading = Math.min(255, Math.max(0, x + y - 200));

        // Create a gradient color for the box
        Color boxColor = new Color(0, 0, 255 - shading);

        // Set the box color
        g2d.setColor(boxColor);

        // Draw a 3D-like box with changing size
        g2d.fillRect(x, y, boxWidth, boxHeight);

        // Add a border
        g2d.setColor(Color.BLACK);
        g2d.drawRect(x, y, boxWidth, boxHeight);

        // Change the size of the box based on position for a 3D effect
        boxWidth = 100 + x / 5;
        boxHeight = 50 + y / 5;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
}

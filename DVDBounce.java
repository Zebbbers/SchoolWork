import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DVDBounce {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DVD Bounce");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);

        DVDBouncingLogo dvd = new DVDBouncingLogo(frame);
        frame.add(dvd);
        dvd.startAnimation();
    }
}

class DVDBouncingLogo extends JPanel implements ActionListener {
    private static final int LOGO_WIDTH = 120;
    private static final int LOGO_HEIGHT = 60;
    private int x = 0;
    private int y = 0;
    private int xVelocity = 5;
    private int yVelocity = 5;
    private final JFrame frame;
    private final ImageIcon dvdLogo = new ImageIcon("dvd_logo.png.png"); // Replace with your logo file path

    public DVDBouncingLogo(JFrame frame) {
        this.frame = frame;
    }

    public void startAnimation() {
        Timer timer = new Timer(20, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        dvdLogo.paintIcon(this, g, x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += xVelocity;
        y += yVelocity;

        // Check for collisions with the frame boundaries
        if (x <= 0 || x + LOGO_WIDTH >= frame.getWidth()) {
            xVelocity = -xVelocity;
        }
        if (y <= 0 || y + LOGO_HEIGHT >= frame.getHeight()) {
            yVelocity = -yVelocity;
        }

        repaint();
    }
}

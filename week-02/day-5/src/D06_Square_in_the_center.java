import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class D06_Square_in_the_center {
    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 600;

    public static void drawImage(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center

        graphics.setColor(Color.green);
        graphics.drawRect((WIDTH/2) -5, HEIGHT/2 -5,10,10);

    }



    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}

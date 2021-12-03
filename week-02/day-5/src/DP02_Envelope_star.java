import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DP02_Envelope_star {
    public static void drawImage(Graphics graphics){

        int HF = (HEIGHT/ 100);
        int WF = (WIDTH/ 100);

        for(int i=WIDTH/2; i > HF; i-=HF * 5) {

            graphics.setColor(Color.green);

            graphics.drawLine(i, (HEIGHT/2), WIDTH/2, (HEIGHT/2) + i);
            graphics.drawLine(i, (HEIGHT/2), WIDTH/2, (HEIGHT/2) - i);

            graphics.drawLine(WIDTH - i, HEIGHT/2,WIDTH/2,HEIGHT/2 + i);
            graphics.drawLine(WIDTH - i, HEIGHT/2,WIDTH/2,HEIGHT/2 - i);

        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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

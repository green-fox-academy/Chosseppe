import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class D07_Fill_with_rectangles {
    public static void drawImage(Graphics graphics){
        // Draw four different size and color rectangles
        // Avoid code duplication!

        for(int i = 0; i < 4;){
            Random randomNumber = new Random();

            int r = randomNumber.nextInt(256);
            int g = randomNumber.nextInt(256);
            int b = randomNumber.nextInt(256);
            int x = randomNumber.nextInt(WIDTH);
            int y = randomNumber.nextInt(HEIGHT);
            int w = randomNumber.nextInt(WIDTH / 2);
            int h = randomNumber.nextInt(HEIGHT / 2);

            if(x+w <= WIDTH){
                if(y+h <= HEIGHT){
                    graphics.setColor(new Color(r,g,b));
                    graphics.drawRect(x, y, w, h);
                    i++;
                }
            }


        }



    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 600;

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

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DP01_Line_play {
    public static void drawImage(Graphics graphics){

        int HF = (HEIGHT / 100);
        int WF = (WIDTH / 100);




        for(int i=HEIGHT; i > HF; i-=HF * 6) {

            graphics.setColor(new Color(117, 40, 160));
            graphics.drawLine(i, 0, WIDTH, i);


            graphics.setColor(Color.green);

            graphics.drawLine(i, HEIGHT, 0, i);


        }




    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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

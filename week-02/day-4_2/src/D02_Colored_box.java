import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class D02_Colored_box {
    public static void drawImage(Graphics graphics) {
        // Draw a box that has different colored lines on each edge

        //set color for drawing pattern
        graphics.setColor(Color.red);
        //draw a line with specific mapping system
        graphics.drawLine(200, 100, 600, 100);
        //set color for drawing pattern
        graphics.setColor(Color.yellow);
        //draw a line with specific mapping system
        graphics.drawLine(600, 100, 600, 500);
        //set color for drawing pattern
        graphics.setColor(Color.green);
        //draw a line with specific mapping system
        graphics.drawLine(600, 500, 200, 500);
        //set color for drawing pattern
        graphics.setColor(Color.blue);
        //draw a line with specific mapping system
        graphics.drawLine(200, 500, 200, 100);




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

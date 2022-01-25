import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Random;

public class D05_Diagonals {
    public static void drawImage(Graphics graphics) {
        // Create a function that draws a single line
        // Use this function to draw the canvas' diagonals
        // If the line starts from the upper-left corner it should be green, otherwise it should be red
        // Make decision about the color in the function

        for(int i = 0; i < 2; i++){
            int[] D = {0,0};
            int[] C = {800,0};
            int[] B = {800,600};
            int[] A = {0,600};
            if(i==0){
                graphics.setColor(Color.green);
                graphics.drawLine(D[0],D[1],B[0],B[1]);
            }else{
                Random randomNumber = new Random();

                int r = randomNumber.nextInt(256);
                int g = randomNumber.nextInt(256);
                int b = randomNumber.nextInt(256);

                graphics.setColor(new Color(r, g, b));
                graphics.drawLine(C[0], C[1], A[0], A[1]);
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

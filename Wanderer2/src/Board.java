import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    String position = "down";

    int boxX;
    int boxY;

    Level level = new Level();

    public Board() {
        boxX = 0;
        boxY = 0;

        // set the size of your draw board
        setPreferredSize(new Dimension(1080, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(720, 0, 920, 720);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.
        for(int x = 0; x < 10; x ++) {
            for (int y = 0; y < 10; y ++) {
                if(level.gets(level.get(y), x).equals(1)){
                    PositionedImage wallImage = new
                            PositionedImage("wanderer-java/img/wall.png", x * 72, y * 72);
                    wallImage.draw(graphics);
                }else {
                    PositionedImage groundImage = new
                            PositionedImage("wanderer-java/img/floor.png", x * 72, y * 72);
                    groundImage.draw(graphics);
                }
            }
        }
        for(int x = 0; x < 10; x ++) {
            for (int y = 0; y < 10; y ++) {
                if (level.gets(level.get(y), x).equals('S')) {
                    PositionedImage skeletonImage = new
                            PositionedImage("wanderer-java/img/skeleton.png", x * 72, y * 72);
                    skeletonImage.draw(graphics);
                } else if (level.gets(level.get(y), x).equals('B')) {
                    PositionedImage bossImage = new
                            PositionedImage("wanderer-java/img/boss.png", x * 72, y * 72);
                    bossImage.draw(graphics);
                }
                PositionedImage image = new
                        PositionedImage("wanderer-java/img/hero-" + position + ".png", boxX * 72, boxY * 72);
                image.draw(graphics);

            }
        }
    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override
    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (boxY == 0) {
                position = "up";
            } else {
                if(!level.gets(level.get(boxY - 1), boxX).equals(1) && boxY - 1 >= 0) {
                    boxY--;
                    position = "up";
                }else{
                    position = "up";
                }
            }
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (boxY == 9) {
                position = "down";
            } else {
                if(!level.gets(level.get(boxY + 1), boxX).equals(1) && boxY + 1 <= 9) {
                    boxY++;
                    position = "down";
                }else {
                    position = "down";
                }
            }
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (boxX == 9) {
                position = "right";
            } else {
                if(!level.gets(level.get(boxY), boxX + 1).equals(1) && boxX + 1 <= 9) {
                    boxX++;
                    position = "right";
                }else {
                    position = "right";
                }
            }
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (boxX == 0) {
                position = "left";
            } else {
                if(!level.gets(level.get(boxY), boxX - 1).equals(1) && boxX - 1 >= 0) {
                    boxX--;
                    position = "left";
                }else {
                    position = "left";
                }
            }
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Blob");
        }
        // and redraw to have a new picture with the new coordinates
        repaint();

    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import characters.Character;
import characters.Hero;
import characters.Monster;
import characters.Boss;
import map.Level;


public class Board extends JComponent implements KeyListener {

    int mapLevel = 1;
    List<Character> characters = new ArrayList<>();
    Level level = new Level();
    int countMonsters = 0;
    int levelCounter = 0;
    Hero hero = new Hero();
    Monster monster1 = new Monster(mapLevel);
    Monster monster2 = new Monster(mapLevel);
    Monster monster3 = new Monster(mapLevel);
    Boss boss = new Boss(mapLevel);
    String point = hero.getGoDown();



    public Board() {


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 770));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {

        super.paint(graphics);
        graphics.setColor(Color.white);
        graphics.fillRect(0, 720, 720, 820);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        // this part of code is rendering map.
        // logic == if 2Dmatrix object is 1, draw wall
        // if 2Dmatrix Object is not 1, draww floor
        for(int x = 0; x < 10; x ++) {
            for (int y = 0; y < 10; y++) {
                if (level.gets(level.get(y), x).equals(1)) {
                    PositionedImage wallImage = new
                            PositionedImage("wanderer-java/img/wall.png", x * 72, y * 72);
                    wallImage.draw(graphics);
                } else {
                    PositionedImage groundImage = new
                            PositionedImage("wanderer-java/img/floor.png", x * 72, y * 72);
                    groundImage.draw(graphics);
                }
            }
        }
        //this code establish all character spawn points
        for(int x2 = 0; x2 < 10; x2 ++) {
            for (int y2 = 0; y2 < 10; y2++) {
        // Hero
                if (level.gets(level.get(y2), x2).equals('X')) {
                    hero.setBoxX(x2);
                    hero.setBoxY(y2);
                    characters.add(hero);
        // Monsters
                } else if (level.gets(level.get(y2), x2).equals('S')) {
                    countMonsters++;
                    if (countMonsters == 1) {
                        monster1.setBoxX(x2);
                        monster1.setBoxY(y2);
                        characters.add(monster1);

                    } else if (countMonsters == 2) {
                        monster2.setBoxX(x2);
                        monster2.setBoxY(y2);
                        characters.add(monster2);

                    } else if (countMonsters == 3) {
                        monster3.setBoxX(x2);
                        monster3.setBoxY(y2);
                        characters.add(monster3);

                    }
        //Boss
                } else if (level.gets(level.get(y2), x2).equals('B')) {
                    boss.setBoxX(x2);
                    boss.setBoxY(y2);
                    characters.add(boss);
                }
            }
        }
        //Setting up output for hero position on map
        hero.setOutputX(hero.getBoxX() + hero.getTheX());
        hero.setOutputY(hero.getBoxY() + hero.getTheY());
        //Setting up output for monster1 position on map
        monster1.setOutputX(monster1.getBoxX() + monster1.getTheX());
        monster1.setOutputY(monster1.getBoxY() + monster1.getTheY());
        //Setting up output for monster2 position on map
        monster2.setOutputX(monster2.getBoxX() + monster2.getTheX());
        monster2.setOutputY(monster2.getBoxY() + monster2.getTheY());
        //Setting up output for monster3 position on map
        monster3.setOutputX(monster3.getBoxX() + monster3.getTheX());
        monster3.setOutputY(monster3.getBoxY() + monster3.getTheY());
        //Setting up output for boss position on map
        boss.setOutputX(boss.getBoxX() + boss.getTheX());
        boss.setOutputY(boss.getBoxY() + boss.getTheY());

        //Draw hero position on map with correct direction
        PositionedImage heroImg = new
                PositionedImage(hero.getImage() + point, hero.getOutputX() * 72, hero.getOutputY() * 72);
        heroImg.draw(graphics);
        //Draw monster1 position on map with correct direction
        PositionedImage monster1Img = new
                PositionedImage(monster1.getGoDown(), monster1.getOutputX() * 72, monster1.getOutputY() * 72);
        monster1Img.draw(graphics);
        //Draw monster2 position on map with correct direction
        PositionedImage monster2Img = new
                PositionedImage(monster2.getGoDown(), monster2.getOutputX() * 72, monster2.getOutputY() * 72);
        monster2Img.draw(graphics);
        //Draw monster3 position on map with correct direction
        PositionedImage monster3Img = new
                PositionedImage(monster3.getGoDown(), monster3.getOutputX() * 72, monster3.getOutputY() * 72);
        monster3Img.draw(graphics);
        //Draw boss position on map with correct direction
        PositionedImage bossImg = new
                PositionedImage(boss.getGoDown(), boss.getOutputX() * 72, boss.getOutputY() * 72);
        bossImg.draw(graphics);

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
            if (hero.getOutputY() != 0) {
                if (!level.gets(level.get(hero.getOutputY() - 1), hero.getOutputX()).equals(1) && hero.getOutputY() - 1 >= 0) {
                    hero.goUp();
                }
            }
            point = hero.getGoUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (hero.getOutputY() != 9) {
                if (!level.gets(level.get(hero.getOutputY() + 1), hero.getOutputX()).equals(1) && hero.getOutputY() + 1 <= 9) {
                    hero.goDown();
                }
            }
            point = hero.getGoDown();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (hero.getOutputX() != 9) {
                if (!level.gets(level.get(hero.getOutputY()), hero.getOutputX() + 1).equals(1) && hero.getOutputX() + 1 <= 9) {
                    hero.goRight();
                }
            }
            point = hero.getGoRight();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (hero.getOutputX() != 0) {
                if (!level.gets(level.get(hero.getOutputY()), hero.getOutputX() - 1).equals(1) && hero.getOutputX() - 1 >= 0) {
                    hero.goLeft();
                }
            }
            point = hero.getGoLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("Blob");

        }

        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
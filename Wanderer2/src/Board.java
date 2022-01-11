import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import characters.Character;
import characters.Hero;
import characters.Monster;
import characters.Boss;
import map.Level;


public class Board extends JComponent implements KeyListener {


    // initialization of variables
    Hero hero = new Hero();
    int killedBossCount = 0;
    Level level = new Level();

    List<Character> creatures = new ArrayList<>();
    String point = hero.getGoDown();
    int countMonsters = 0;
    Character fighted;
    Monster monster1 = new Monster(level.getMapLevel());
    Monster monster2 = new Monster(level.getMapLevel());
    Monster monster3 = new Monster(level.getMapLevel());
    Boss boss = new Boss(level.getMapLevel());
    List<Character> deadCreatures = new ArrayList<>();





    public Board() {


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 770));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {

        // Draw white rectangle with black text
        super.paint(graphics);
        graphics.setColor(Color.white);
        graphics.fillRect(0, 720, 720, 820);
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Sans Serif", Font.BOLD, 20));
        graphics.drawString(hero.getDisplayedName() + " (Level " + hero.getLevel() + ") HP: " + hero.getCurretnHP() +
                "/" + hero.getMaxHP() + " | DP: " + hero.getDefendPoints() + " | SP: "
                + hero.getStrikePoints(), 100, 740);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        // this part of code is rendering map.
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (level.gets(level.get(y), x).equals(1)) {
                    // logic: if 2Dmatrix object is 1, draw wall
                    PositionedImage wallImage = new
                            PositionedImage("wanderer-java/img/wall.png", x * 72, y * 72);
                    wallImage.draw(graphics);
                } else {
                    // if 2Dmatrix Object is not 1, draw floor
                    PositionedImage groundImage = new
                            PositionedImage("wanderer-java/img/floor.png", x * 72, y * 72);
                    groundImage.draw(graphics);
                }
            }
        }

        //Setting up output for hero position on map
        hero.setOutputX(hero.getBoxX() + hero.getPointX());
        hero.setOutputY(hero.getBoxY() + hero.getPointY());
        //Setting up output for monster position on map
        for (Character creature : creatures) {
            creature.setOutputX(creature.getBoxX() + creature.getPointX());
            creature.setOutputY(creature.getBoxY() + creature.getPointY());
        }


        //Draw hero position on map with correct direction
        if (hero.getCurretnHP() > 0) {
            PositionedImage heroImg = new
                    PositionedImage(hero.getImage() + point, hero.getOutputX() * 72, hero.getOutputY() * 72);
            heroImg.draw(graphics);
        } else {
            hero.setAlive(false);
            graphics.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 100));
            graphics.drawString("Game over", 80, 400);
        }
        repaint();
        //Draw monster1 position on map with correct direction
        if (monster1.getCurretnHP() > 0) {
            PositionedImage monster1Img = new
                    PositionedImage(monster1.getImage(), monster1.getOutputX() * 72, monster1.getOutputY() * 72);
            monster1Img.draw(graphics);
        } else {
            monster1.setAlive(false);
        }
        repaint();
        //Draw monster2 position on map with correct direction
        if (monster2.getCurretnHP() > 0) {
            PositionedImage monster2Img = new
                    PositionedImage(monster2.getImage(), monster2.getOutputX() * 72, monster2.getOutputY() * 72);
            monster2Img.draw(graphics);
        } else {
            monster2.setAlive(false);
        }
        repaint();
        //Draw monster3 position on map with correct direction
        if (monster3.getCurretnHP() > 0) {
            PositionedImage monster3Img = new
                    PositionedImage(monster3.getImage(), monster3.getOutputX() * 72, monster3.getOutputY() * 72);
            monster3Img.draw(graphics);
        } else {
            monster3.setAlive(false);
        }
        repaint();
        //Draw boss position on map with correct direction
        if (boss.getCurretnHP() > 0) {
            PositionedImage bossImg = new
                    PositionedImage(boss.getImage(), boss.getOutputX() * 72, boss.getOutputY() * 72);
            bossImg.draw(graphics);
        } else {
            boss.setAlive(false);
        }
        repaint();
        // check if is hero on the same location as creature from map
        // hero vs monster1
        if (Objects.equals(hero.getOutputX(), monster1.getOutputX()) &&
                Objects.equals(hero.getOutputY(), monster1.getOutputY())) {
            if (monster1.getAlive()) {
                graphics.drawString(monster1.getDisplayedName() + " (Level " + monster1.getLevel() + ") HP: " +
                        monster1.getCurretnHP() + "/" + monster1.getMaxHP() + " | DP: " + monster1.getDefendPoints() +
                        " | SP: " + monster1.getStrikePoints(), 100, 765);
                hero.setBattleMode(true);
                monster1.setBattleMode(true);
                fighted = monster1;
            } else {
                hero.setBattleMode(false);
                monster1.setBattleMode(false);

            }
            repaint();
            // hero vs monster2
        }else if (Objects.equals(hero.getOutputX(), monster2.getOutputX()) &&
                Objects.equals(hero.getOutputY(), monster2.getOutputY())) {
            if (monster2.getAlive()) {
                graphics.drawString(monster2.getDisplayedName() + " (Level " + monster2.getLevel() + ") HP: " +
                        monster2.getCurretnHP() + "/" + monster2.getMaxHP() + " | DP: " + monster2.getDefendPoints() +
                        " | SP: " + monster2.getStrikePoints(), 100, 765);
                hero.setBattleMode(true);
                monster2.setBattleMode(true);
                fighted = monster2;
            } else {
                hero.setBattleMode(false);
                monster2.setBattleMode(false);
            }
            repaint();
            // hero vs monster3
        }else if (Objects.equals(hero.getOutputX(), monster3.getOutputX()) &&
                Objects.equals(hero.getOutputY(), monster3.getOutputY())) {
            if (monster3.getAlive()) {
                graphics.drawString(monster3.getDisplayedName() + " (Level " + monster3.getLevel() + ") HP: " +
                        monster3.getCurretnHP() + "/" + monster3.getMaxHP() + " | DP: " + monster3.getDefendPoints() +
                        " | SP: " + monster3.getStrikePoints(), 100, 765);
                hero.setBattleMode(true);
                monster3.setBattleMode(true);
                fighted = monster3;
            } else {
                hero.setBattleMode(false);
                monster3.setBattleMode(false);
            }
            repaint();
            // hero vs boss
        }else if (Objects.equals(hero.getOutputX(), boss.getOutputX()) &&
                Objects.equals(hero.getOutputY(), boss.getOutputY())) {
            if (boss.getAlive()) {
                graphics.drawString(boss.getDisplayedName() + " (Level " + boss.getLevel() + ") HP: " +
                        boss.getCurretnHP() + "/" + boss.getMaxHP() + " | DP: " + boss.getDefendPoints() +
                        " | SP: " + boss.getStrikePoints(), 100, 765);
                hero.setBattleMode(true);
                boss.setBattleMode(true);
                fighted = boss;
            } else {
                hero.setBattleMode(false);
                boss.setBattleMode(false);
            }
            repaint();
        }else {
            hero.setBattleMode(false);
            repaint();
        }
        for(int i = 0; i < creatures.size(); i++){
            if(creatures.get(i) instanceof Monster && !creatures.get(i).getAlive() && Objects.equals(hero.getOutputX(), creatures.get(i).getOutputX()) &&
                    Objects.equals(hero.getOutputY(), creatures.get(i).getOutputY())){
                creatures.get(i).setPointX(-20);
                creatures.get(i).setPointY(-20);
                if(!deadCreatures.contains(creatures.get(i))){
                    deadCreatures.add(creatures.get(i));
                }
                hero.levelUp();
            }else if(creatures.get(i) instanceof Boss  && !creatures.get(i).getAlive() && killedBossCount < level.getMapLevel() ){
                creatures.get(i).setPointX(-30);
                creatures.get(i).setPointY(-30);
                killedBossCount++;
                if(!deadCreatures.contains(creatures.get(i))){
                    deadCreatures.add(creatures.get(i));
                }
                hero.levelUp();
            }
        }
        if(deadCreatures.size() == creatures.size()){
            level.setMapLevel();
            creatures = new ArrayList<>();
            point = hero.getGoDown();
            countMonsters = 0;
            monster1 = new Monster(level.getMapLevel());
            monster2 = new Monster(level.getMapLevel());
            monster3 = new Monster(level.getMapLevel());
            boss = new Boss(level.getMapLevel());
            deadCreatures = new ArrayList<>();

            //this code establish all character spawn points
            for (int x2 = 0; x2 < 10; x2++) {
                for (int y2 = 0; y2 < 10; y2++) {
                    // Hero
                    if (level.gets(level.get(y2), x2).equals('X')) {
                        hero.setBoxX(x2);
                        hero.setBoxY(y2);
                        // Monsters
                    } else if (level.gets(level.get(y2), x2).equals('S')) {
                        countMonsters++;
                        if (countMonsters == 1) {
                            monster1.setBoxX(x2);
                            monster1.setBoxY(y2);
                            if(!creatures.contains(monster1)) {
                                creatures.add(monster1);
                            }

                        } else if (countMonsters == 2) {
                            monster2.setBoxX(x2);
                            monster2.setBoxY(y2);
                            if(!creatures.contains(monster2)) {
                                creatures.add(monster2);
                            }

                        } else if (countMonsters == 3) {
                            monster3.setBoxX(x2);
                            monster3.setBoxY(y2);
                            if(!creatures.contains(monster3)) {
                                creatures.add(monster3);
                            }

                        }
                        //Boss
                    } else if (level.gets(level.get(y2), x2).equals('B')) {
                        boss.setBoxX(x2);
                        boss.setBoxY(y2);
                        if(!creatures.contains(boss)) {
                            creatures.add(boss);
                        }
                    }
                }
            }
            hero.setPointX(0);
            hero.setPointY(0);
            for(Character creature : creatures){
                creature.setPointX(0);
                creature.setPointY(0);
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

            // When the left or right keys hit, we change the position of our box
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

            // When the space key hit, we change the position of our box
            point = hero.getGoLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (hero.getBattleMode() && fighted.getBattleMode()) {
                hero.strike(fighted);
                repaint();
                if (fighted.getAlive()) {
                    fighted.strike(hero);
                }
            }
        }

        // and redraw to have a new picture with the new coordinates
        repaint();
    }
}
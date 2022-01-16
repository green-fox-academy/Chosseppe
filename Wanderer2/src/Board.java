import characters.Boss;
import characters.Character;
import characters.Hero;
import characters.Monster;
import map.Level;

import java.util.Timer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.List;
import java.util.*;


public class Board extends JComponent implements KeyListener {


    // initialization of variables
    Hero hero = new Hero();
    int killedBossCount = 0;
    Level level = new Level();
    List<Character> creatures = new ArrayList<>();
    String point = hero.getGoDown();
    int countMonsters = 0;
    static Timer timer;
    Character fighted;
    Monster monster1 = new Monster(level.getMapLevel());
    Monster monster2 = new Monster(level.getMapLevel());
    Monster monster3 = new Monster(level.getMapLevel());
    Boss boss = new Boss(level.getMapLevel());
    List<Character> deadCreatures = new ArrayList<>();
    int timerCounter;


    public Board() {


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 770));
        setVisible(true);

        timer = new Timer();



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
        if (hero.getCurretnHP() > 0 || hero.getAlive()) {
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
        for (Character character : creatures) {
            if (character instanceof Monster && !character.getAlive() && Objects.equals(hero.getOutputX(), character.getOutputX()) &&
                    Objects.equals(hero.getOutputY(), character.getOutputY())) {
                character.setPointX(-20);
                character.setPointY(-20);
                if(character.getHasKey()){
                    hero.setHasKey(true);
                    character.setHasKey(false);
                }
                if (!deadCreatures.contains(character)) {
                    deadCreatures.add(character);
                }
                hero.levelUp();
            } else if (character instanceof Boss && !character.getAlive() && killedBossCount < 1) {
                character.setPointX(-30);
                character.setPointY(-30);
                killedBossCount++;
                if(character.getHasKey()){
                    hero.setHasKey(true);
                    character.setHasKey(false);
                }
                if (!deadCreatures.contains(character)) {
                    deadCreatures.add(character);
                }
                hero.levelUp();
            }
        }
        if(deadCreatures.size() == creatures.size() || hero.getHasKey()){
            timerCounter = 0;
            hero.setHasKey(false);
            Random random = new Random();
            level.setMapLevel();
            creatures = new ArrayList<>();
            point = hero.getGoDown();
            countMonsters = 0;
            killedBossCount = 0;

            int heroRegen = random.nextInt(0,10);
            if(heroRegen <5) {
                if(hero.getCurretnHP() + (hero.getMaxHP() / 10) <= hero.getMaxHP()) {
                    hero.setCurretnHP(hero.getCurretnHP() + (hero.getMaxHP() / 10));
                }else{
                    int subtract = (hero.getCurretnHP() + (hero.getMaxHP() / 10)) - hero.getMaxHP();
                    hero.setCurretnHP(hero.getCurretnHP() + (hero.getMaxHP() / 10) - subtract);
                }
            }else if(heroRegen > 4 && heroRegen < 9){
                if(hero.getCurretnHP() + (hero.getMaxHP() / 10) <= hero.getMaxHP()) {
                    hero.setCurretnHP(hero.getCurretnHP() + (hero.getMaxHP() / 3));
                }else{
                    int subtract = (hero.getCurretnHP() + (hero.getMaxHP() / 3)) - hero.getMaxHP();
                    hero.setCurretnHP(hero.getCurretnHP() + (hero.getMaxHP() / 3) - subtract);
                }
            }else {
                hero.setCurretnHP( hero.getMaxHP());
            }

            int monster1Level = random.nextInt(0,10);
            if(monster1Level <5) {
                monster1 = new Monster(level.getMapLevel());
            }else if(monster1Level > 4 && monster1Level < 9){
                monster1 = new Monster(level.getMapLevel() + 1);
            }else {
                monster1 = new Monster(level.getMapLevel() + 2);
            }

            int monster2Level = random.nextInt(0,10);
            if(monster2Level <5) {
                monster2 = new Monster(level.getMapLevel());
            }else if(monster2Level > 4 && monster2Level < 9){
                monster2 = new Monster(level.getMapLevel() + 1);
            }else {
                monster2 = new Monster(level.getMapLevel() + 2);
            }
            int monster3Level = random.nextInt(0,10);
            if(monster3Level <5) {
                monster3 = new Monster(level.getMapLevel());
            }else if(monster3Level > 4 && monster3Level < 9){
                monster3 = new Monster(level.getMapLevel() + 1);
            }else {
                monster3 = new Monster(level.getMapLevel() + 2);
            }
            int bossLevel = random.nextInt(0,10);
            if(bossLevel <5) {
                boss = new Boss(level.getMapLevel() + 1);
            }else if(bossLevel > 4 && bossLevel < 9){
                boss = new Boss(level.getMapLevel() + 2);
            }else {
                boss = new Boss(level.getMapLevel() + 3);
            }
            deadCreatures = new ArrayList<>();
            timer = new Timer();

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
            int randomKey = random.nextInt(0, creatures.size());
            hero.setPointX(0);
            hero.setPointY(0);
            for(int increment = 0; increment < creatures.size(); increment++){
                creatures.get(increment).setPointX(0);
                creatures.get(increment).setPointY(0);
                if(increment == randomKey){
                    creatures.get(increment).setHasKey(true);
                }

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

        timer.schedule(new TimerTask() {
            String lastMoveMonster1;
            String lastMoveMonster2;
            String lastMoveMonster3;
            @Override
            public void run() {


                board.timerCounter += 500;

                if(board.timerCounter > 1500) {
                    if (board.monster1.getAlive()) {
                        try {
                            lastMoveMonster1 = board.doMove(board.monster1, lastMoveMonster1);//what you want to do
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    if (board.monster2.getAlive()) {
                        try {
                            lastMoveMonster2 = board.doMove(board.monster2, lastMoveMonster2);//what you want to do
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (board.monster3.getAlive()) {
                        try {
                            lastMoveMonster3 = board.doMove(board.monster3, lastMoveMonster3);//what you want to do
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }, 0, 500);//wait 0 ms before doing the action and do it every 1000ms (1second)

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


        if(hero.getAlive()) {
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

    public String doMove(Character creature, String lastMovement) throws InterruptedException {
        List<String> nextMovement = new ArrayList<>();
        int randomChosenIndexForNextMovement;
        Random random = new Random();
        String negatedLastMovement = null;

        if(hero.getAlive()) {
            if (creature.getBattleMode() && hero.getBattleMode() && hero.getAlive()) {
                creature.strike(hero);
                repaint();
                hero.strike(creature);
                return "fight";

            } else {
                if (creature.getOutputY() != 0) {
                    if (!level.gets(level.get(creature.getOutputY() - 1), creature.getOutputX()).equals(1) && creature.getOutputY() - 1 >= 0) {
                        nextMovement.add("up");
                    }
                }

                if (creature.getOutputY() != 9) {
                    if (!level.gets(level.get(creature.getOutputY() + 1), creature.getOutputX()).equals(1) && creature.getOutputY() + 1 <= 9) {
                        nextMovement.add("down");
                    }
                }
                if (creature.getOutputX() != 0) {
                    if (!level.gets(level.get(creature.getOutputY()), creature.getOutputX() - 1).equals(1) && creature.getOutputX() - 1 >= 0) {
                        nextMovement.add("left");
                    }
                }
                if (creature.getOutputX() != 9) {
                    if (!level.gets(level.get(creature.getOutputY()), creature.getOutputX() + 1).equals(1) && creature.getOutputX() + 1 <= 9) {
                        nextMovement.add("right");
                    }
                }
                if (lastMovement != null) {
                    switch (lastMovement) {
                        case "up" -> negatedLastMovement = "down";
                        case "down" -> negatedLastMovement = "up";
                        case "left" -> negatedLastMovement = "right";
                        case "right" -> negatedLastMovement = "left";
                    }
                }

                if (nextMovement.size() > 1) {
                    nextMovement.remove(negatedLastMovement);
                }

                randomChosenIndexForNextMovement = random.nextInt(0, nextMovement.size());

                Thread.sleep(100);

                switch (nextMovement.get(randomChosenIndexForNextMovement)) {
                    case "up" -> creature.goUp();
                    case "down" -> creature.goDown();
                    case "left" -> creature.goLeft();
                    case "right" -> creature.goRight();
                }
                lastMovement = nextMovement.get(randomChosenIndexForNextMovement);

            }
        }
        return lastMovement;
    }
}
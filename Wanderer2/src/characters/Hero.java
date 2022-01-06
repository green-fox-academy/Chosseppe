package characters;

public class Hero extends Character{


    public Hero(){

        this.maxHP = 20 + (3 * random.nextInt(1, 7));
        this.curretnHP = maxHP;
        this.defendPoints = 2 * random.nextInt(1, 7);
        this.strikePoints = 5 + random.nextInt(1, 7);
        this.level = 1;
        this.combatMode = false;
        this.combatWith = null;
        this.image = "wanderer-java/img/hero-";
        this.goDown = "down.png";
        this.goUp = "up.png";
        this.goLeft = "left.png";
        this.goRight = "right.png";
        this.displayedName = "characters.Hero";
        this.alive = true;
        this.boxX = 0;
        this.boxY = 0;
        this.theX = 0;
        this.theY = 0;


    }

}

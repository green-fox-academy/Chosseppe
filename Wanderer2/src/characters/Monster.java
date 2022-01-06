package characters;

public class Monster extends Character{

    public Monster(int inputLevel) {

        this.maxHP = 2 * inputLevel * random.nextInt(1, 7);
        this.curretnHP = maxHP;
        this.defendPoints = inputLevel/2 * random.nextInt(1, 7);
        this.strikePoints = inputLevel * random.nextInt(1, 7);
        this.level = inputLevel;
        this.combatMode = false;
        this.combatWith = null;
        this.goDown = "wanderer-java/img/skeleton.png";
        this.goUp = "wanderer-java/img/skeleton.png";
        this.goLeft = "wanderer-java/img/skeleton.png";
        this.goRight = "wanderer-java/img/skeleton.png";
        this.displayedName = "Skeleton";
        this.alive = true;
        this.boxX = 0;
        this.boxY = 0;
        this.theX = 0;
        this.theY = 0;
    }
}

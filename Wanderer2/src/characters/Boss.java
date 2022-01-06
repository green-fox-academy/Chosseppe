package characters;

public class Boss extends Character{

    public Boss(int inputLevel){

        this.maxHP = 2 * inputLevel * random.nextInt(1, 7) + random.nextInt(1, 7);
        this.curretnHP = maxHP;
        this.defendPoints = inputLevel/2 * random.nextInt(1, 7) + random.nextInt(1, 7) / 2;
        this.strikePoints = inputLevel * random.nextInt(1, 7) + inputLevel;
        this.level = inputLevel;
        this.combatMode = false;
        this.combatWith = null;
        this.goDown = "wanderer-java/img/boss.png";
        this.goUp = "wanderer-java/img/boss.png";
        this.goLeft = "wanderer-java/img/boss.png";
        this.goRight = "wanderer-java/img/boss.png";
        this.displayedName = "characters.Boss";
        this.alive = true;
        this.boxX = 0;
        this.boxY = 0;
        this.theX = 0;
        this.theY = 0;
    }
}

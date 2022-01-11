package characters;

public class Boss extends Character{

    public Boss(int inputLevel){

        this.maxHP = 2 * inputLevel * random.nextInt(1, 7) + random.nextInt(1, 7);
        this.curretnHP = Math.round(maxHP);
        this.defendPoints = (int) Math.round(inputLevel / 2. * random.nextInt(1, 7) + random.nextInt(1, 7) / 2);
        this.strikePoints = (int) Math.round(inputLevel / 1. * random.nextInt(1, 7) + inputLevel);
        this.level = inputLevel;
        this.image = "wanderer-java/img/boss.png";
        this.displayedName = "Boss";
        this.alive = true;
        this.startingPointX = 0;
        this.startingPointY = 0;
        this.pointX = 0;
        this.pointY = 0;
    }
}

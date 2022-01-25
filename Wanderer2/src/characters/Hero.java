package characters;

public class Hero extends Character{

    String goDown;
    String goUp;
    String goLeft;
    String goRight;

    public Hero(){

        this.maxHP = 20 + (3 * random.nextInt(1, 7));
        this.curretnHP = Math.round(maxHP);
        this.defendPoints = (int) Math.round(2. * random.nextInt(1, 7));
        this.strikePoints = (int) Math.round(5. + random.nextInt(1, 7));
        this.level = 1;
        this.image = "wanderer-java/img/hero-";
        this.goDown = "down.png";
        this.goUp = "up.png";
        this.goLeft = "left.png";
        this.goRight = "right.png";
        this.displayedName = "Hero";
        this.alive = true;
        this.startingPointX = 0;
        this.startingPointY = 0;
        this.pointX = 0;
        this.pointY = 0;


    }

    public String getGoRight() {
        return goRight;
    }

    public String getGoLeft() {
        return goLeft;
    }

    public String getGoDown() {
        return goDown;
    }

    public String getGoUp() {
        return goUp;
    }

    public void levelUp(){
        int temp = random.nextInt(1, 7);
        this.maxHP += temp;
        if(this.curretnHP + temp <= this.maxHP) {
            this.curretnHP += temp;
        }else{
            this.curretnHP = this.maxHP;
        }
        this.defendPoints += random.nextInt(1, 7);
        this.strikePoints += random.nextInt(1, 7);
        this.level++;
    }


}

package characters;

import java.util.Random;

public class Character {

    Random random = new Random();

    Integer level;
    Integer maxHP;
    Integer curretnHP;
    Integer defendPoints;
    Integer strikePoints;
    boolean combatMode;
    String combatWith;
    String image;
    String goDown;
    String goUp;
    String goLeft;
    String goRight;
    String displayedName;
    boolean alive;
    Integer boxX;
    Integer boxY;
    Integer theX;
    Integer theY;
    Integer outputX;
    Integer outputY;

    public void goDown(){
        this.theY++;
    }

    public void goUp(){
        this.theY--;
    }

    public void goLeft() {
        theX--;
    }

    public void goRight() {
        theX++;
    }

    public Integer getBoxX() {
        return boxX;
    }

    public Integer getBoxY() {
        return boxY;
    }
    public void setBoxX(int inputNumber){
        boxX = inputNumber;
    }

    public void setBoxY(int inputNumber){
        boxY = inputNumber;
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

    public String getImage() {
        return image;
    }

    public Integer getTheX() {
        return theX;
    }

    public Integer getTheY() {
        return theY;
    }

    public Integer getOutputX() {
        return outputX;
    }

    public Integer getOutputY() {
        return outputY;
    }

    public void setOutputX(int number){
        outputX = number;
    }

    public void  setOutputY(int number){
        outputY = number;
    }
}
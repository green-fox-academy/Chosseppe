package characters;

import java.util.Random;

public class Character {

    Random random = new Random();

    int level;
    Integer maxHP;
    int curretnHP;
    int defendPoints;
    int strikePoints;
    String image;
    String displayedName;
    boolean alive;
    int startingPointX;
    int startingPointY;
    int pointX;
    int pointY;
    int currentPointX;
    int currentPointY;
    boolean battleMode;
    boolean hasKey;

    public void goDown(){
        this.pointY++;
    }

    public void goUp(){
        this.pointY--;
    }

    public void goLeft() {
        pointX--;
    }

    public void goRight() {
        pointX++;
    }

    public Integer getBoxX() {
        return startingPointX;
    }

    public Integer getBoxY() {
        return startingPointY;
    }
    public void setBoxX(int inputNumber){
        startingPointX = inputNumber;
    }

    public void setBoxY(int inputNumber){
        startingPointY = inputNumber;
    }

    public String getImage() {
        return image;
    }

    public Integer getOutputX() {
        return currentPointX;
    }

    public Integer getOutputY() {
        return currentPointY;
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setOutputX(int number){
        currentPointX = number;
    }

    public void  setOutputY(int number){
        currentPointY = number;
    }

    public Integer getLevel() {
        return level;
    }

    public int getCurretnHP() {
        return curretnHP;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public int getDefendPoints() {
        return defendPoints;
    }

    public int getStrikePoints() {
        return strikePoints;
    }

    public String getDisplayedName() {
        return displayedName;
    }

    public void setCurretnHP(int inputNumber){
        curretnHP = inputNumber;
    }

    public Boolean getAlive(){
        return alive;
    }

    public void setAlive(Boolean newBool){
        alive = newBool;
    }

    public void strike(Character attacked) {
        int randomStrikeValue = 2 * random.nextInt(1, 7) + this.strikePoints;
        if (randomStrikeValue > attacked.defendPoints) {
            attacked.setCurretnHP(attacked.getCurretnHP() + attacked.defendPoints - randomStrikeValue);
            if (attacked.curretnHP <= 0) {
                attacked.setAlive(false);
            }
        }else{
            attacked.setCurretnHP(attacked.getCurretnHP());
        }
    }


    public Boolean getBattleMode(){
        return battleMode;
    }

    public void setBattleMode(boolean bool){
        this.battleMode = bool;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public boolean getHasKey() {
        return hasKey;
    }

    public void setHasKey(boolean hasKey) {
        this.hasKey = hasKey;
    }
}
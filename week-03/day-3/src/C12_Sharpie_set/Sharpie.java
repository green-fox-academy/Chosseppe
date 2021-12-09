package C12_Sharpie_set;

public class Sharpie {

    String color;
    int width;
    int inkAmount = 100;

    public void use(){
        this.inkAmount -= 10;
    }
    public int getInkAmount() {
        return this.inkAmount;
    }
}
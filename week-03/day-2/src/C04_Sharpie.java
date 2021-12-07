public class C04_Sharpie {

    public static class Sharpie{

        String color;
        int width;
        int inkAmount = 100;

        public void use(){
            this.inkAmount -= 10;
        }
    }
}

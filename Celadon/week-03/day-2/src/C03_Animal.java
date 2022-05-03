public class C03_Animal {

    public class Aniaml{

        int hunger = 50;
        int thirst = 50;


        public void eat() {
            this.hunger -= 1;
        }

        public void dring(){
            this.thirst -= 1;
        }

        public void play(){
            this.thirst += 1;
            this.hunger += 1;
        }
    }
}

public class Counter{

    int counter;
    int initial;

    public Counter(int number){
        this.counter = number;
        this.initial = number;
    }

    public Counter(){

    }

    public void add(int number){
        this.counter += number;
    }

    public void add(){
        this.counter +=1;
    }

    public int get(){
        return this.counter;
    }

    public void reset(){
        this.counter = this.initial;
    }
}
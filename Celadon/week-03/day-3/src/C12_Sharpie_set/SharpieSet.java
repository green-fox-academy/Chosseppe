package C12_Sharpie_set;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> listOfSharpies = new ArrayList();

    public void add(Sharpie sharpie){
        this.listOfSharpies.add(sharpie);
    }

    public void countUsable(){
        int counter = 0;
        for(Sharpie sharpi:this.listOfSharpies){
            if(sharpi.getInkAmount() != 0){
                counter ++;
            }
        }
        System.out.println(counter);
    }

    public void removeTrash(){
        this.listOfSharpies.removeIf(sharpi -> sharpi.getInkAmount() == 0);
    }
}

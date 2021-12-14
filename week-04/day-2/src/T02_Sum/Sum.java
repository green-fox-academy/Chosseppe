package T02_Sum;

import java.util.ArrayList;

public class Sum {

    public Integer sum(ArrayList<Integer> input_list){
        if(input_list == null){
            return null;
        }else {
            int count = 0;
            for (int i = 0; i < input_list.size(); i++) {
                count += input_list.get(i);
            }
            return count;
        }
    }
}

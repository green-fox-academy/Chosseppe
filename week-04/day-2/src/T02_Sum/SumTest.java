package T02_Sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void sum() {
        Sum sum = new Sum();

        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        ArrayList<Integer> list3 = new ArrayList();
        ArrayList<Integer> list4 = new ArrayList();

        assertEquals(0, sum.sum(list));

        list2.add(7);
        assertEquals(7, sum.sum(list2));

        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(8);
        assertEquals(30, sum.sum(list3));

        assertEquals(null, sum.sum(null));
    }
}
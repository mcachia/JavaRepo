package HomeWork.BubbleSortAsc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcachia on 22/01/2016.
 */
public class Main {
    public static void main(String[] args) {


        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(5);
        myNumbers.add(1);
        myNumbers.add(4);
        myNumbers.add(2);
        myNumbers.add(8);


        bubbleSort.sort(myNumbers);
    }
}
